package controller;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

import model.Cliente;
import model.DAO.ClienteDAO;

public class ControleDeClientesInterface extends JFrame {

	public ControleDeClientesInterface() {
		super("Controle de Clientes");

		JLabel nomeCad = new JLabel("Nome: ");
		JTextArea areaDeTextoNomeCad = new JTextArea(1, 10);

		JLabel cpfCad = new JLabel("CPF: ");
		JTextArea areaDeTextoCpfCad = new JTextArea(1, 10);

		JLabel emailCad = new JLabel("Email: ");
		JTextArea areaDeTextoEmailCad = new JTextArea(1, 10);

		JButton botaoCadastro = new JButton("Cadastrar Cliente");
		botaoCadastro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Cliente cliente = ClienteDAO.inserir(areaDeTextoNomeCad.getText(), areaDeTextoCpfCad.getText(),
						areaDeTextoEmailCad.getText());

				JOptionPane.showMessageDialog(null, "Cliente Cadastrado com sucesso");
			}
		});

		// Painel de Cadastro
		JPanel painelCadastro = new JPanel();
		painelCadastro.add(nomeCad);
		painelCadastro.add(areaDeTextoNomeCad);

		painelCadastro.add(cpfCad);
		painelCadastro.add(areaDeTextoCpfCad);

		painelCadastro.add(emailCad);
		painelCadastro.add(areaDeTextoEmailCad);

		painelCadastro.add(botaoCadastro);
		
		// Painel de Consultar Todos por ID
		JLabel idCon = new JLabel("Qual ID deseja consultar? ");
		JTextArea areaDeTextoIdCon = new JTextArea(1, 10);

		JButton botaoConsulta = new JButton("Consultar Cliente");
		botaoConsulta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					Cliente cliente = ClienteDAO.buscarPorId(Integer.parseInt(areaDeTextoIdCon.getText()));

					JOptionPane.showMessageDialog(null, cliente.toString());

				} catch (NumberFormatException num) {
					JOptionPane.showMessageDialog(null, "ID inválida");
					
				}

			}
		});

		JPanel painelBuscarPorId = new JPanel();
		painelBuscarPorId.add(idCon);
		painelBuscarPorId.add(areaDeTextoIdCon);

		painelBuscarPorId.add(botaoConsulta);

		JMenuBar menuBar = new JMenuBar();

		JMenu menuCadastro = new JMenu("Cadastro");
		menuCadastro.setMnemonic(KeyEvent.VK_A);
		menuBar.add(menuCadastro);

		JMenuItem menuItem1 = new JMenuItem("Cadastrar Cliente");
		menuItem1.addActionListener(new ActionListener() {
			
			// ActionListener do Item 1
			@Override
			public void actionPerformed(ActionEvent e) {
				remove(painelBuscarPorId);
				remove(painelCadastro);
				add(painelCadastro);
				painelCadastro.revalidate();
				painelCadastro.repaint();

			}
		});
		menuItem1.setMnemonic(KeyEvent.VK_C);
		menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));

		menuCadastro.add(menuItem1);

		JMenu menuConsulta = new JMenu("Consulta");
		menuBar.add(menuConsulta);
		JMenuItem menuItem2 = new JMenuItem("Consultar");
		menuItem2.addActionListener(new ActionListener() {

			// ActionListener do Item 2
			@Override
			public void actionPerformed(ActionEvent e) {
				remove(painelBuscarPorId);
				remove(painelCadastro);
				add(painelBuscarPorId);
				painelBuscarPorId.revalidate();
				painelBuscarPorId.repaint();

			}
		});

		menuConsulta.setMnemonic(KeyEvent.VK_B);
		menuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));

		// ActionListener do BuscarTodos
		JMenuItem menuItemBuscarTodos = new JMenuItem("Consultar Todos os Clientes");

		menuConsulta.add(menuItem2);
		menuConsulta.add(menuItemBuscarTodos);

		menuItemBuscarTodos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				List<Cliente> clientes = ClienteDAO.buscarTodos();
				StringBuffer stringBuffer = new StringBuffer();
				
				for (Cliente cliente : clientes) {
					stringBuffer.append(cliente.toString()+"\n");
				}
				
				
				String retorno = stringBuffer.toString();
				
				JOptionPane.showMessageDialog(null, retorno);
				
			}
		});

		// Painel buscar por email

		JLabel labelBuscarPorEmail = new JLabel("Qual email?");
		JTextArea areaDeTextoEmailBuscEmail = new JTextArea(1, 10);
		JButton botaoBuscarPorEmail = new JButton("Buscar");

		botaoBuscarPorEmail.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				List<Cliente> cliente = ClienteDAO.buscarPorEmail(areaDeTextoEmailBuscEmail.getText());
				if (cliente.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Não foram enconrados clientes com o respectivo email");
				} else {
					JOptionPane.showMessageDialog(null, cliente.toString());
				}
			}
		});

		JPanel painelBuscarPorEmail = new JPanel();
		painelBuscarPorEmail.add(labelBuscarPorEmail);
		painelBuscarPorEmail.add(areaDeTextoEmailBuscEmail);
		painelBuscarPorEmail.add(botaoBuscarPorEmail);

		JMenuItem menuItemBuscarPorEmail = new JMenuItem("Buscar por Email");

		menuConsulta.add(menuItemBuscarPorEmail);

		// Painel Excluir Clientes
		JLabel idExcluir = new JLabel();
		JTextArea areaDeTextoIdExcluir = new JTextArea(1, 10);
		JButton botaoExcluir = new JButton("Excluir Cliente");
		botaoExcluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					boolean cliente = ClienteDAO.excluir(Integer.parseInt(areaDeTextoIdExcluir.getText()));

					JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso");

				} catch (NumberFormatException num) {
					JOptionPane.showMessageDialog(null, "ID inválida");
				}
			}
		});

		JPanel painelExcluir = new JPanel();
		painelExcluir.add(idExcluir);
		painelExcluir.add(areaDeTextoIdExcluir);
		painelExcluir.add(botaoExcluir);

		menuConsulta.add(menuItem2);
		menuConsulta.add(menuItemBuscarTodos);

		JMenu menuExcluir = new JMenu("Excluir");
		menuCadastro.setMnemonic(KeyEvent.VK_D);
		menuBar.add(menuExcluir);

		JMenuItem excluirCliente = new JMenuItem("Excluir Cliente");
		excluirCliente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				remove(painelBuscarPorId);
				remove(painelCadastro);
				remove(painelExcluir);
				add(painelExcluir);
				painelExcluir.revalidate();
				painelExcluir.repaint();

			}
		});

		menuItemBuscarPorEmail.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				remove(painelBuscarPorId);
				remove(painelCadastro);
				remove(painelExcluir);
				add(painelBuscarPorEmail);
				painelBuscarPorEmail.revalidate();
				painelBuscarPorEmail.repaint();
			}
		});

		menuExcluir.add(excluirCliente);

		setJMenuBar(menuBar);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 400);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ControleDeClientesInterface();

	}

}
