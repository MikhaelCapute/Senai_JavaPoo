package controller;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import model.Cliente;
import model.DAO.ClienteDAO;

public class ControleDeClientesGUI_v2 extends JFrame{
	// GRAÇAS AO FOLLE.
	
	JLabel labelNomeAdicionar = new JLabel("Nome:");
	JLabel labelCpfAdicionar = new JLabel("CPF:");
	JLabel labelEmailAdicionar = new JLabel("E-mail:");

	
	JTextField textoNomeAdicionar = new JTextField(30);
	JTextField textoCpfAdicionar = new JTextField(30);
	JTextField textoEmailAdicionar = new JTextField(30);
	
	JTabbedPane abas = new JTabbedPane();
	
	JPanel painelAdicionar = new JPanel();
	JPanel painelBuscarTodos = new JPanel();
	JPanel painelExcluir = new JPanel();
	
    // Tabela para exibir clientes
    JTable tabelaClientes;
    JScrollPane scrollTabela;
	
	
			
	public ControleDeClientesGUI_v2() {
		super("Controle de Clientes");
		
		JPanel painelLabelAdicionar = new JPanel(new GridLayout(3,1,5,5));
		painelLabelAdicionar.add(labelNomeAdicionar);
		painelLabelAdicionar.add(labelCpfAdicionar);
		painelLabelAdicionar.add(labelEmailAdicionar);
		
		JPanel painelTextoAdicionar = new JPanel(new GridLayout(3,1,5,5));
		painelTextoAdicionar.add(textoNomeAdicionar);
		painelTextoAdicionar.add(textoCpfAdicionar);
		painelTextoAdicionar.add(textoEmailAdicionar);
		
		JPanel painelFormularioAdicionar = new JPanel();
		painelFormularioAdicionar.add(painelLabelAdicionar);
		painelFormularioAdicionar.add(painelTextoAdicionar);
		
		JButton botaoAdicionar = new JButton("Adicionar Cliente");
		botaoAdicionar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = textoNomeAdicionar.getText();
				String cpf = textoCpfAdicionar.getText();
				String email = textoEmailAdicionar.getText();
				
				if(!nome.isEmpty() && !cpf.isEmpty() && !email.isEmpty()) {
					Cliente cliente = ClienteDAO.inserir(nome, cpf, email);
					if(cliente != null) {
						JOptionPane.showMessageDialog(botaoAdicionar, "Cliente adicionado com sucesso.\n"+
					    cliente.toString());
						textoNomeAdicionar.setText("");
						textoCpfAdicionar.setText("");
						textoEmailAdicionar.setText("");
					}else {
						JOptionPane.showMessageDialog(botaoAdicionar, "Erro ao adicionar cliente.","Adicionar Cliente",JOptionPane.ERROR_MESSAGE);
					}
				}else {
					JOptionPane.showMessageDialog(botaoAdicionar, "Favor, preencher todos os campos.","Adicionar Cliente",JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		
		
		
		JPanel painelBotaoAdicionar = new JPanel();
		painelBotaoAdicionar.add(botaoAdicionar);
		
		// VETORES
		String[] colunas = {"Nome", "CPF", "E-mail"};
	    Object[][] dados = {}; // Inicialmente vazio, será populado com os dados reais
	    
	    tabelaClientes = new JTable(dados, colunas);
        scrollTabela = new JScrollPane(tabelaClientes);
	    
	    JButton botaoBuscarTodos = new JButton("Buscar Todos");
        botaoBuscarTodos.addActionListener(new ActionListener() {
        	
        	@Override
            public void actionPerformed(ActionEvent e) {
                // Buscar todos os clientes no DAO
                List<Cliente> listaClientes = ClienteDAO.buscarTodos();

                if (!listaClientes.isEmpty()) {
                    // Atualizar a tabela com os dados dos clientes
                    Object[][] dadosTabela = new Object[listaClientes.size()][3];
                    for (int i = 0; i < listaClientes.size(); i++) {
                        Cliente cliente = listaClientes.get(i);
                        dadosTabela[i][0] = cliente.getNome();
                        dadosTabela[i][1] = cliente.getCpf();
                        dadosTabela[i][2] = cliente.getEmail();
                    }

                    // Atualizar o modelo da tabela
                    tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
                        dadosTabela,
                        colunas
                    ));
                } else {
                    JOptionPane.showMessageDialog(botaoBuscarTodos, "Nenhum cliente encontrado.", "Buscar Todos", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
		
        
		// Painel	
		painelAdicionar.setLayout(new BorderLayout());
		painelAdicionar.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		painelAdicionar.add(painelFormularioAdicionar,BorderLayout.NORTH);
		painelAdicionar.add(painelBotaoAdicionar,BorderLayout.CENTER);
		
		// PainelBuscarTodos
		painelBuscarTodos.setLayout(new BorderLayout());
		painelBuscarTodos.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        painelBuscarTodos.add(scrollTabela, BorderLayout.CENTER);
        painelBuscarTodos.add(botaoBuscarTodos, BorderLayout.SOUTH);
		
		
		abas.addTab("Adicionar Cliente", painelAdicionar);
		abas.addTab("Buscar Todos", painelBuscarTodos);
		
		add(abas);
		setSize(700, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ControleDeClientesGUI_v2();

	}

}
