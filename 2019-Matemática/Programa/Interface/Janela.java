package Interface;

import Calculos.Financiamento;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame {
	
	private JPanel painelAtual;
	
	private PainelSelecao painelSelecao;
	
	//private static int largura = 480;
	//private static int altura = 640;
	private int largura;
	private int altura;
	
	private void definirPainel(JPanel novoPainel) {
		try {
			remove(painelAtual);
		} catch (NullPointerException e) {
			// Nenhum painel a ser removido da janela.
		}
		painelAtual = novoPainel;
		add(painelAtual);
		
		setVisible(true);
		repaint();
	}
	
	public void definirPainelSelecao() {
		definirPainel(painelSelecao);
		pack();
		centralizeLocation();
	}
	
	public void definirPainelResultados(Financiamento financiamento, boolean mostrarCifrao) {
		definirPainel(new PainelResultados(this, financiamento, mostrarCifrao));
		setSize(largura, altura);
		centralizeLocation();
	}
	
	public void centralizeLocation() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	}
	
	public Janela() {
		super();
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		largura = dim.width/3;
		altura = 2*dim.height/3;
		
		painelSelecao = new PainelSelecao(this);
		
		definirPainelSelecao();
		
		setTitle("Calculadora de SAC e Sistemas Price");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setResizable(true);
		setVisible(true);
	}

	public int getLargura() {
		return largura;
	}

	public int getAltura() {
		return altura;
	}
}
