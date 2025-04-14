package controller;

import java.util.Scanner;
import model.*;

public class Teste {
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Aluno al = new Aluno("admin", "1234", 1, 1111, "Marina lima", "Manha", "TI");
		Professor pr = new Professor("Prof", "6541", 2, 2222, "Rodrigo", "TI");
		
		al.mostrar();
		pr.mostrar();
		
		IUsuario iusuario = null;
		System.out.println("\nLogin no sistema:");
		
		boolean ficar = true;
		do {
		System.out.println("Deseja realizar login para:\n"
				+ "[1] = Aluno\n"
				+ "[2] = Professor\n"
				+ "Digite a opção: \n");
		int opc = in.nextInt();
		if (opc == 1) {
			iusuario = al;
			ficar = false;
		} else if (opc == 2) {
			iusuario = pr;
			ficar = false;
		}
		
		}while(ficar);
		
		ficar = true;
		do {
		System.out.println("\nLogin no Sistema:");
		System.out.println("Login: ");
		String login = in.next();
		System.out.println("Senha: ");
		String senha = in.next ();
		
		if(iusuario.validarLogin(login, senha)) {
			System.out.println("Login Realizado com sucesso.");
			ficar = false;
		}else {
			System.out.println("Login ou Senha Inválidos.");
		}
		} while(ficar);
		
		
		//Classe interna implementando interface;
		class TesteInterface implements IUsuario{
			@Override
			public boolean validarLogin(String login, String senha) {
				return false;
			}
		}
		
		//Classe anonima implementado interface;
		IUsuario iUsuario2 = new IUsuario() {
			@Override
			public boolean validarLogin(String login, String senha) {
				return false;
			}
		};
		
			
		
		
		
	}
	
}
