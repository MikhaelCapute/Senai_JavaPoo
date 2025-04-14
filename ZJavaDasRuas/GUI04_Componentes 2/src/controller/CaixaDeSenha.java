package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class CaixaDeSenha extends JFrame{
	
	public CaixaDeSenha() {
		super("Estudo de Caixa de Senha");
		
		JPasswordField cxSenha = new JPasswordField(20);
		cxSenha.setToolTipText("Sua senha aqui");
		
		cxSenha.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					JOptionPane.showMessageDialog(null, new String(cxSenha.getPassword()));
				}
				
			}
		});
		
		JLabel labelSenha = new JLabel("Digite sua senha aqui: ");
		
		JButton botao = new JButton("Enviar");
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String senha = new String(cxSenha.getPassword());
				JOptionPane.showMessageDialog(null, senha);
				
			}
		});
		
		JButton botaoMostrar = new JButton("Mostrar Senha");
		cxSenha.setEchoChar('*');
		char echoChar = cxSenha.getEchoChar();
		
		botaoMostrar.addActionListener(new ActionListener() {
			private boolean exibirSenha = true;
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(exibirSenha) {
					cxSenha.setEchoChar((char)0);
					botaoMostrar.setText("Ocultar Senha");
				} else {
					cxSenha.setEchoChar(echoChar);
					botaoMostrar.setText("Mostrar Senha");
				}
				exibirSenha = !exibirSenha;
				
			}
		});
		
		JPanel painel = new JPanel();
		painel.add(labelSenha);
		painel.add(cxSenha);
		painel.add(botao);
		painel.add(botaoMostrar);
		
		add(painel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new CaixaDeSenha();
	}
	
}
