
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Interface extends JFrame {
	
	// Construtor da classe Interface
	// Argumentos: Largura e altura da tela, e o nome da cor que será mostrado no título
	public Interface(int largura, int altura, String nomeDaCor) {
		super("Janela " + nomeDaCor); // Chamando o construtor da superclasse e atribuindo o título "Janela " + o nome da cor
		setResizable(false); // Tela não-redimensionável
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Tela que fecha com o X
		setVisible(true); // Tela visível
		setSize(largura, altura); // Tamanho como pedido
	}
	
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
	
	public static void main(String[] args) {
		Interface.mensagem("Criaremos agora uma interface.");
		
		// Vetor que contém as opções da cor
		String[] opcoesDeCor = {"Preta", "Vermelha", "Amarela", "Verde", "Azul"};
		
		// O número da cor escolhida
		int numCor = Interface.perguntaComOpcoes("Escolha a cor", opcoesDeCor);
		
		// O nome da cor é a posição escolhida (0 a 4) do vetor com as opções de cor
		String nomeDaCor = opcoesDeCor[numCor];
		
		Color cor = Color.black; // Criando um objeto cor da classe Color e colocando o valor padrão preto.
		
		// Atribuindo a cor correta ao objeto
		switch(numCor) {
			case 0:
				cor = Color.black;
				break;
			case 1:
				cor = Color.red;
				break;
			case 2:
				cor = Color.yellow;
				break;
			case 3:
				cor = Color.green;
				break;
			case 4:
				cor = Color.blue;
				break;
		}
		
		// Perguntando a largura e a altura da janela
		int largura = Integer.parseInt(perguntaComEntrada("Digite o qual a largura da janela."));
		int altura = Integer.parseInt(perguntaComEntrada("Digite o qual a altura da janela."));
		
		// Criando a janela
		Interface janela = new Interface(largura, altura, nomeDaCor);
		
		// Criando o painel
		Painel fundo = new Painel(cor);
		
		// Colocando o painel na janela
		janela.add(fundo);
	}
}