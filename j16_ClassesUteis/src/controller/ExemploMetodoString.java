package controller;

public class ExemploMetodoString {

	public static void main(String[] args) {
		String url = "http://www.senai.rj.br/ctti/turma2024029";
		String email = "aluno@senai.br";
		
		String dominio = url.substring(7,22);
		System.out.println("Domínio: "+dominio);
		
		String complemento = url.substring(23);
		System.out.println("Complemento do Domínio: "+complemento);
		
		System.out.println("Índice do @: "+email.indexOf('@'));
		String nomeUsuario = email.substring(0,email.indexOf('@'));
		System.out.println("Usuário e-mail: "+nomeUsuario);
		
		String palavra1,palavra2,maiuscula,minuscula;
		palavra1 = "carro";
		palavra2 = "CASA";
		maiuscula = palavra1.toUpperCase();
		System.out.println("Maiuscula: "+maiuscula);
		minuscula = palavra2.toLowerCase();
		System.out.println("Minuscula: "+minuscula);
		
	}

}
