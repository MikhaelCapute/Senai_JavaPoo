package controller;

import model.Aluno;
import model.IUsuario;
import model.Professor;
import model.Usuario;
import util.Ordena;
import util.Teclado;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("maria", "1234", 1, 1111, "Maria Silva", "Noite", "202012");
		Professor professor = new Professor("jose", "4321", 2, 2222, "José Santos", "Java");
		
		aluno.mostrar();
		professor.mostrar();
		/*
		IUsuario iUsuario = null;
		System.out.println("\nLogin no sistema:");
		int opcao = Teclado.lerInt("Deseja realizar login para:\n1-Aluno\n2-Professor");
		if(opcao==1) {
			iUsuario = aluno;
		}else if(opcao==2) {
			iUsuario = professor;
		}
		
		System.out.println("\nLogin no Sistema:");
		String login = Teclado.lerTexto("Informe o login:");
		String senha = Teclado.lerTexto("Informe a senha:");
		if(iUsuario.validarLogin(login, senha)) {
			System.out.println("Login realizado com sucesso.");
		}else {
			System.out.println("Login ou senha inválidos.");
		}
		*/
		
		//Classe interna implementando interface:
		class TesteInterface implements IUsuario{
			@Override
			public boolean validarLogin(String login,String senha) {
				return false;
			}
		}
		
		//Classe anônima implementando interface:
		IUsuario iUsuario2 = new IUsuario() {
			
			@Override
			public boolean validarLogin(String login, String senha) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		//Classe anônima implementando classe abstrata:
		Usuario usuario = new Usuario() {
			
			@Override
			public void mostrar() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		Usuario[] usuarios = new Usuario[5];
		usuarios[0] = new Aluno("aluno123", "1", 1, 1, "1", "1", "1");
		usuarios[1] = new Aluno("0123aluno", "2", 2, 2, "2", "2", "2");
		usuarios[2] = new Professor("prof123","3",3,3,"3","3");
		usuarios[3] = new Professor("xyzadmin", "4", 4, 4, "4", "4");
		usuarios[4] = new Aluno("987alu", "5", 5, 5, "5", "5", "5");
		
		System.out.println("\n-->>Não ordenado:\n");
		for (Usuario usuario2 : usuarios) {
			System.out.println(usuario2.getLogin());
			//System.out.println();
		}
		
		Ordena.ordenaVetor(usuarios);
		
		System.out.println("\n-->>Ordenado:\n");
		for (Usuario usuario2 : usuarios) {
			System.out.println(usuario2.getLogin());
			//System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
