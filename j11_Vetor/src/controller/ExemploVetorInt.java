package controller;

public class ExemploVetorInt {

	public static void main(String[] args) {
		int[] numeros = new int[4];
		numeros[0] = 6;
		numeros[2] = 17;
		
		System.out.println("numeros[2] = "+numeros[2]);
		
		for(int i=0;i<4;i++) {
			numeros[i] = (i*8);
		}
		
		//Foreach
		for (int i : numeros) {
			System.out.println(i);
		}
	}
}
