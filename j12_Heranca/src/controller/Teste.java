package controller;

import model.Aluno;
import model.Pessoa;
import model.Professor;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("José Silva","112233-4","111.222.333-44","(21)98765-4321",
				"jose@email.com","1234","Técnico de TI");
		System.out.println("Aluno:");
		aluno.mostrar();
		
		Professor professor = new Professor("Luiz Soares", "1111-2", "123.123.123-12",
				"(21)98877-6655", "luiz@email.com", "4321", "TI");
		System.out.println("\nProfessor:");
		professor.mostrar();
		
		Pessoa pessoa = new Pessoa("Maria Silva", "123123-4", "876.876.865-87",
				"(11)1111-2222", "maria@email.com");
		System.out.println("\nPessoa:");
		pessoa.mostrar();
		
		System.out.println("\n?:");
		pessoa = aluno;
		pessoa.mostrar();

		System.out.println("\n?:");
		pessoa = professor;
		pessoa.mostrar();
				
	}

}
