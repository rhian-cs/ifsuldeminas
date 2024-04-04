
import javax.swing.JOptionPane;

// Classe onde serão armazenados métodos estáticos para facilitar o uso da interface
public class Interface {
	
	// Método que mostra uma mensagem simples na tela, recebe qualquer coisa como parâmetro
	public static void mensagem(Object msg) {
		String str = msg + ""; // Transforma o parâmetro em uma String
		JOptionPane.showMessageDialog(null, str); // Mostra essa String na tela
	}
	
	// Método que mostra uma mensagem de erro que possui o título "Erro", recebe qualquer coisa como parâmetro
	public static void mensagemDeErro(Object msg) {
		String str = msg + "";  // Transforma o parâmetro em uma String
		JOptionPane.showMessageDialog(null, str, "Erro", JOptionPane.ERROR_MESSAGE); // Mostra essa String na tela, com o ícone de erro
	}
	
	// Método que mostra uma mensagem e diversos botões de escolha.
	// O primeiro parâmetro é a mensagem
	// Todos os outros parâmetros são as opções que o usuário pode escolher
	public static int perguntaComOpcoes(String str, String... opcoes) {
		int tipoDeOpcoes = JOptionPane.YES_NO_CANCEL_OPTION;
		int tipoDeMensagem = JOptionPane.QUESTION_MESSAGE;
		
		int value = JOptionPane.showOptionDialog(
				null, 
				str, 
				"Selecione a Opção", 
				tipoDeOpcoes, 
				tipoDeMensagem, 
				null, 
				opcoes, 
				null);
		return value; // Retorna um inteiro de 0 até N - 1 (N sendo o número total de opções)
	}
	
	// Método que mostra uma mensagem e apenas pode se escolher "Sim" ou "Não".
	// O primeiro parâmetro é a mensagem
	public static boolean perguntaBooleana(String str) {
		int tipoDeOpcoes = JOptionPane.YES_NO_CANCEL_OPTION;
		int tipoDeMensagem = JOptionPane.QUESTION_MESSAGE;
		String[] opcoes = {"Sim", "Não"};
		
		int value = JOptionPane.showOptionDialog(
				null, 
				str, 
				"Selecione a Opção", 
				tipoDeOpcoes, 
				tipoDeMensagem, 
				null, 
				opcoes, 
				null);
		return value == 0; // Retorna um valor booleano, true para Sim e false para Não
	}
	
	// Pergunta com um campo de preenchimento pelo usuário, recebe uma mensagem como parâmetro
	public static String perguntaComEntrada(String msg) {
		// Retorna uma String com a resposta do usuário
		return JOptionPane.showInputDialog(
				null,
				msg, 
				"Digite no campo abaixo:", 
				JOptionPane.QUESTION_MESSAGE);
	}
}