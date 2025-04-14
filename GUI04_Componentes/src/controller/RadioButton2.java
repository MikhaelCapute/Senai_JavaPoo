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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButton2 extends JFrame{
	
	// Buscando as imagens para aparecer na janela
	ImageIcon iconeHomem = new ImageIcon("img/homem.jpg");
	ImageIcon iconeMulher = new ImageIcon("img/mulher.jpg");
	
	//Criando uma label para a imagem do Homem
	JLabel label = new JLabel(iconeHomem);
	
	// Os nomes dos botões a serem selecionados
	JRadioButton radioHomem = new JRadioButton("Homem");
	JRadioButton radioMulher = new JRadioButton("Mulher");
	
	// Isso imposibilita de selecionar as duas opções, homem e mulher ao mesmo tempo.
	ButtonGroup group = new ButtonGroup();
	
	public RadioButton2() {
		
		// Título da janela
		super("Exemplo RadioButton:");
		
		// Tamano da imagem dentro do painel
		label.setPreferredSize(new Dimension(150, 300));
		
		
		// Botão de atalho para a seleção Homem = alt+H
		radioHomem.setMnemonic(KeyEvent.VK_H);
		// Já vamos deixar Homem selecionado quando abrirmos a janela
		radioHomem.setSelected(true);
		radioHomem.setActionCommand("Homem"); // Bilhete/Dica do que está selecionado, quando dermos o comando 
		// getActionCommand Irá aparecer a String "Homem"
		
		
		
		radioMulher.setMnemonic(KeyEvent.VK_M);
		radioMulher.setActionCommand("Mulher");
		//Na janela então usamos as teclas de atalho alt+m para selecionar mulher e alt+h para selecionar homem
		
		
		
		// Isso imposibilita de selecionar as duas opções, homem e mulher ao mesmo tempo.
		group.add(radioHomem);
		group.add(radioMulher);
				
		radioHomem.addActionListener(new ActionListener() {
			// Comando para quando selecionar Homem aparecer o ícone de HOMEM dentro da pasta IMG
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(iconeHomem);
				
			}
		});
		
		radioMulher.addActionListener(new ActionListener() {
			// Comando para quando selecionar Mulher aparecer o ícone de Mulher dentro da pasta IMG
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(iconeMulher);
				
			}
		});
		
		
		// instanciando o botao para exibir o que foi selecionado
		JButton botao = new JButton("Exibe");
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Adicionando o getActionCommand a variável comando que foi setado dentro de
				// radioHomem/Mulher.setActionCommand(); na linha 49 e 55;
				String comando = group.getSelection().getActionCommand();
				//Abrindo uma janela para exibir o que há dentro da String comando 
				JOptionPane.showMessageDialog(null, comando);
				
				
			}
		});
		
		
		JPanel radioPainel = new JPanel(new GridLayout(2,1));
		radioPainel.add(radioHomem);
		radioPainel.add(radioMulher);
		
		
		// Definindo onde cada coisa irá ficar, porém é mais facil usar somente o add(radioPainel, BorderLayout.WEST) 
		// por exemplo essa forma é pra ser mais didática ao entender o que está acontecendo no código.
		Container container = getContentPane();
		container.add(radioPainel, BorderLayout.WEST);
		container.add(label, BorderLayout.CENTER);
		container.add(botao, BorderLayout.SOUTH);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,500);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new RadioButton2();
	}
}
