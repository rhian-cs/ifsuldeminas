import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Interface {
	public static void erro(String msg) {
		ImageIcon ico = new ImageIcon("src/bravoface.png", "Erro");
		JOptionPane.showMessageDialog(null, msg, "Erro", 0, ico);
	}
	
	public static String pergunta(String msg) {
		return JOptionPane.showInputDialog(null, msg, "kk eae men", JOptionPane.QUESTION_MESSAGE);
	}
	
	public static void mensagem(String msg) {
		JOptionPane.showMessageDialog(null, msg, "kk eae men", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static int perguntaInt(String msg) {
		return Integer.parseInt(pergunta(msg));
	}
	
}
