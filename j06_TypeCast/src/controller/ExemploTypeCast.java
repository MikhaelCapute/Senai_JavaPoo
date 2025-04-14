package controller;

public class ExemploTypeCast {

	public static void main(String[] args) {
		int a = 5, b = 2;
		int c;
		
		c = a/b;
		System.out.println("Valor de c: "+ c);
		
		double d;
		d = a/b;
		System.out.println("Valor de d: "+ d);
		
		double e;
		//Conversão explícita:
		e = (double)a/b;
		System.out.println("Valor de e: "+ e);
		
		float f = 14.5f;
		//Conversão implícita:
		e = f;
		System.out.println("Valor de e: "+ e);
	}

}
