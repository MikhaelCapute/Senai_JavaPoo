package controller;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JanelaHeranca extends JFrame{

	public JanelaHeranca() {
		super("Título da Janela com Herança");

		setSize(500, 300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon icone = new ImageIcon("img/estadio.png");
		setIconImage(icone.getImage());

		setLocationRelativeTo(null);
		//setLocation(100, 200);

		setVisible(true);

		
	}

	public static void main(String[] args) {
		new JanelaHeranca();
	}

	
	
}
