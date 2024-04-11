package Calculos;


import java.util.ArrayList;
import java.util.HashMap;

public abstract class Financiamento {
	private int precoTotal;
	
	private int valorDeEntrada;
	protected int valorAFinanciar;
	
	protected int nPeriodos;
	
	private double taxaPorcentagem;
	protected double taxaDecimal;
	
	
	protected HashMap<String, String> tipoPeriodo;
	
	protected ArrayList<Integer> amortizacao;
	
	
	// ArrayList da dívida, do juros e da parcela, onde o índice refere-se a um determinado período
	protected ArrayList<Integer> divida;
	protected ArrayList<Integer> juros;
	protected ArrayList<Integer> parcela;
	
	public Financiamento(double precoTotal, double valorDisponivel, double taxaPorcentagem, int nPeriodos, String tipoPeriodoDoUsuario) {
		this.precoTotal = Formato.arredondarDouble(precoTotal);
		
		this.valorDeEntrada = Formato.arredondarDouble(valorDisponivel);
		
		this.valorAFinanciar = this.precoTotal - this.valorDeEntrada;
		
		this.taxaPorcentagem = taxaPorcentagem;
		this.taxaDecimal = taxaPorcentagem / 100;
		
		this.nPeriodos = nPeriodos;
		
		this.tipoPeriodo = Formato.setPeriodos(tipoPeriodoDoUsuario);
		
		// Inicializando os valores que serão calculados
		amortizacao = new ArrayList(10);
		// Amortização começa com zero
		
		divida = new ArrayList(10);
		divida.add(valorAFinanciar);
		
		juros = new ArrayList(10);
		juros.add(0);
		
		parcela = new ArrayList(10);
		parcela.add(0);
	}
	
	public void calcularDivida(boolean mostrarNaTela) {
		calcularDivida(nPeriodos, mostrarNaTela);
	}
	
	public void calcularDivida() {
		calcularDivida(nPeriodos, true);
	}
	
	public void calcularDivida(int periodo) {
		calcularDivida(periodo, true);
	}
	
	public abstract void calcularDivida(int periodo, boolean mostrarNaTela);
	
	public void mostrarInformacoes(boolean mostrarCifrao) {
		System.out.println("Informações do financiamento:");
		System.out.println("Valor total a se pagar: " + Formato.dinheiro(precoTotal, mostrarCifrao));
		System.out.println("Valor de entrada: " + Formato.dinheiro(valorDeEntrada, mostrarCifrao));
		System.out.println("Valor a ser financiado: " + Formato.dinheiro(valorAFinanciar, mostrarCifrao));
		System.out.println("Taxa: " + taxaPorcentagem + "% " + tipoPeriodo.get("adjetivo"));
		System.out.println("Período de " + nPeriodos + " " + tipoPeriodo.get("plural"));
	}
	
	// Getters

	public int getnPeriodos() {
		return nPeriodos;
	}

	public double getTaxaPorcentagem() {
		return taxaPorcentagem;
	}

	public HashMap<String, String> getTipoPeriodo() {
		return tipoPeriodo;
	}

	public String getAmortizacaoFormatada(int i, boolean mostrarCifrao) {
		return Formato.dinheiro(amortizacao.get(i), mostrarCifrao);
	}

	public String getDividaFormatada(int i, boolean mostrarCifrao) {
		return Formato.dinheiro(divida.get(i), mostrarCifrao);
	}

	public String getJurosFormatados(int i, boolean mostrarCifrao) {
		return Formato.dinheiro(juros.get(i), mostrarCifrao);
	}

	public String getParcelaFormatada(int i, boolean mostrarCifrao) {
		return Formato.dinheiro(parcela.get(i), mostrarCifrao);
	}
}
