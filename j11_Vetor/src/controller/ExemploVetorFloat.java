package controller;

public class ExemploVetorFloat {

	public static void main(String[] args) {
		float[] notas = {4, 7.5f, 10, 9};
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota "+(i+1)+": "+notas[i]);
		}
		
		//foreach:
		System.out.println("\nForeach:");
		int indice=1;
		for(float i : notas) {
			System.out.println("Nota "+(indice++)+": "+i);
		}
		
	}

}
