import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MinhaJanela extends JFrame implements KeyListener {
	
public MinhaJanela() {
	// adicionando os componentes...
	addKeyListener(this); // ele é seu próprio escutador de eventos
	// essa linha serve só para encerrar o JVM quando você fecha a janela
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(640, 480); // ajustando o tamanho da janela com valores quaisquer
	setVisible(true); // tornando a janela visível
	
	JOptionPane.showMessageDialog(null, "Este programa é uma janela que, quando se aperta F9, ela pergunta ao usuário se ele deseja fechar a janela.");
	
	repaint();
	validate();
}
public static void main(String[] args) { // executando minha classe
	MinhaJanela mj = new MinhaJanela();
}
public void keyPressed(KeyEvent ek){
	// VK_F9 é uma constante estática. Não faz diferença para o
	// compilador usar ek ou KeyEvent, mas só para ser preciso
	if(ek.getKeyCode() == KeyEvent.VK_F9){
		// passando this em vez de null, a janelinha vai aparecer no
		// centro da minha janela principal
		int selectedOption = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Mensagem", JOptionPane.YES_NO_OPTION);
		if(selectedOption == JOptionPane.YES_OPTION) {// se escolheu YES,
			// fecha a aplicação
			dispose();// libera os recursos da janela
			System.exit(0); // encerra a execução da JVM
		}
		// se escolheu NO, não faça nada
	}
}
	public void keyTyped(KeyEvent ek) { }
	public void keyReleased(KeyEvent ek) { }
} // fim da classe