package controller;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import model.Cliente;
import model.DAO.ClienteDAO;

public class TelaDeLogin extends JFrame{

	private JTextField textoLogin = new JTextField();
	private JPasswordField passwordSenha = new JPasswordField();
	
	private JLabel labelLogin = new JLabel("Login:");
	private JLabel labelSenha = new JLabel("Senha:");
	
	private JPanel painelPrincipal = new JPanel();
	
	public TelaDeLogin() {
		super("Controle de Clientes");
		
		JPanel painelFormulario = new JPanel(new GridLayout(2,2,5,5));
		painelFormulario.add(labelLogin);
		painelFormulario.add(textoLogin);
		painelFormulario.add(labelSenha);
		painelFormulario.add(passwordSenha);
		
		JButton botaoLogar = new JButton("Logar");
		botaoLogar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String login = textoLogin.getText();
				String senha = new String(passwordSenha.getPassword());
				
				if(login.equals("admin") && senha.equals("1234")) {
					JOptionPane.showMessageDialog(botaoLogar, "Login realizado com sucesso");
					dispose();
					new ControleDeClientesGUI();
				}else {
					JOptionPane.showMessageDialog(botaoLogar, 
							"Usuário ou senha inválidos.","Erro de login",
							JOptionPane.ERROR_MESSAGE);
				}
				/*//Adaptação para simular autenticação com login e senha no banco de dados,
				  //pois a classe Cliente não possui login e senha:
				Cliente cliente = ClienteDAO.buscarPorId(Integer.parseInt(senha));
				if(login.equals(cliente.getNome())) {
					JOptionPane.showMessageDialog(botaoLogar, "Login realizado com sucesso");
					dispose();
					new ControleDeClientesGUI();
				}else {
					JOptionPane.showMessageDialog(botaoLogar, 
							"Usuário ou senha inválidos.","Erro de login",
							JOptionPane.ERROR_MESSAGE);
				}
				*/
				
				
			}
		});
		
		JPanel painelBotao = new JPanel();
		painelBotao.add(botaoLogar);
		
		painelPrincipal.setLayout(new BorderLayout(10,10));
		painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		painelPrincipal.add(painelFormulario,BorderLayout.NORTH);
		painelPrincipal.add(painelBotao,BorderLayout.CENTER);
		
		add(painelPrincipal);
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new TelaDeLogin();

	}

}
