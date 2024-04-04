
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ChecarCampoNome implements DocumentListener {
	public JTextArea campoNome;
	
	public void mudarCorDoCampo(String hexColor) {
		campoNome.setBackground(Color.decode(hexColor));
	}
	
	// Construtor
	public ChecarCampoNome() {
		campoNome = new JTextArea();
		campoNome.setBounds(0, 0, 640, 360);
		mudarCorDoCampo("#4286f4");
		campoNome.setVisible(true);
		campoNome.getDocument().addDocumentListener(this);
	}
	
	public boolean temAlgumNumero(String texto) {
		for (int i = 0; i < texto.length(); i++) { // Para cada caractere dessa string
			String letra = texto.substring(i, i+1); // pegar um único caracter e armazenar nesta variável
			try {
				// Tentar transformar em um inteiro
				int num = Integer.parseInt(letra); // Se der certo, é um número
				return true; // Então retornar true
			} catch(NumberFormatException err) { // Se der errado
				// É uma letra, não fazer nada
			}
		}
		// Se de todos os caracteres não tiver um número, então retornar false
		return false;
	}
	
	@Override
	public void insertUpdate(DocumentEvent e) { // Se uma nova entrada é inserida
		String texto = campoNome.getText(); // O texto é o texto do campo
		if(temAlgumNumero(texto)) { // Se tem algum número no texto
			mudarCorDoCampo("#df1010"); // Fica vermelho
		} else { // Se não tiver nenhum número
			mudarCorDoCampo("#4286f4"); // Fica azul
		}
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		insertUpdate(e); // Faz o mesmo que se uma nova entrada for inserida
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		insertUpdate(e); // Faz o mesmo que se uma nova entrada for inserida
	}
	
	public static void main(String[] args) {
		// Criação do Objeto para checar
		ChecarCampoNome ch = new ChecarCampoNome();
		
		// Criação da Janela e adição do campo à janela
		JFrame j = new JFrame();
		j.setVisible(true);
		j.setLayout(null);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(640, 360);
		
		// Adicionando o campo e atualizando
		j.add(ch.campoNome);
		j.repaint();
	}
}
