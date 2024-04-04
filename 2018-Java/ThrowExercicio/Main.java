
// Aluno: Rhian Luis Garcia Moraes
// Data: 09/10/2018

import javax.swing.JOptionPane;

public class Main {
	
	// Métodos estáticos para simplificar a mostra de mensagens
	public static String pergunta(String pergunta) {
		return JOptionPane.showInputDialog(pergunta);	
	}
	
	public static void mensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
	public static void main(String[] args) throws NumberFormatException {
		// Exercício 1
		String entrada = pergunta("1) Digite um número. ");	
		
		// Exercício 2
		mensagem("2) A exceção 'NumberFormatException' é uma exceção que ocorre quando um número é inválido, ou seja, um número que o Java não reconhece ou que não é um número de verdade\n"
				+ "Os casos mais comuns desse erro ocorrem quando se tenta atribuir uma String a um número, fazendo-o irreconhecível para o Java.");
		
		// Exercício 3
		mensagem("3) Isso pode ocorrer em situações como por exemplo, tentar escrever 'algum_texto' (texto de exemplo) em uma entrada que deve receber apenas números.");
		
		// Exercício 4
		int numero;
		try { // Tentar transformar a String recebida pelo usuário em um número inteiro
			numero = Integer.parseInt(entrada);
			mensagem("4) Número válido."); // Se der certo, mostrar esta mensagem
		} catch(NumberFormatException e) { // Se der errado por conta da invalidez do número
			
			// Esta será a mensagem de erro
			String erro = "4) Número invalido.\n";
			erro += "Mensagem do erro:\n";
			erro += e.getMessage();
			
			mensagem(erro); // Mostrar a mensagem de erro na tela
			throw new NumberFormatException(erro); // Declarar que houve um erro na execução do código
		}
	}
}
