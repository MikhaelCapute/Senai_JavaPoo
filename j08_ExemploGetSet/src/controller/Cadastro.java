package controller;

import model.Pessoa;

public class Cadastro {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.setNome("José Augusto");
		p.setSexo("Masculino");
		p.setIdade(38);
		
		System.out.println("Dados de pessoa:");
		p.mostrar();
			
	}

}
