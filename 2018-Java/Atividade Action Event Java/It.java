import java.awt.Color;
import java.awt.Component;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class It {
	public static void erro(String msg) {
		ImageIcon ico = new ImageIcon("src/bravoface.png", "Erro");
		JOptionPane.showMessageDialog(null, msg, "Erro", 0, ico);
	}
	
	public static String pergunta(String msg) {
		return JOptionPane.showInputDialog(null, msg, "Mensagem", JOptionPane.QUESTION_MESSAGE);
	}
	
	public static void mensagem(String msg) {
		JOptionPane.showMessageDialog(null, msg, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static int perguntaInt(String msg) {
		return Integer.parseInt(pergunta(msg));
	}
	
	public static JLabel textMessage(String mensagem, int x, int y, int largura, int altura) {
		JLabel texto = new JLabel(mensagem);
		texto.setBounds(x, y, largura, altura);
		return texto;
	}
	
	public static JLabel textMessage(String mensagem) {
		return textMessage(mensagem, 0, 0, 200, 20);
	}
	
	public static JTextField textInput(String titulo, int x, int y, int largura, int altura) {
		JTextField entrada = new JTextField();
		entrada.setText(titulo);
		entrada.setBounds(x, y, largura, altura);
		return entrada;
	}
	
	public static JTextField textInput(String titulo) {
		return textInput(titulo, 0, 0, 200, 20);
	}
	
	public static JTextField textInput() {
		return textInput("");
	}
	
	public static JLabel imagem(String path, Component component, int x, int y, int largura, int altura) {
		ImageIcon icon = new ImageIcon(component.getClass().getResource(path));
		
		JLabel label = new JLabel();
		label.setIcon(icon);
		
		label.setVisible(true);
		label.setBounds(x, y, largura, altura);
		
		return label;
	}
	
	public static JLabel imagem(String path, Component component, String option) {
		int x = 0;
		int y = 0;
		int largura = component.getWidth();
		int altura = component.getHeight();
		
		if(option == "EXPAND_FULLSCREEN") {
			x = 0;
			y = 0;
			largura = component.getWidth();
			altura = component.getHeight();
		}
		
		return imagem(path, component, x, y, largura, altura);
	}
	
	public static JButton botao(String texto, int x, int y, int largura, int altura) {
		JButton botao = new JButton(texto);
		botao.setBounds(x, y, largura, altura);
		return botao;
	}
	
	public static JButton botao(String texto, int largura, int altura) {
		return botao(texto, 0, 0, largura, altura);
	}
	
	public static JButton botao(int x, int y, int largura, int altura) {
		return botao("Botão", x, y, largura, altura);
	}
	
	public static JButton botao(int largura, int altura) {
		return botao("Botão", largura, altura);
	}
	
	public static JButton botao(String texto) {
		return botao(texto, 100, 50);
	}
	
	public static JPanel painel(String cor) {
		JPanel painel = new JPanel();
		Color color; // Objeto cor baseado na nossa cor
		
		// Definindo a cor com base na string passada no argumento
		switch(cor.toLowerCase()) {
			case "vermelho":
				color = Color.red;
				break;
			case "verde":
				color = Color.green;
				break;
			case "azul":
				color = Color.blue;
				break;
			case "preto":
				color = Color.black;
				break;
			case "branco":
				color = Color.white;
			default:
				color = Color.black;
		}
        painel.setBackground(color); // Definindo o plano de fundo do painel a cor selecionada
		return painel;
    }
	
	public static JPanel painel(Color cor) {
		JPanel painel = new JPanel();
		painel.setBackground(cor);
		return painel;
	}
	
	public static JRadioButton botaoRadio(String texto) {
		return new JRadioButton(texto);
	}
	
	public static ButtonGroup grupoDeBotoes() {
		return new ButtonGroup();
	}
	
	public static JComboBox comboBox(Object[] opcoes) {
		JComboBox combo = new JComboBox();
		for(Object opcao : opcoes) {
			combo.addItem(opcao);
		}
		return combo;
	}
	
	public static JComboBox combo() {
		JComboBox combo = new JComboBox();
		return combo;
	}
}
