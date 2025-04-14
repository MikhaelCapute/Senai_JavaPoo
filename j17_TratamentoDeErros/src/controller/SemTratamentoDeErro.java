package controller;

import java.io.IOException;

import util.Teclado;

public class SemTratamentoDeErro {

	public static void main(String[] args) throws IOException{
		int a = Teclado.lerInt("Digite o numerador:");
		int b = Teclado.lerInt("Digite o denominador:");
		
		int c = a/b;
		System.out.println("Resultado da divisão de a por b: "+c);
	}

}
