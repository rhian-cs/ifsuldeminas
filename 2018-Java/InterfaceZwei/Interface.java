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
	
	public static void main(String[] args) {
		String title = "In memorium a";
		String msg = "Jailson Mendes";
		ImageIcon jailson = new ImageIcon("src/jailsonsos.png", "Jailson");
		JOptionPane.showMessageDialog(null, msg, title, 3, jailson);
		
		String escalaStr = pergunta("De 1 a 10, qual sua escala de suco de laranja hoje?");
		int escala = Integer.parseInt(escalaStr);
		if(escala >= 1 && escala <= 10) {
			mensagem("Que delícia, hein?");
		} else {
			erro("A escala deve ser entre 1 e 10!!");
		}
		
		mensagem("Digite 2 números. O J.A.V.A mostrará o MAIOR DESTES 2!");
		int n1 = perguntaInt("Digite o primeiro número");
		int n2 = perguntaInt("Digite o segundo número");
		
		int maior = n1;
		if(n2 > maior) {
			maior = n2;
		}
		
		mensagem(n2 + " é o MAIOR!!!!!");
	}
}
