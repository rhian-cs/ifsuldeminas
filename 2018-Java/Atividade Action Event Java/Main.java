
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Main {
	public static void main(String[] args) {
		Janela jn = new Janela();
		
		FlowLayout fl = new FlowLayout();
		// GridLayout gl = new GridLayout();
		
		jn.setLayout(fl);
		
		JTextField entrada = It.textInput("Insira seu texto aqui");
		jn.add(entrada);
		
		JButton bt = It.botao("Mostrar como pop-up", 200, 200, 100, 100);
		
		
		bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				It.mensagem(entrada.getText());
			}
		});
		jn.add(bt);
		
		jn.validate();
	}
}
