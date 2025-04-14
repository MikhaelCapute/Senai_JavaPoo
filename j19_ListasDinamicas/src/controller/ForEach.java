package controller;

import model.Usuario;
import util.Teclado;

public class ForEach {

	public static void main(String[] args) {
		int[] numero = new int[5];
		int soma = 0;
		
		for(int i=0;i<numero.length;i++) {
			numero[i]=Teclado.lerInt("Digite um número inteiro:");
		}
		
		System.out.println("Números digitados:");
		for(int i : numero) {
			soma += i;
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("Soma: "+soma);
		
		Teste teste = new Teste();
		
		System.out.println("\n---Dados dos usuários:---\n");
		for(Usuario u : teste.usuarios) {
			System.out.println(u);
			System.out.println();
		}
	}
}
