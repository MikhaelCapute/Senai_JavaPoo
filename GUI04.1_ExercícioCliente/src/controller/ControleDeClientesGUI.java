package controller;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import model.Cliente;
import model.DAO.ClienteDAO;

public class ControleDeClientesGUI extends JFrame{
	
	// criando os texto de indicação 
	JLabel labelNome = new JLabel();
	JLabel labelCpf = new JLabel();
	JLabel labelEmail = new JLabel();
	
	// criando as áreas onde os textos serão digitados
	JTextField textNome = new JTextField();
	JTextField textCpf = new JTextField();
	JTextField textEmail = new JTextField();
	
	// Criando uma outra aba
	JTabbedPane abas = new JTabbedPane();
	
	JPanel painelAdicionar = new JPanel();
	JPanel painelBuscarTodos = new JPanel();
	JPanel painelExcluir = new JPanel();
	
	public ControleDeClientesGUI() {
		super("Controle de Clientes"); // Título da Janela
		
		// Colocando os textos dentro da janela
		JPanel painelLabelAdicionar = new JPanel(new GridLayout(3, 1, 5, 5));
		painelLabelAdicionar.add(labelNome);
		painelLabelAdicionar.add(labelCpf);
		painelLabelAdicionar.add(labelEmail);
		
		// Colocando a label de texto (o espaço onde o usuário irá digitar).
		JPanel painelTextoAdicionar = new JPanel(new GridLayout(3, 1, 5, 5));
		painelTextoAdicionar.add(textNome);
		painelTextoAdicionar.add(textCpf);
		painelTextoAdicionar.add(textEmail);
		
		// Colocando 
		JPanel painelFormularioAdicionar = new JPanel();
		painelFormularioAdicionar.add(painelLabelAdicionar);
		painelFormularioAdicionar.add(painelTextoAdicionar);
		
		JButton botaoAdicionar = new JButton("Adicionar Cliente"); // Adicionando um botão e atribuindo uma frase a esse botão.
		
		botaoAdicionar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String nome = textNome.getText();
				String cpf = textCpf.getText();
				String email = textEmail.getText();
				
				if(!nome.isEmpty() && !cpf.isEmpty() && !email.isEmpty()) { // 
					Cliente cliente = ClienteDAO.inserir(nome, cpf, email);
					if(cliente != null) {
						JOptionPane.showMessageDialog(botaoAdicionar, "Cliente adicionado com sucesso\n"
								+ cliente.toString());
						textNome.setText("");
						textCpf.setText("");
						textEmail.setText("");
					} else {
						JOptionPane.showMessageDialog(botaoAdicionar, "Erro ao adicionar o cliente.", "Adicionar Cliete", JOptionPane.ERROR_MESSAGE);
					}
					
				} else {
					JOptionPane.showMessageDialog(botaoAdicionar, "Favor, preencher todos os campos", "Adicionar Cliente", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		
		
	}
	
	public static void main(String[] args) {
		new ControleDeClientesGUI();
	}
	
	
	
}
