
import java.awt.Color;
import javax.swing.JPanel;

public class Painel extends JPanel{
    public Painel(String cor) {
        super();
		Color color = Color.black;
		switch(cor.toLowerCase()) {
			case "azul":
				color = Color.blue;
				break;
			case "black":
				color = Color.black;
				break;
		}
        setBackground(color);
    }
}
