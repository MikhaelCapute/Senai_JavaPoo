package controller;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelBorderLayout extends JFrame{
	
	public PainelBorderLayout() {
		super("Estudo de Painel");
		
		ImageIcon icone1 = new ImageIcon("img/brasil.png");
		ImageIcon icone2 = new ImageIcon("img/estadio.png");
		ImageIcon icone3 = new ImageIcon("img/programacao.png");
		
		JLabel labelTexto = new JLabel("Label somente com texto.");
		JLabel labelTexto2 = new JLabel("Outro label somente com texto.");
		JLabel label1 = new JLabel(icone1);
		JLabel label2 = new JLabel(icone2);
		JLabel label3 = new JLabel(icone3);
		
		
		JPanel painelTexto = new JPanel();
		painelTexto.add(labelTexto);
		
		JPanel painelTexto2 = new JPanel();
		painelTexto2.add(labelTexto2);
		
		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setLayout(new BorderLayout());
		
		painelPrincipal.add(painelTexto, BorderLayout.NORTH);
		painelPrincipal.add(label1, BorderLayout.EAST);
		painelPrincipal.add(label2, BorderLayout.WEST);
		painelPrincipal.add(label3, BorderLayout.CENTER);
		painelPrincipal.add(painelTexto2, BorderLayout.SOUTH);
		
		//add(painelPrincipal);
		setContentPane(painelPrincipal);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new PainelBorderLayout();

	}

}
