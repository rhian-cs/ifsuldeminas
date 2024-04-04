
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.plaf.basic.BasicBorders;

public class Interface extends JFrame {
	private JTextArea texto1;
	private int i;
	private int buttonPosX;
	private int buttonPosY;
	private JButton button1;
	
	public static JButton getButton(String text, int posX, int posY, int width, int height) {
		JButton button = new JButton(text);
		
		//Cores forçadas
		button.setBorder(new BasicBorders.ButtonBorder(Color.darkGray, Color.darkGray, Color.darkGray, Color.darkGray));
		button.setBackground(Color.lightGray);
		
		button.setBounds(posX, posY , width, height);
		return button;
	}
	
	public Interface() {
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		int width = 600;
		int height = 600;
		this.setSize(width, height);
		buttonPosX = width/2 - 100/2;
		buttonPosY = height/2 - 100/2;
		button1 = getButton("", buttonPosX, buttonPosY, 100, 100);
		this.add(button1); 
		
		this.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}

			@Override
			public void keyPressed(KeyEvent e) {
				double a = 0.1;
				
				if (e.getKeyCode() == 37) { //Setinha Esquerda
					a += 0.5;
					buttonPosX-=20*a;
				}
				if (e.getKeyCode() == 38) { //Setinha Para Cima
					a += 0.5;
					buttonPosY-=20*a;
				}
				if (e.getKeyCode() == 39) { //Setinha Direita
					a += 0.5;
					buttonPosX+=20*a;
				}
				if (e.getKeyCode() == 40) { //Setinha Para Baixo
					a += 0.5;
					buttonPosY+=20*a;
				}
				if(buttonPosX + 100/2 < 0) {
					buttonPosX = width + buttonPosX + 100/2;
				} else {
					if(buttonPosX - 100/2 > width) {
						buttonPosX = width - buttonPosX + 100/2;
					}
				}
				if(buttonPosY + 100/2 < 0) {
					buttonPosY = height + buttonPosY + 100/2;
				} else {
					if(buttonPosY - 100/2 > height) {
						buttonPosY = height - buttonPosY + 100/2;
					}
				}
				button1.setBounds(buttonPosX, buttonPosY, 100, 100);
			}

			@Override
			public void keyReleased(KeyEvent e) {
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		Interface inter = new Interface();
		
	}
}
