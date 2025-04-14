package controller;

import util.Teclado;

public class ComTratamentoDeErro {

	public static void main(String[] args) {
		try {
			int a = Teclado.lerInt("Digite o numerador:");
			int b = Teclado.lerInt("Digite o denominador:");

			int c = a/b;
			System.out.println("Resultado da divisão de a por b: "+c);
		}catch(NumberFormatException nfe) {
			System.out.println("Caractere inválido!");
			System.out.println("Mensagem de erro: "+nfe.getMessage());
		}catch(ArithmeticException ae) {
			System.out.println("Divisão por zero.");
			System.out.println("Mensagem de erro: "+ae.getMessage());
		}catch(Exception e) {
			System.out.println("Ocorreu algum erro.");
			System.out.println("Mensagem de erro: "+e.getMessage());
			System.out.println("Erro:"+e);
		}
	}

}
