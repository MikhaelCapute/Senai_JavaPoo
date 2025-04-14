package controller;

import model.ContaCorrente;
import model.ContaEspecial;

public class Teste {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("Maria Lima", "123-4", "9876-5", 1000);
		System.out.println("Saldo calculado: "+cc.calcularSaldo());
		System.out.println(cc);
		
		ContaEspecial cce = new ContaEspecial("José Silva", "111-2", "6655-4", 500, 2000);
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
