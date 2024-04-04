
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Atividade extends JFrame implements ActionListener {
	JButton pootis;
	JTextField texto;
	
	public Atividade() {
		super();
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		texto = new JTextField("Digite seu texto aqui.");
		add(texto);
		
		pootis = new JButton("Mostrar o texto");
		pootis.addActionListener(this);
		add(pootis);
		
		setLayout(new FlowLayout());
		this.validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, texto.getText());
	}
	
	public static void main(String[] args) {
		Atividade yeet = new Atividade();
	}
}
