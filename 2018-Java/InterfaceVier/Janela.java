
import javax.swing.JFrame;

public class Janela extends JFrame{
    int largura;
    int altura;

    private Janela(int largura, int altura, boolean resizable) {
        super("Janela");
        this.largura = largura;
        this.altura = altura;
        setResizable(resizable);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        setVisible(true);
        setSize(this.largura, this.altura);
    }

    public Janela() {
        this(500, 500, false);
    }

    public Janela(int largura, int altura) {
        this(largura, altura, true);
    }


    public static void main(String[] args) {
        // Janela windowResizable = new Janela(300, 300);
        // Janela windowNotResizable = new Janela();
        Janela win = new Janela();
        Painel pn1 = new Painel();
        win.add(pn1);
    }
}
