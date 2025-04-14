package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Botao extends JFrame{

	public Botao() {
		super("Exemplo de Botão");
		
		JButton botao = new JButton("Botão 1");
		botao.setToolTipText("Botão COM classe anônima.");
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Você clicou no Botão 1.");
				
			}
		});
		
		JButton botao2 = new JButton("Botão 2");
		botao2.setToolTipText("Botão SEM classe anônima.");
		BotaoListener botaoListener = new BotaoListener();
		botao2.addActionListener(botaoListener);
		
		JPanel painel = new JPanel();
		painel.add(botao);
		painel.add(botao2);
		
		add(painel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Botao();

	}

}
