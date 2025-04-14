package controller;

import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {
		String nome;
		
		System.out.println("Digite deu nome:");
		Scanner sc = new Scanner(System.in);
		nome = sc.nextLine();
		
		System.out.println("Nome Digitado: "+nome);
		
		double salario;
		
		System.out.println("Digite o salário que deseja: ");
		Scanner sc2 = new Scanner(System.in);
		salario = sc2.nextDouble();
		
		System.out.println("Salário pretendido: "+salario);
		
		sc.close();
		sc2.close();
	}

}
