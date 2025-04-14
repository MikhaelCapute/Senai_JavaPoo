package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComTratamentoDeErroGeneralizado {

	public static void main(String[] args) throws Exception{
		int valor1 = obtemNumero("primeiro");
		int valor2 = obtemNumero("segundo");
		System.out.println("Números lidos: "+valor1+" e "+valor2);

	}
	
	static int obtemNumero(String n) throws IOException{
		System.out.println("Digite o "+n+" número: ");
		return lerNumero();
	}
	
	static int lerNumero() throws IOException{
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(teclado.readLine());
		return x;
	}

}
