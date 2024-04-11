
package Interface;

import Calculos.Financiamento;
import Calculos.Formato;
import Calculos.Price;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PainelResultados extends Painel {
	
	private Financiamento financiamento;
	
	// Componentes do Painel
	private JTable tabelaResultado;
	private JScrollPane painelDeRolagem;
	
	private JButton botaoVoltar;
	private boolean mostrarCifrao;
	
	private void criarTabela() {
		
		financiamento.calcularDivida(false);
		
		String tipoPeriodo = Formato.primeiraLetraMaiuscula(financiamento.getTipoPeriodo().get("singular"));
		
		String[] cabecalho = {tipoPeriodo, "Dívida", "Amortização", "Juros", "Parcela"};
		String[][] conteudo = new String[financiamento.getnPeriodos()][financiamento.getnPeriodos()];
		
		for (int n = 0; n < financiamento.getnPeriodos(); n++) {
			conteudo[n][Formato.indexOfArray(cabecalho, tipoPeriodo)] = n + "";
			conteudo[n][Formato.indexOfArray(cabecalho, "Dívida")] = financiamento.getDividaFormatada(n, mostrarCifrao);
			conteudo[n][Formato.indexOfArray(cabecalho, "Amortização")] = financiamento.getAmortizacaoFormatada(n, mostrarCifrao);
			conteudo[n][Formato.indexOfArray(cabecalho, "Juros")] = financiamento.getJurosFormatados(n, mostrarCifrao);
			conteudo[n][Formato.indexOfArray(cabecalho, "Parcela")] = financiamento.getParcelaFormatada(n, mostrarCifrao);
		}
		
		tabelaResultado = new TabelaCentralizada(conteudo, cabecalho);
		
		//tabelaResultado.setSize(Janela.getLargura() - 20, Janela.getAltura() - 20);
	}
	
	public PainelResultados(Janela janela, Financiamento financiamento, boolean mostrarCifrao) {
		super(janela);
		
		this.financiamento = financiamento;
		this.mostrarCifrao = mostrarCifrao;
		
		inicializarComponentes();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		switch(ae.getActionCommand()) {
			case "Voltar":
				janela.definirPainelSelecao();
		}
	}

	public void inicializarComponentes() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.financiamento = financiamento;
		criarTabela();
		
		painelDeRolagem = new JScrollPane(tabelaResultado);
		add(painelDeRolagem);
		
		botaoVoltar = criarBotao("Voltar", true);
		botaoVoltar.setAlignmentX(Component.CENTER_ALIGNMENT); // Alinhando este botão ao centro da tela
	}
}
