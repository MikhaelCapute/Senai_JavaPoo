package controller;

import model.*;

public class Cadastrar {
	
	public static void main(String[] args) {
		Aluno al = new Aluno();
		
		al.setNome("Teu papai");
		al.setTelefone("219874");
		al.setCpf("23165487-45");
		al.setNasc("15/26/0121");
		al.setMatricula(23454678);
		
		System.out.println("MOSTRAR: ");
		al.mostrar();
		System.out.println("");
		
		// --------------------------------------------------
		
		Aluno al2 = new Aluno();
		
		al2.setNome("Maquinos da 12");
		al2.setTelefone("(21)95748-6586");
		al2.setCpf("123.123.123-55");
		al2.setNasc("85/65/3215");
		al2.setMatricula(789456123);
		
		System.out.println("Mostrar 2:");
		al2.mostrar();
		System.out.println("");
		
		// --------------------------------------------------
		
		Professor pr = new Professor();
		
		pr.setNome("TioPatinhas");
		pr.setTelefone("(21)98754-3214");
		pr.setRF(321654498);
		pr.setNasc("65/45/3651");
		
		System.out.println("Professor: ");
		pr.mostrar();
		
		
	}
}
