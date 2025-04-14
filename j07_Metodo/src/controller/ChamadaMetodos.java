package controller;

public class ChamadaMetodos {

	public static void main(String[] args) {
		System.out.println("Iniciando o programa.");
		primeiro();
		System.out.println("Continuando programa.");
		terceiro();
		System.out.println("Terminando o programa.");
	}
	
	public static void primeiro() {
		System.out.println("-Iniciando o método PRIMEIRO.");
		segundo();
		System.out.println("-Terminando o método PRIMEIRO");
	}
	
	public static void segundo() {
		System.out.println("--Iniciando método SEGUNDO.");
		System.out.println("--Terminando método SEGUNDO.");
	}
	
	public static void terceiro() {
		System.out.println("---Iniciando método TERCEIRO.");
		System.out.println("---Terminando método TERCEIRO.");
	}

}
