
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

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
	
	public Janela() {
		this("Janela");
	}
	
	public Janela(int largura, int altura) {
		this("Janela", -1, -1, largura, altura);
	}
	
	public Janela(int x, int y, int largura, int altura) {
		this("Janela", x, y , largura, altura);
	}
	
	public void addImage(String path) {
		JLabel imagem = It.imagem(path, this, "EXPAND_FULLSCREEN");
		this.add(imagem);
		this.repaint();
	}
	
	public void addGroup(AbstractButton[] botoes) {
		ButtonGroup grupo = new ButtonGroup();
		for(AbstractButton botao : botoes) {
			grupo.add(botao);
			this.add(botao);
		}
	}
	
	public void addRadioGroup(String[] nomes) {
		JRadioButton[] botoes = new JRadioButton[nomes.length];
		for(int i = 0; i < nomes.length; i++) {
			String nomeDoBotao = nomes[i];
			botoes[i] = new JRadioButton(nomeDoBotao);
		}
		this.addGroup(botoes);
	}
}
