
import javax.swing.JButton;

public class Botao extends JButton {
	public Botao(String texto, int x, int y, int largura, int altura) {
		super(texto);
		setBounds(x, y, largura, altura);
	}
	
	public Botao(String texto, int largura, int altura) {
		this(texto, 0, 0, largura, altura);
	}
	
	public Botao(int x, int y, int largura, int altura) {
		this("Botão", x, y, largura, altura);
	}
	
	public Botao(int largura, int altura) {
		this("Botão", largura, altura);
	}
	
	public Botao(String texto) {
		this(texto, 100, 50);
	}
}
