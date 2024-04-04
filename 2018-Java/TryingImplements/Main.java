
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main extends JPanel implements MouseListener {
	// private JPanel panel;
	
	public Main() {
		super();
		this.setSize(320, 140);
		addMouseListener(this);
		
		// panel = new JPanel();
		
		JFrame janela = new JFrame("Janelosa");
		janela.setBounds(0, 0, 640, 480);
		janela.setVisible(true);
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		janela.add(this);
		janela.repaint();
		janela.validate();
	}
	
	public void setColor(Color col) {
		this.setBackground(col);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		setColor(Color.BLUE);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		setColor(Color.CYAN);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		setColor(Color.GREEN);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		setColor(Color.RED);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		setColor(Color.MAGENTA);
	}
}
