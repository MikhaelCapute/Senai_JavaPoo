package controller;

import model.*;

public class Test {
	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua ABC", "20", "apt.201", "Maracanã", "Rio de Janeiro", "RJ", "2345678");
		Pessoa pessoa = new Pessoa("Irene", "04/04/2002", 5, 1.598);
		Gerente gerente = new Gerente("José", "05/12/2000", 7, 2.789, "Projeto Não sei que porra é essa...");
		Funcionario funcionario = new Funcionario("Bosak", "04/04/2004", 8, 6.159, "Químico");
		
		System.out.println("Pessoa:");
		System.out.println(pessoa);
		
		System.out.println("\nGerente:");
		System.out.println(gerente);
		
		System.out.println("\nfuncionario:");
		System.out.println(funcionario);
		
		
	}
}
