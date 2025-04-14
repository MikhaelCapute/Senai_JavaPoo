package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado {
	private static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	public static String lerTexto(String texto) throws IOException{
		
			System.out.println(texto);
			return teclado.readLine();
		
	}
	
	public static int lerInt(String texto) throws IOException{
		return Integer.parseInt(lerTexto(texto));
	}
	
	public static double lerDouble(String texto) throws IOException{
		return Double.parseDouble(lerTexto(texto));
	}
	
}
