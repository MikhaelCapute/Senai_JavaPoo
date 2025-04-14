package controller;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public  class PainelGridLayout1 extends JFrame {
	
	
	public PainelGridLayout1(){
		super("Estudo de Painel");
		
		ImageIcon icone1 = new ImageIcon("img/brasil.png");
		ImageIcon icone2 = new ImageIcon("img/estadio.png");
		ImageIcon icone3 = new ImageIcon("img/programacao.png");
		
		JLabel labelTexto = new JLabel("Label somente com texto.");
		JLabel label1 = new JLabel(icone1);
		JLabel label2 = new JLabel(icone2);
		JLabel label3 = new JLabel(icone3);
		
		JPanel painel = new JPanel();
		painel.setLayout(new GridLayout(2, 2));
		painel.add(labelTexto);
		painel.add(label1);
		painel.add(label2);
		painel.add(label3);
		
		add(painel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		
		pack();
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new PainelGridLayout1();
		
	}
	
	
}
