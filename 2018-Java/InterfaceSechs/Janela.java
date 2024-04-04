
import javax.swing.JFrame;

public class Janela extends JFrame{
    int largura;
    int altura;

    private Janela(int largura, int altura) {
        super("Janela");
        this.largura = largura;
        this.altura = altura;
        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        setVisible(true);
		setLayout(null);
		
		setSize(largura, altura);
    }


    public static void main(String[] args) {
		
        Janela win = new Janela(500, 500);
		
        Painel painelEsquerdo = new Painel("Preto");
		painelEsquerdo.setBounds(0, 0, win.largura/2, win.altura);
		
        Painel painelDireito = new Painel("Azul");
		painelDireito.setBounds(win.largura/2, 0, win.largura/2, win.altura);
		
		
        win.add(painelEsquerdo);
        win.add(painelDireito);
    }
}
