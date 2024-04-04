
import java.awt.FlowLayout;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) throws IOException {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Selecione um arquivo de texto:");
		fileChooser.showOpenDialog(null);
		
		
		JFrame j = new JFrame();
		j.setVisible(true);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
		j.setLayout(new FlowLayout());
		j.setSize(800, 600);
		
		JLabel img = new JLabel();
		
		try {
			File file = fileChooser.getSelectedFile();
			byte[] binaries = Files.readAllBytes(file.toPath());
			img.setIcon(new ImageIcon(binaries));
			j.add(img);
		} catch(IOException e) {
			System.out.println("Exception:");
			e.printStackTrace();
		}
	}
}
