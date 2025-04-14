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

public class CaixaDeTexto extends JFrame{

	public CaixaDeTexto() {
		super("Estudo de Caixa de Texto");
		
		String mensagem = "Digite seu nome aqui...";
		
		JTextField caixaDeTexto = new JTextField(20);
		caixaDeTexto.setText(mensagem);
		caixaDeTexto.setForeground(Color.LIGHT_GRAY);
		caixaDeTexto.setToolTipText("Seu nome aqui");
		//caixaDeTexto.selectAll();
		
		caixaDeTexto.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				//caixaDeTexto.setText(caixaDeTexto.getText().toUpperCase());
				if(caixaDeTexto.getText().isEmpty()) {
					caixaDeTexto.setText(mensagem);
					caixaDeTexto.setForeground(Color.LIGHT_GRAY);
				}
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					if(caixaDeTexto.getText().equals(mensagem)) {
						caixaDeTexto.setText("");
					}
					JOptionPane.showMessageDialog(caixaDeTexto, caixaDeTexto.getText());
				}
				
				if(caixaDeTexto.getText().equals(mensagem)) {
					caixaDeTexto.setText("");
					caixaDeTexto.setForeground(Color.BLACK);
				}
				
				
			}
		});
		
		JLabel labelNome = new JLabel("Informe seu nome:");
		
		JButton botao = new JButton("Exibir");
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, caixaDeTexto.getText());
				
			}
		});
		
		JPanel painel = new JPanel();
		painel.add(labelNome);
		painel.add(caixaDeTexto);
		painel.add(botao);
		
		add(painel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 100);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new CaixaDeTexto();

	}

}
