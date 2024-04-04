
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class Main {
	public static void main(String[] args) {
		Janela jn = new Janela("Janela");
		jn.setLayout(new FlowLayout());
		
		JRadioButton solido = new JRadioButton("Sólido");
		JRadioButton liquido = new JRadioButton("Líquido");
		
		ButtonGroup grupo = new ButtonGroup();
		
		grupo.add(solido);
		grupo.add(liquido);
		
		jn.add(solido);
		jn.add(liquido);
	}
}
