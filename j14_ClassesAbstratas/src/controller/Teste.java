package controller;

import model.Aluno;
import model.Professor;
import model.Usuario;

public class Teste {

	public static void main(String[] args) {
		//Usuario usuario = new Usuario("jose", "1234", 1);
		Aluno aluno = new Aluno("maria", "4321", 2, 2222, "Maria Lima", "Noite", "2029");
		Professor professor = new Professor("pedro", "1212", 3, 3333, "Pedro Santos", "Java");
		
		//System.out.println("Usuário:");
		//System.out.println(usuario);
		System.out.println("Exibindo com toString:");
		System.out.println("\nAluno:");
		System.out.println(aluno);
		System.out.println("\nProfessor:");
		System.out.println(professor);
		
		System.out.println("\nExibindo com mostrar():");
		aluno.mostrar();
		System.out.println();
		professor.mostrar();
		
		
		
	}

}
