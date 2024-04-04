
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela extends JFrame{
    int largura;
    int altura;

    public Janela(int largura, int altura) {
        super("Janela");
        this.largura = largura;
        this.altura = altura;
        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        setVisible(true);
		setLayout(null);
		
		setSize(largura, altura);
    }


    /*public static void main(String[] args) {
		// Aluno: Rhian Luis Garcia Moraes
        Janela win = new Janela(500, 500);
		
		JLabel text1 = new JLabel("Hello, world!");
		text1.setBounds(win.largura/2, win.altura/2, 100, 100);
		win.add(text1);
		
		JLabel icone = new JLabel(new ImageIcon("img\\ses.jpg"));
		win.add(icone);
	}*/
}
