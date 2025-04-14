package controller;

import java.sql.SQLException;
import java.util.List;

import model.Cliente;
import util.Teclado;

public class TesteCliente {

	public static void main(String[] args) {
		try {
			Cliente cliente;

			int opcao = Teclado.lerInt("Selecione a opção desejada:\n1-Inserir\n2-Buscar por ID\n3-Excluir\n4-Buscar Todos\n5-Atualizar");
			String nome;
			String cpf;
			String email;
			int id;

			switch (opcao) {
			case 1:
				nome = Teclado.lerTexto("Nome:");
				cpf = Teclado.lerTexto("CPF:");
				email = Teclado.lerTexto("E-mail:");
				cliente = new Cliente(nome, cpf, email);
				if(cliente.inserirCliente()) {
					System.out.println("Cliente inserido com sucesso.");
				}else {
					System.out.println("Erro ao inserir cliente.");
				}
				break;
			case 2:
				id = Teclado.lerInt("ID:");
				cliente = new Cliente();
				if(cliente.carregarCliente(id)) {
					System.out.println(cliente.toString());
				}else {
					System.out.println("Cliente não encontrado.");
				}

				break;
			case 3:
				id = Teclado.lerInt("ID:");
				cliente = new Cliente(id);
				if(cliente.excluirCliente()) {
					System.out.println("Cliente excluido com sucesso.");
				}else {
					System.out.println("Erro ao excluir cliente ou cliente inexistente.");
				}
				break;
			case 4:
				cliente = new Cliente();
				List<Cliente> lista = cliente.carregarTodos();
				if(!lista.isEmpty()) {
					for(Cliente cli : lista) {
						System.out.println(cli);
					}
				}else {
					System.out.println("Nenhum clilente cadastrado.");
				}
				break;
			case 5:
				id = Teclado.lerInt("ID:");
				nome = Teclado.lerTexto("Nome:");
				cpf = Teclado.lerTexto("CPF:");
				email = Teclado.lerTexto("E-mail:");
				cliente = new Cliente(id, nome, cpf, email);
				if(cliente.atualizarCliente()) {
					System.out.println("Cliente atualizado com sucesso.");
				}else {
					System.out.println("Erro ao atualizar cliente e/ou cliente inexistente.");
				}
				break;
			default:
				break;
			}
		}catch(ClassNotFoundException e) {
			System.out.println("Erro ao carregar o driver. Classe não encontrada");
			System.out.println("Mensagem: "+e.getMessage());
		}catch(SQLException e) {
			System.out.println("Erro ao acessar o Banco de Dados.");
			System.out.println("Verifique os parâmetros de conexão e/ou sua instrução SQL.");
			System.out.println("Mensagem: "+e.getMessage());
		}
	}

}
