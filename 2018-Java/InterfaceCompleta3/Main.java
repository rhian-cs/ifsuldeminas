
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		FlowLayout fl = new FlowLayout();
		
		Janela jn1 = new Janela();
		jn1.setLayout(fl);
		jn1.add(It.botao("OK"));
		jn1.add(It.botao("Cancelar"));
		
		Janela jn2 = new Janela();
		jn2.setLayout(fl);
		String sabores[] = {"Mussarela", "Calabresa", "Margherita", "Frango", "Chocolate"};
		jn2.addRadioGroup(sabores);
		
		Janela jn3 = new Janela();
		jn3.setLayout(fl);
		String cores[] = {"Branco", "Prata", "Verde", "Preto", "Vermelho"};
		jn3.add(It.comboBox(cores));
		
		
		// Atividade 4
		// a) JButton bt = new JButton("Botão 1");
		// b) JLabel aLabel = new JLabel();
		// c) JTextFIeld campotexto = new JTextField(50, "Texto default");
		
		// Atividade 5
		// a) F
		// b) V
		// c) V
		
		Janela jn4 = new Janela();
		jn4.setLayout(fl);
		
		jn4.add(It.texto("Hotel"));
		
		String[] quartos = {"Quarto Standard", "Quarto Luxo", "Quarto Premium"};
		jn4.add(It.comboBox(quartos));
		
		String[] pagamento = {"À Vista", "Cartão de Crédito", "Depósito Bancário", "Boleto Bancário"};
		jn4.addRadioGroup(pagamento);
		
		jn4.add(It.botao("Confirmar"));
		jn4.add(It.botao("Cancelar"));
		
		jn1.validate();
		jn2.validate();
		jn3.validate();
		jn4.validate();
	}
}
