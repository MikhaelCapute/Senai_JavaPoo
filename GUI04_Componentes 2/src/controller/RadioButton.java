package controller;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButton extends JFrame{
	
	// Buscando as imagens para aparecer na janela
	ImageIcon iconeHomem = new ImageIcon("img/homem.jpg");
	ImageIcon iconeMulher = new ImageIcon("img/mulher.jpg");
	
	//Criando uma label para a imagem do Homem
	JLabel label = new JLabel(iconeHomem);
	
	
	public RadioButton() {
		
		// Título da janela
		super("Exemplo RadioButton:");
		
		// Tamano da imagem dentro do painel
		label.setPreferredSize(new Dimension(150, 300));
		
		// Os nomes dos botões a serem selecionados
		JRadioButton radioHomem = new JRadioButton("Homem");
		radioHomem.setMnemonic(KeyEvent.VK_H);
		// Já vamos deixar Homem selecionado quando abrirmos a janela
		radioHomem.setSelected(true);
		
		JRadioButton radioMulher = new JRadioButton("Mulher");
		radioMulher.setMnemonic(KeyEvent.VK_M);
		//Na janela então usamos as teclas de atalho alt+m para selecionar mulher e alt+h para selecionar homem
		
		
		
		// Isso imposibilita de selecionar as duas opções, homem e mulher ao mesmo tempo.
		ButtonGroup group = new ButtonGroup();
		group.add(radioHomem);
		group.add(radioMulher);
				
		radioHomem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(iconeHomem);
				
			}
		});
		
		radioMulher.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(iconeMulher);
				
			}
		});
				
		JPanel radioPainel = new JPanel(new GridLayout(2,1));
		radioPainel.add(radioHomem);
		radioPainel.add(radioMulher);
		
		// Definindo onde cada coisa irá ficar
		Container container = getContentPane();
		container.add(radioPainel, BorderLayout.WEST);
		container.add(label, BorderLayout.CENTER);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,500);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new RadioButton();
	}
}
