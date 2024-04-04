
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class JanelaDeDesenho extends JFrame implements KeyListener {
	
	int ww;
	int wh;
	
	int btn1w = 0x40;
	int btn1h = 0x40;
	
	int btn2w = 0x20;
	int btn2h = 0x20;
	
	int ballw = 0x10;
	int ballh = 0x10;
	int ballx;
	int bally;
	
	public JanelaDeDesenho() {
		this(640);
	}
	
	public JanelaDeDesenho(int altura) {
		this.wh = altura;
		this.ww = (altura*16)/9;
		
		ballx = 300; //ww/2 - ballw/2;
		bally = wh + ballh;
		
		setSize(ww, wh);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		addKeyListener(this);
	}
	
	@Override
	public void paint(Graphics g) {
		System.out.println("Now painting...");
		// super.paint(g);
		// Plano de fundo
		/*g.setColor(Color.white);
		g.fillRect(0, 0, WIDTH, HEIGHT);*/
		
		
		// Retângulo maior cinza
		g.setColor(Color.gray);
		g.fillRect(ww/2 - btn1w/2, wh - btn1h, btn1w, btn1w);
		
		// Retângulo menor azul claro (ciano)
		g.setColor(Color.cyan);
		g.fillRect(ww/2 - btn2w/2, wh - btn1h - btn2h, btn2w, btn2h);
		g.setColor(Color.blue);
		g.fillOval(ballx, bally, ballw, ballh);
		
	}
	
	public static void main(String[] args) {
		JanelaDeDesenho j = new JanelaDeDesenho(400);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int spacebarCode = 32;
		boolean shooting = false;
		if(e.getKeyCode() == spacebarCode && !shooting) {
			shooting = true;
			System.out.println("Started shooting.");
			while(bally > -ballh) {
				//System.out.println("While 1");
				long start = new Date().getTime();
				if(new Date().getTime() - start >= 1) {
					System.out.println("While 2");
					bally-=0x10;
					System.out.println(bally);
					this.repaint();
				}
				/*try {
					System.out.println("Zzz");
					Thread.sleep(50);
				} catch (InterruptedException ex) {
					Logger.getLogger(JanelaDeDesenho.class.getName()).log(Level.SEVERE, null, ex);
				}	*/
			}
			bally = wh + ballh;
			shooting = false;
			System.out.println("Shooting finished. Ball Y now equals " + bally);
		}
		System.out.println("KeyPressed finished.");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
