package Calculos;

public class Price extends Financiamento {

	private int parcelaConstante;
	
	public Price(double precoTotal, double valorDisponivel, double taxaPorcentagem, int nPeriodos, String tipoPeriodoDoUsuario) {
		super(precoTotal, valorDisponivel, taxaPorcentagem, nPeriodos, tipoPeriodoDoUsuario);
		amortizacao.add(0);
		
		parcelaConstante = Formato.arredondarDouble(
				(taxaDecimal * valorAFinanciar) /
				(1 - (Math.pow((1 + taxaDecimal), -nPeriodos))),
				false
		);
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
		
		for (int i = 1; i <= periodo; i++) {
			// Adicionando a parcela constante no ArrayList
			parcela.add(parcelaConstante);
			
			// Calculando os juros
			juros.add(
					Formato.arredondarDouble(
							divida.get(i - 1) * taxaDecimal,
							false
					)
			);
			
			// Calculando a amortização
			amortizacao.add(
					parcela.get(i) - juros.get(i)
			);
			
			// Calculando a nova dívida
			divida.add(
					divida.get(i - 1) - amortizacao.get(i)
			);
			
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
