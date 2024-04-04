
import javax.swing.JLabel;

public class Main {
	public static void main(String[] args) {
		Janela jn = new Janela("5KRR", 640, 320);
		
		Botao bt = new Botao("Hello there", 250, 100, 100, 50); // 100x50
		jn.add(bt);
		
		JLabel texto = Label.texto("Huehus BR'hus");
		jn.add(texto);
		
		jn.addImage("img/ses.jpg");
	}
}
