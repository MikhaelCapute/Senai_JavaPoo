package controller;

import util.Teclado;

public class DesvioCondicionalSimples {

	public static void main(String[] args) {
		int a;
		int b;
		int x;
		
		a = Teclado.lerInt("Informe o 1º número:");
		b = Teclado.lerInt("Informe o 2º número:");
		x = a + b;
		
		if(x > 10) {
			System.out.println("O valor da soma é : "+ x);
		}
		
	}

}
