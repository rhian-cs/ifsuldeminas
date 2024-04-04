
import java.util.ArrayList;
import java.util.Iterator;

public abstract class ContaBancaria {
	protected String nomeDoCorrentista;
	protected double saldo;
	protected boolean isContaEspecial;
	
	public void retirar(double valor) {
		boolean transacaoEfetuada = false;
		if(valor > 0) { // O valor retirado deve ser positivo
			if(isContaEspecial) { // Se a conta for especial
				saldo -= valor; // Efetuar a transação de qualquer jeito
				transacaoEfetuada = true; // Transação será com sucesso
			}
			else { // Se a conta NÂO for especial
				if(saldo - valor >= 0) { // Efetuar a transação somente se o saldo não ficar negativo após a transação
					saldo -= valor;
					transacaoEfetuada = true; // Transação será com sucesso
				}
			}
		}
		if(transacaoEfetuada) { // Se a transação obtiver sucesso
			// Mensagem de sucesso
			System.out.println("Retirada de R$" + valor + " efetuada com sucesso.");
		}
		else { // Caso contrário
			// Mensagem de erro
			System.out.println("Erro ao efetuar a transação.");
		}
	}
	
	public void depositar(double valor) {
		if(valor > 0) { // O valor depositado deve ser positivo
			saldo += valor; // Efetuar a transação
		}
		else {
			// Mensagem de erro
			System.out.println("Erro ao efetuar a transação.");
		}
	}
	
	// Método abstrado para mostrar dados, que não possui funcionalidade nesta classe (Superclasse)
	public abstract void mostrarDados();
	
	// Método Main
	public static void main(String[] args) {
		ArrayList<ContaBancaria> contas = new ArrayList();
		contas.add(new ContaBancariaNormal("Master Washington", 10, true));
		contas.add(new ContaBancariaNormal("Zé Zin", 20, false));
		contas.add(new ContaBancariaSimples("Haggar Silveira"));
		
		for (int i = 0; i < contas.size(); i++) {
			ContaBancaria conta = contas.get(i);
			conta.mostrarDados();
			
			System.out.println("Depositando 10 reais...");
			conta.depositar(10);
			
			conta.mostrarDados();
			System.out.println("");
		}
	}
}
