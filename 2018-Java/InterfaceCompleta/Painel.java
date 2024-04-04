
import java.awt.Color;
import javax.swing.JPanel;

public class Painel extends JPanel{
    public Painel(String cor) {
        super(); // Chamando o construtor da superclasse
		Color color; // Objeto cor baseado na nossa cor
		
		// Definindo a cor com base na string passada no argumento
		switch(cor.toLowerCase()) {
			case "vermelho":
				color = Color.red;
				break;
			case "verde":
				color = Color.green;
				break;
			case "azul":
				color = Color.blue;
				break;
			case "preto":
				color = Color.black;
				break;
			case "branco":
				color = Color.white;
			default:
				color = Color.black;
		}
        setBackground(color); // Definindo o plano de fundo do painel a cor selecionada
    }
	
	public Painel(Color cor) {
		super();
		setBackground(cor);
	}
}
