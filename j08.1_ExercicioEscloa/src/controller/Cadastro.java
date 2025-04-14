package controller;

import model.Aluno;
import model.Professor;

public class Cadastro {

	public static void main(String[] args) {
		Aluno aluno01 = new Aluno();
		aluno01.setNome("Maria Silva Lima");
		aluno01.setTelefone("(21)98765-4321");
		aluno01.setCpf("123.123.123-12");
		aluno01.setDataDeNascimento("12/09/2001");
		aluno01.setMatricula(123456);
		
		aluno01.mostrar();
		
		Aluno aluno02 = new Aluno();
		aluno02.setNome("José de Andrade");
		aluno02.setTelefone("(11)99877-5544");
		aluno02.setCpf("111.222.333-44");
		aluno02.setDataDeNascimento("20/02/1998");
		aluno02.setMatricula(654321);
		
		System.out.println();
		aluno02.mostrar();
		
		Professor professor01 = new Professor();
		professor01.setNome("Luciano Resende");
		professor01.setTelefone("(21)89977-6655");
		professor01.setRegistroFuncional(987659876);
		professor01.setDataDeNascimento("09/11/1970");
		
		System.out.println();
		professor01.mostrar();
	}

}
