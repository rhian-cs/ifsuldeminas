
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela extends JFrame{
    int largura;
    int altura;

    public Janela(String titulo, int x, int y, int largura, int altura) {
        super(titulo);
        this.largura = largura;
        this.altura = altura;
        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        setVisible(true);
		setLayout(null);
		
		if(x < 0 || y < 0) {
			setLocationRelativeTo(null);
			setSize(largura, altura);
		} else {
			setBounds(x, y, largura, altura);
		}
		
    }
	
	public Janela(String titulo, int largura, int altura) {
		this(titulo, -1, -1, largura, altura);
	}
	
	public Janela(String titulo) {
		this(titulo, -1, -1, 600, 300);
	}
	
	public Janela(int largura, int altura) {
		this("Janela", -1, -1, largura, altura);
	}
	
	public Janela(int x, int y, int largura, int altura) {
		this("Janela", x, y , largura, altura);
	}
	
	public void addImage(String path) {
		JLabel imagem = Interface.imagem(path, this, "EXPAND_FULLSCREEN");
		this.add(imagem);
		this.repaint();
	}
}
