
import Interface.Janela;
import Calculos.Financiamento;
import Calculos.Price;
import Calculos.SAC;
import javax.swing.UIManager;

public class Main {
	
	private void calcularDividasCLI() {
		//Financiamento financiamento  = new Price(2378.27, 0, 2, 12, "mensal");
		// Financiamento financiamento  = new Price(320000, 100000, 1, 240, "mensal");
		// Financiamento financiamento  = new Price(10000, 1000, 2, 12, "mensal");
		//financiamento.mostrarInformacoes();
		//financiamento.calcularDivida();
	}
	
	public static void calcularDividaCLI(double precoTotal, double valorDisponivel, double taxaPorcentagem, int nPeriodos, String tipoPeriodoDoUsuario, String sistemaDeAmortizacao) {
		Financiamento financiamento;
		
		switch(sistemaDeAmortizacao.toUpperCase()) {
			case "SAC":
				financiamento = new SAC(precoTotal, valorDisponivel, taxaPorcentagem, nPeriodos, tipoPeriodoDoUsuario);
				break;
			case "PRICE":
				financiamento = new Price(precoTotal, valorDisponivel, taxaPorcentagem, nPeriodos, tipoPeriodoDoUsuario);
				break;
			default:
				financiamento = null;
				System.out.println("Erro: Sistema de amortização inválido");
		}
		
		financiamento.mostrarInformacoes(true);
		financiamento.calcularDivida();
	}
	
	public static void definirTema(String tema) {
		String temaSelecionado;
		
		switch(tema) {
			case "system":
			default:
				temaSelecionado = UIManager.getSystemLookAndFeelClassName();
		}
		
		try { 
			UIManager.setLookAndFeel(temaSelecionado);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		definirTema("system");
		Janela j = new Janela();
		//calcularDividaCLI(2378.27, 10.0, 2, 100, "mensal", "Price");
	}
}
