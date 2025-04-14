package controller;

public class ControleDeUsuario {
	
	public static void mostrarMenu() {
        System.out.println("====================");
        System.out.println("Cadastro de Usuários");
        System.out.println("====================");
        System.out.println("1-Cadastrar aluno");
        System.out.println("2-Apagar aluno");
        System.out.println("3-Atualizar aluno");
        System.out.println("4-Mostrar alunos");
        System.out.println("5-Mostrar aluno por ID");
        System.out.println("6-Mostrar aluno por matrícula");
        System.out.println("7-Cadastrar professor");
        System.out.println("8-Apagar professor");
        System.out.println("9-Atualizar professor");
        System.out.println("10-Mostrar professores");
        System.out.println("11-Mostrar professor por ID");
        System.out.println("12-Mostrar professor por matrícula");
        System.out.println("13-Sair");
    }
	
	public static void main(String[] args) {

		mostrarMenu();
		
	}

}
