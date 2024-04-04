
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MovimentoDoBotao implements KeyListener {
	
	private JButton botao;
	private int botaoX;
	private int botaoY;
	private int tamanhoDoBotao;
	private JFrame janela;
	
	private int velocidadeDeMovimentoDoBotao;
	
	public MovimentoDoBotao(JFrame j) {
		botaoX = 320;
		botaoY = 240;
		tamanhoDoBotao = 32;
		velocidadeDeMovimentoDoBotao = 16;
		
		botao = new JButton();
		botao.addKeyListener(this);
		atualizarBotao();
		
		janela = j;
		janela.add(botao);
	}
	
	public void atualizarBotao() {
		botao.setBounds(botaoX, botaoY, tamanhoDoBotao, tamanhoDoBotao);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// Fazer Nada
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int v = velocidadeDeMovimentoDoBotao;
		
		int teclaPressionada = e.getKeyCode();
		
		switch(teclaPressionada) {
			case 37: // Seta para a Esquerda
				moverBotao(-v, 0);
				break;
			case 38: // Seta para Cima
				moverBotao(0, -v);
				break;
			case 39: // Seta para a Direita
				moverBotao(v, 0);
				break;
			case 40: // Seta para Baixo
				moverBotao(0, v);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// Fazer nada
	}
	
	public void moverBotao(int direcaoX, int direcaoY) {
		botaoX += direcaoX;
		botaoY += direcaoY;
		
		atualizarBotao();
		
		janela.repaint();
		janela.validate();
	}
	
	public static void main(String[] args) {
		JFrame j = new JFrame("Janelinha");
		j.setLayout(null);
		j.setSize(640, 480);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
		j.setVisible(true);
		
		JLabel alerta = new JLabel("Clique no botão para que as teclas funcionem.");
		alerta.setBounds(40, 0, 400, 100);
		j.add(alerta);
		
		MovimentoDoBotao mov = new MovimentoDoBotao(j);
	}
}
