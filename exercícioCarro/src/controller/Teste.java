package controller;

import model.*;

public class Teste {
	
	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo("Vectra", "GM", 2000, 18.793);
		Passeio passeio = new Passeio("Captiva", "GM", 2012, 43.532, 4);
		Carga carga = new Carga("Constelation", "VW", 2010, 190.546, 2, 45);
		Utilitario utilitario = new Utilitario("Fiorino", "Fiat", 2012, 35.324, 2);
		
		System.out.println("Veículo: ");
		veiculo.mostrar();
		
		System.out.println("");
		
		System.out.println("Passeio (pau na tua cara):");
		passeio.mostrar();
		
		System.out.println("");
		
		System.out.println("Utilitário");
		utilitario.mostrar();
		
		System.out.println("");
		
		System.out.println("Carga: ");
		carga.mostrar();
		
		
		
	}
	
	
}
