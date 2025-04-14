package controller;

import util.Teclado;

public class DesvioCondicionalEncadeado {

	public static void main(String[] args) {
		double salario;
		double salarioNovo;
		
		salario = Teclado.lerDouble("Informe o salário: ");
		
		if(salario < 500) {
			salarioNovo = salario * 1.15;
		}else{
			if(salario <= 1000) {
				salarioNovo = salario * 1.1;
			}else {
				salarioNovo = salario * 1.05;
			}
		}
		System.out.println("Salário com reajuste: "+salarioNovo);
		
	}

}
