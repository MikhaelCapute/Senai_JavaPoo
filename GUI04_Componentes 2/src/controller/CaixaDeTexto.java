package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CaixaDeTexto extends JFrame {
	
	
	
	public CaixaDeTexto() {
		//Título da janela
		super("Estudo de caixa de Texto");
		
		String mensagem = "Digite o seu nome aqui...";
		
		JTextField cxTexto = new JTextField(20);
		
		//O que vai aparecer 
		//cxTexto.setText("Digite aqui o seu nome: ");
		
		cxTexto.setText(mensagem);
		
		//Dica
		cxTexto.setToolTipText("Seu nome aqui.");
		
		//cxTexto.selectAll();
		
		cxTexto.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				//cxTexto.setText(getName().toUpperCase());
				if(cxTexto.getText().isEmpty()) {
					cxTexto.setText(mensagem);
					cxTexto.setForeground(Color.LIGHT_GRAY);
				}
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					if(cxTexto.getText().equals(mensagem)) {
						cxTexto.setText("");
					}
				}
				
				if(cxTexto.getText().equals(mensagem)) {
					cxTexto.setText("");
					cxTexto.setForeground(Color.BLACK);
				}
				JOptionPane.showMessageDialog(cxTexto, cxTexto.getText());
				
			}
		});	
		
		JLabel labelNome = new JLabel("Informe seu nome: ");


		JButton botao1 = new JButton("Exibir");

		botao1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Seu nome é " + cxTexto.getText());
			}
		});

		
		
		JPanel painel = new JPanel();
		painel.add(labelNome);
		painel.add(cxTexto);
		painel.add(botao1);

		add(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 100);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		
		new CaixaDeTexto();
		
	}
}
