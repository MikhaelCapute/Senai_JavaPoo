package controller;

import util.Teclado;

public class LacoVariavelControle {

	public static void main(String[] args) {
		int r;
		int x;
		
		for(int i=1; i<=5; i++) {
			x = Teclado.lerInt("Digite um número: ");
			r = x * 3;
			System.out.println(r);
		}
		System.out.println("Fim");
	}
}
