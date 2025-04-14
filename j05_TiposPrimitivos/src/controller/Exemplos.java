package controller;

public class Exemplos {

	public static void main(String[] args) {
		byte menor = 10;
		short pequeno = 456;
		int normal = 10252;
		long muitoGrande = 9876543219L;
		
		float numeroReal = 10.9f;
		
		double numero = 6745.9E13;
		
		char meuCaracter = 'L';
		char meuCharUnicode = '\u0058';
		System.out.println(meuCharUnicode);
		
		System.out.println("\"Aspas duplas.\"");
		
		boolean status = true;
		boolean continuar = false;
		System.out.println("Status: "+status);
		System.out.println("Continuar: "+continuar);
		
		long grande = 890L;
		int pequenoNovo = (int)grande; //Conversão explícita.
		char letra = (char)87;
		
	}

}
