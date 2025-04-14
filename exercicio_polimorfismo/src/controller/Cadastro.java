package controller;

import model.*;
import java.util.Scanner;

public class Cadastro {
	
	
	Pessoa[] pessoas = new Pessoa[5];
	
	Scanner in = new Scanner(System.in);
	
	public static final int Pessoa = 1;
	public static final int Funcionário = 2;
	public static final int Gerente = 3;
	public static final int MostrarTodos = 4;
	public static final int Excluir = 5;
	public static final int Sair = 6;
	
	public void menu() {
		System.out.println("---- MENU ----");
		System.out.println("[1] - Cadastrar Usuário"
				+ "[2] - Cadastrar Funcionário."
				+ "[3] - Cadastrar Gerente."
				+ "[4] - Mostrar Todos."
				+ "[5] - Excluir Cadastro."
				+ "[6] - Sair do Sistema.");
	}
	
	public void obterDados(Pessoa pessoa, Endereco endereco) {
		System.out.println("NOME: ");
		String nome  = in.next();
		System.out.println("Nascimento:(dd/mm/yyyy) ");
		String nasc  = in.next();
		System.out.println("Avaliação (0 á 10): ");
		int avaliacao = in.nextInt();
		System.out.println("Salário: ");
		double salario  = in.nextDouble();
		System.out.println("\nENDEREÇOS:");
		System.out.println("Logradouro: ");
		String logradouro = in.next();
		System.out.println("Número: ");
		String numero = in.next();
		System.out.println("complemento: ");
		String complemento = in.next();
		System.out.println("Bairro: ");
		String bairro = in.next();
		System.out.println("Cidade: ");
		String cidade = in.next();
		System.out.println("Estado: ");
		String estado = in.next();
		
		
		pessoa.setNome(nome);
		pessoa.setAvaliacao(avaliacao);
		pessoa.setNasc(nasc);
		pessoa.setSalario(salario);
		endereco.setBairro(bairro);
		endereco.setLogradouro(logradouro);
		endereco.setNumero(numero);
		endereco.setComplemento(complemento);
		endereco.setCidade(cidade);
		endereco.setEstado(estado);
		endereco.setCep(estado);
	}
	
	private void inserirVetor(Pessoa pessoa, Endereco endereco) {
		for (int i = 0 ; i < pessoas.length ; i ++) {
			if (pessoas[i] == null) {
				pessoas[i] = pessoa;
				//endereco[i] = endereco;
			}
		}
		
	}
	
	
	
}
