
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Label{
	
	public static JLabel texto(String mensagem, int x, int y, int largura, int altura) {
		JLabel texto = new JLabel(mensagem);
		texto.setBounds(x, y, largura, altura);
		return texto;
	}
	
	public static JLabel texto(String mensagem) {
		return texto(mensagem, 0, 0, 200, 20);
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
}
