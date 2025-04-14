package controller;

import util.Teclado;

public class ExemploEntrada {

	public static void main(String[] args) {
		String nome = Teclado.lerTexto("Digite seu nome: ");
		
		int idade = Teclado.lerInt("Digite sua idade: ");
		
		double salario = Teclado.lerDouble("Digite seu salário: ");
		
		System.out.println("Nome informado: "+nome);
		System.out.println("Idade informada: "+idade);
		System.out.println("Salário informado: "+salario);
		
				
	}

}
