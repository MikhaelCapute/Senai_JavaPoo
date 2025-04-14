package controller;

import util.Teclado;

public class Operadores {

	public static void main(String[] args) {
		String nome;
		double n1;
		double n2;
		double n3;
		double n4;
		double media;
		
		nome = Teclado.lerTexto("Nome do aluno:");
		n1 = Teclado.lerDouble("N1: ");
		n2 = Teclado.lerDouble("N2: ");
		n3 = Teclado.lerDouble("N3: ");
		n4 = Teclado.lerDouble("N4: ");
		
		media = (n1+n2+n3+n4)/4;
		
		System.out.println("\n---Dados do Aluno---\n");
		System.out.println("Nome: "+nome);
		System.out.println("Nota 1: "+n1);
		System.out.println("Nota 2: "+n2);
		System.out.println("Nota 3: "+n3);
		System.out.println("Nota 4: "+n4);
		System.out.println("Média: "+media);
		
	}

}
