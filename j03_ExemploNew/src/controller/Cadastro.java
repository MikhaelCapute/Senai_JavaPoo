package controller;

import model.Usuario;

public class Cadastro {

	public static void main(String[] args) {
		Usuario user = new Usuario();
		user.nome = "Maria Lima Santos";
		user.endereco = "Rua ABC nº30";
		
		System.out.println("Usuário:");
		System.out.println("Nome: "+user.nome);
		System.out.println("Endereço: "+user.endereco);
	}

}
