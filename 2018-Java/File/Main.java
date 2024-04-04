
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) throws IOException {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Selecione um arquivo de texto:");
		fileChooser.showOpenDialog(null);
		
		try {
			File file = fileChooser.getSelectedFile();
			byte[] binaries = Files.readAllBytes(file.toPath());
			String content = new String(binaries);
			JOptionPane.showMessageDialog(null, "Conteúdo do arquivo:\n''" + content + "''");
		} catch(IOException e) {
			System.out.println("Exception:");
			e.printStackTrace();
		}
	}
}
