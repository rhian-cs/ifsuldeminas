
package Interface;

import Calculos.Financiamento;
import Calculos.Formato;
import Calculos.Price;
import Calculos.SAC;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PainelSelecao extends Painel {
	
	private Financiamento financiamentoASeCalcular;
	
	private double financiamentoPadraoValorTotal;
	private double financiamentoPadraoValorDisponivel;
	private double financiamentoPadraoTaxaPorcentagem;
	private int financiamentoPadraoNPeriodos;
	
	// Componentes do painel
	
	private JLabel textoValorTotal;
	private JTextField campoValorTotal;
	
	private JLabel textoValorDisponivel;
	private JTextField campoValorDisponivel;
	
	private JLabel textoPorcentagemInteira;
	private JTextField campoPorcentagemInteira;
	
	private JLabel textoNPeriodos;
	private JTextField campoNPeriodos;
	
	private JLabel textoTipoPeriodos;
	private JComboBox<String> comboBoxTipoPeriodos;
	
	private JLabel textoSistemaDeAmortizacao;
	private ButtonGroup sistemasDeAmortizacao;
	private JRadioButton sac;
	private JRadioButton price;
	
	private JLabel textoMostrarCifrao;
	private JCheckBox checkBoxMostrarCifrao;
	
	private JButton botaoCalcular;
	
	private void inicializarAtributosFinanciamento() {
		financiamentoPadraoValorTotal = 320000;
		financiamentoPadraoValorDisponivel = 100000;
		financiamentoPadraoTaxaPorcentagem = 1;
		financiamentoPadraoNPeriodos = 240;
	}
	
	@Override
	public void inicializarComponentes() {
		
		inicializarAtributosFinanciamento();
		
		textoValorTotal = new JLabel("Valor Total:");
		//add(textoValorTotal);
		campoValorTotal = new JTextField(Double.toString(financiamentoPadraoValorTotal));
		//add(campoValorTotal);
		
		textoValorDisponivel = new JLabel("Valor de Entrada:");
		//add(textoValorDisponivel);
		campoValorDisponivel = new JTextField(Double.toString(financiamentoPadraoValorDisponivel));
		//add(campoValorDisponivel);
		
		textoPorcentagemInteira = new JLabel("Porcentagem da Taxa:");
		//add(textoPorcentagemInteira);
		campoPorcentagemInteira = new JTextField(Double.toString(financiamentoPadraoTaxaPorcentagem));
		//add(campoPorcentagemInteira);
		
		textoNPeriodos = new JLabel("Número de Períodos:");
		//add(textoNPeriodos);
		campoNPeriodos = new JTextField(Integer.toString(financiamentoPadraoNPeriodos));
		//add(campoNPeriodos);
		
		textoTipoPeriodos = new JLabel("Tipo de períodos:");
		//add(textoTipoPeriodos);
		
		String[] tiposPeriodo = {
			"Diário",
			"Mensal",
			"Semestral",
			"Anual"
		};
		comboBoxTipoPeriodos = new JComboBox(tiposPeriodo);
		comboBoxTipoPeriodos.setSelectedIndex(Formato.indexOfArray(tiposPeriodo, "Mensal"));
		//add(comboBoxTipoPeriodos);
		
		textoSistemaDeAmortizacao = new JLabel("Sistema de Amortização: ");
		
		sistemasDeAmortizacao = new ButtonGroup();
		sac = new JRadioButton("SAC");
		price = new JRadioButton("Price");
		sac.setSelected(true);
		
		sistemasDeAmortizacao.add(sac);
		sistemasDeAmortizacao.add(price);
		//add(sac);
		//add(price);
		
		textoMostrarCifrao = new JLabel("Mostrar cifrão (R$)?");
		//add(textoMostrarCifrao);
		checkBoxMostrarCifrao = new JCheckBox();
		checkBoxMostrarCifrao.setSelected(false);
		//add(checkBoxMostrarCifrao);
		
		botaoCalcular = criarBotao("Calcular");
		
		// Posicionando os Componentes
		
		GroupLayout gl = new GroupLayout(this);
		
		gl.setAutoCreateGaps(true);
		gl.setAutoCreateContainerGaps(true);
		
		gl.setVerticalGroup(
			gl.createSequentialGroup()
				.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(textoValorTotal)
					.addComponent(campoValorTotal))
				.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(textoValorDisponivel)
					.addComponent(campoValorDisponivel))
				.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(textoPorcentagemInteira)
					.addComponent(campoPorcentagemInteira))
				.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(textoNPeriodos)
					.addComponent(campoNPeriodos))
				.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(textoTipoPeriodos)
					.addComponent(comboBoxTipoPeriodos))
				.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(textoSistemaDeAmortizacao)
					.addComponent(sac)
					.addComponent(price))
				.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(textoMostrarCifrao)
					.addComponent(checkBoxMostrarCifrao))
				.addGap(10)
				.addComponent(botaoCalcular)
		);
		gl.setHorizontalGroup(
			gl.createSequentialGroup()
				.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(textoValorTotal)
					.addComponent(textoValorDisponivel)
					.addComponent(textoPorcentagemInteira)
					.addComponent(textoNPeriodos)
					.addComponent(textoTipoPeriodos)
					.addComponent(textoSistemaDeAmortizacao)
					.addComponent(textoMostrarCifrao))
				.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(campoValorTotal)
					.addComponent(campoValorDisponivel)
					.addComponent(campoPorcentagemInteira)
					.addComponent(campoNPeriodos)
					.addComponent(comboBoxTipoPeriodos)
					.addComponent(textoSistemaDeAmortizacao)
					.addGroup(gl.createSequentialGroup()
						.addComponent(sac)
						.addComponent(price))
					.addComponent(checkBoxMostrarCifrao)
					.addComponent(botaoCalcular))
		);
		
		setLayout(gl);
	}
	
	
	public PainelSelecao(Janela janela) {
		super(janela);
		inicializarComponentes();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		switch(ae.getActionCommand()) {
			case "Calcular":
				boolean erro = false;
				
				double precoTotal = 0;
				double valorDisponivel = 0;
				double taxaPorcentagem = 0;
				int nPeriodos = 0;
				String tipoPeriodoDoUsuario = null;
				
				if(!Formato.verificarNumeroValido(campoValorTotal.getText())) {
					JOptionPane.showMessageDialog(this, "Erro: Número do Preço Total inválido", "Erro", JOptionPane.ERROR_MESSAGE);
					erro = true;
				} else {
					precoTotal = Double.parseDouble(campoValorTotal.getText());
				}
				if(!Formato.verificarNumeroValido(campoValorDisponivel.getText())) {
					JOptionPane.showMessageDialog(this, "Erro: Número do Valor Disponível inválido", "Erro", JOptionPane.ERROR_MESSAGE);
					erro = true;
				} else {
					valorDisponivel = Double.parseDouble(campoValorDisponivel.getText());
				}
				if(!Formato.verificarNumeroValido(campoPorcentagemInteira.getText())) {
					JOptionPane.showMessageDialog(this, "Erro: Porcentagem da Taxa inválida", "Erro", JOptionPane.ERROR_MESSAGE);
					erro = true;
				} else {
					taxaPorcentagem = Double.parseDouble(campoPorcentagemInteira.getText());
				}
				if(!Formato.verificarInteiroValido(campoNPeriodos.getText())) {
					JOptionPane.showMessageDialog(this, "Erro: Número de períodos inválido", "Erro", JOptionPane.ERROR_MESSAGE);
					erro = true;
				} else {
					nPeriodos = Integer.parseInt(campoNPeriodos.getText());
				}
				tipoPeriodoDoUsuario = comboBoxTipoPeriodos.getSelectedItem().toString();
				if(!erro) {
					if (sac.isSelected()) {
						financiamentoASeCalcular = new SAC(precoTotal, valorDisponivel, taxaPorcentagem, nPeriodos,  tipoPeriodoDoUsuario);
					} else {
						if (price.isSelected()) {
							financiamentoASeCalcular = new Price(precoTotal, valorDisponivel, taxaPorcentagem, nPeriodos,  tipoPeriodoDoUsuario);
						}
					}
					janela.definirPainelResultados(financiamentoASeCalcular, checkBoxMostrarCifrao.isSelected());
				}
		}
	}
}
