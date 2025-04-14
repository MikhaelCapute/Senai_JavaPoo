package controller;

import util.Teclado;

import java.sql.SQLException;

import model.Cliente;

public class TestCliente {

	public static void main(String[] args) {
		
		try {
			Cliente cliente;
			System.out.println("\n [1] - Inserir"
					+ "\n [2] - Buscar por ID"
					+ "\n [3] - Excluir"
					+ "\n [4] -  Buscar Todos"
					+ "\n [5] - Atualizar"
					);
			
			int opcao = Teclado.lerInt("Digite a opção desejada:\n");
			String nome;
			String cpf;
			String email;
			int id;
			
			switch (opcao) {
				case 1:
					nome = Teclado.lerTexto("NOME: ");
					cpf = Teclado.lerTexto("CPF: ");
					email = Teclado.lerTexto("EMAIL: ");
					cliente = new Cliente();
					if (cliente.inserir()) {
						System.out.println("Cliente inserido com sucesso.");
					} else {
						System.out.println("Erro ao inserir cliente.");
					}
					
					break;
				case 2:
					id = Teclado.lerInt("ID:");
					cliente = new Cliente();
					if(cliente.carregarCliente(id)) {
						System.out.println(cliente.toString());
					} else {
						System.out.println("Cliente não encontrado!");
					}
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				default:	
			}
			
		} catch(ClassNotFoundException c) {
			System.err.println("Driver não foi encontrado ou erro ao carregar o driver.");
			System.err.println("Mensagem: " + c.getMessage());
		} catch(SQLException s) {
			System.err.println("Erro ao acessar o banco de dados. Verifique os parâmetros de conexão e(ou) sua instrução SQL.");
			System.err.println("Mensagem: " + s.getMessage());
			
		}

	}

}
