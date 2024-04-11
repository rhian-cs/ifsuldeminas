package Calculos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adm
 */
public class SAC extends Financiamento{
	
	private int amortizacaoConstante; // Amortização Constante
	
	public SAC(double precoTotal, double valorDisponivel, double taxaPorcentagem, int nPeriodos, String tipoPeriodoDoUsuario) {
		super(precoTotal, valorDisponivel, taxaPorcentagem, nPeriodos, tipoPeriodoDoUsuario);
		amortizacaoConstante = new Double(Math.floor(valorAFinanciar / nPeriodos) + 1).intValue(); // Arredondando a amortização para cima
		amortizacao.add(0);
	}
	
	@Override
	public void calcularDivida(int periodo, boolean mostrarNaTela) {
		String delimitacao = "\t\t";
		
		// Mostrando o cabeçalho
		if(mostrarNaTela) {
			System.out.println(
					Formato.primeiraLetraMaiuscula(tipoPeriodo.get("singular")) +
					delimitacao + "Dívida" +
					delimitacao + "Amortização" +
					delimitacao + "Juros" +
					delimitacao + "Parcela"
			);
			int mesInicial = 0;
			System.out.println(
					mesInicial + 
					delimitacao + Formato.dinheiro(divida.get(mesInicial)) + 
					delimitacao + "-" + 
					delimitacao + "-" + 
					delimitacao + "-"
			);
		}
		
		// Realizando os cálculos
		for (int i = 1; i <= periodo; i++) {
			
			// Calculando a Dívida
			int dividaAnterior = divida.get(i - 1);
			int dividaAtual;
			int amortizacaoAtual;
			// Se o valor da dívida for menor que a amortização, a dívida acabou
			if (dividaAnterior < amortizacaoConstante) {
				amortizacaoAtual = dividaAnterior; // Definir o valor a ser utilizado como amortização igual à dívida
			} else {
				amortizacaoAtual = amortizacaoConstante;
			}
			amortizacao.add(amortizacaoAtual);
			
			dividaAtual = dividaAnterior - amortizacaoAtual;
			divida.add(dividaAtual);
			
			// Calculando o valor do juros
			int jurosAtual = (int) Math.round(dividaAnterior * taxaDecimal);
			juros.add(jurosAtual);
			
			// Calculando o valor da parcela
			int parcelaAtual = amortizacaoAtual + jurosAtual;
			parcela.add(parcelaAtual);
			
			// Mostrando os valores na tela
			if(mostrarNaTela) {
				System.out.println(
						i + 
						delimitacao + Formato.dinheiro(divida.get(i)) + 
						delimitacao + Formato.dinheiro(amortizacao.get(i)) + 
						delimitacao + Formato.dinheiro(juros.get(i)) + 
						delimitacao + Formato.dinheiro(parcela.get(i)));
			}
		}
	}
}
