package controller;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelGridLayout2 extends JFrame{
	
	public PainelGridLayout2() {
		super("Estudo de Painel");
		
		ImageIcon icone1 = new ImageIcon("img/brasil.png");
		ImageIcon icone2 = new ImageIcon("img/estadio.png");
		ImageIcon icone3 = new ImageIcon("img/programacao.png");
		
		JLabel labelTexto = new JLabel("<html>Label somente com texto,<br>e quebra de linha.</html>");
		JLabel label1 = new JLabel(icone1);
		JLabel label2 = new JLabel(icone2);
		JLabel label3 = new JLabel(icone3);
		
		
		JPanel painelTexto = new JPanel();
		painelTexto.add(labelTexto);
		
		JPanel painelIcones = new JPanel();
		painelIcones.add(label1);
		painelIcones.add(label2);
		painelIcones.add(label3);
		
		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setLayout(new GridLayout(2,1));
		painelPrincipal.add(painelTexto);
		painelPrincipal.add(painelIcones);
		
		add(painelPrincipal);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new PainelGridLayout2();

	}

}
