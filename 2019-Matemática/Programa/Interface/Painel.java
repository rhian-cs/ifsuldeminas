/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public abstract class Painel extends JPanel implements ActionListener {
	private int width;
	private int height;
	protected Janela janela;
	
	protected JButton criarBotao(String nome) {
		return criarBotao(nome, false);
	}
	
	protected JButton criarBotao(String nome, boolean addButton) {
		JButton botao = new JButton(nome);
		botao.addActionListener(this);
		this.add(botao);
		return botao;
	}
	
	public Painel(Janela janela) {
		this.janela = janela;
		
		//setSize(Janela.getLargura(), Janela.getAltura());
	}

	@Override
	public abstract void actionPerformed(ActionEvent ae);
	
	public abstract void inicializarComponentes();
}
