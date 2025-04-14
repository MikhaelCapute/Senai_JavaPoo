package controller;

import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class Teste {
	
	List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public Teste() {
		super();
		this.usuarios.add(new Usuario("ana","1234"));
		this.usuarios.add(new Usuario("pedro", "2345"));
		this.usuarios.add(new Usuario("gerson", "34456"));
	}
	
	public static void main(String[] args) {
		Teste teste = new Teste();
		
		System.out.println(teste.usuarios.get(2));
		System.out.println(teste.usuarios);
		teste.usuarios.remove(1);
		System.out.println();
		System.out.println(teste.usuarios);
		System.out.println();
		System.out.println(teste.usuarios.get(1));
		
	}

}
