package controller;

import model.ContaCorrente;
import model.ContaEspecial;
import model.Endereco;

public class Teste {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua ABC", "20", "Apt.201", "Maracanã", "Rio de Janeiro", "RJ", "12349-567");
		
		ContaCorrente cc = new ContaCorrente("Maria Lima", "123-4", "9876-5", 1000, endereco);
		System.out.println("Saldo calculado: "+cc.calcularSaldo());
		System.out.println(cc);
		
		Endereco endereco2 = new Endereco("Av. Maracanã", "100", "", "Maracanã", "Rio de Janeiro", "RJ", "11111-120");
		ContaEspecial cce = new ContaEspecial("José Silva", "111-2", "6655-4", 500, 2000,endereco2);
		System.out.println();
		System.out.println("Saldo calculado: "+cce.calcularSaldo());
		System.out.println(cce);
		
		System.out.println();
		cc = cce;
		System.out.println("Conta: "+cc.toString());
		System.out.println("Saldo calculado: "+cc.calcularSaldo());
		System.out.println("Limite: "+cc.getLimite());
		
	}

}
