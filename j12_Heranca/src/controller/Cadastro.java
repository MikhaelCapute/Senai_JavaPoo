package controller;

import model.Aluno;
import model.Pessoa;
import model.Professor;
import util.Teclado;

public class Cadastro {

	private static final int PESSOA = 1;
	private static final int ALUNO = 2;
	private static final int PROFESSOR = 3;
	private static final int EXIBIR_TODOS = 4;
	private static final int EXCLUIR = 5;
	private static final int SAIR = 6;

	Pessoa[] pessoas = new Pessoa[100];

	public void mostrarMenu() {
		System.out.println("---Cadastro de Pessoas---");
		System.out.println("1-Cadastrar pessoa.");
		System.out.println("2-Cadastrar aluno.");
		System.out.println("3-Cadastrar professor.");
		System.out.println("4-Exibir todos os cadastros.");
		System.out.println("5-Excluir cadastro.");
		System.out.println("6-Sair.");
	}

	public void cadastrarPessoa(int flag) {
		System.out.println("\n\n-----Cadastro-----\n");
		String nome = Teclado.lerTexto("Informe o nome:");
		String rg = Teclado.lerTexto("Informe o RG:");
		String cpf = Teclado.lerTexto("Informe o CPF:");
		String telefone = Teclado.lerTexto("Informe o telefone:");
		String email = Teclado.lerTexto("Informe o e-mail:");
		Pessoa p = null;
		String matricula = null;
		switch(flag) {
		case PESSOA:
			p = new Pessoa(nome, rg, cpf, telefone, email);
			break;
		case ALUNO:
			matricula = Teclado.lerTexto("Informe a matrícula:");
			String curso = Teclado.lerTexto("Informe o curso:");
			p = new Aluno(nome, rg, cpf, telefone, email, matricula, curso);
			break;
		case PROFESSOR:
			matricula = Teclado.lerTexto("Informe a matrícula:");
			String segmento = Teclado.lerTexto("Informe o segmento: ");
			p = new Professor(nome, rg, cpf, telefone, email, matricula, segmento);
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}
		if(inserirNoVetor(p)) {
			System.out.println("Cadastro realizado com sucesso.");
		}else {
			System.out.println("Erro ao realizar cadastro. Vetor cheio.");
		}
	}

	private boolean inserirNoVetor(Pessoa p) {
		for(int i=0;i<pessoas.length;i++) {
			if(pessoas[i]==null) {
				pessoas[i]=p;
				return true;
			}
		}
		return false;
	}

	public void exibirTodos() {
		System.out.println("\n\n---Relatório de Pessoas---\n");
		for(Pessoa p : pessoas) {
			if(p!=null) {
				p.mostrar();
				System.out.println();
			}
		}
	}

	public void excluirCadastro() {
		boolean ficar = true;
		do {
			System.out.println("\n\n---Excluir Cadastro---\n");
			for(int i=0;i<pessoas.length;i++) {
				if(pessoas[i]!=null) {
					System.out.println((i+1)+" - Nome: "+pessoas[i].getNome()+" - CPF: "+pessoas[i].getCpf());
				}
			}
			int indice = Teclado.lerInt("Informe o índice do cadastro a excluir:");
			if(indice>=1 && indice<=pessoas.length) {
				if(pessoas[indice-1]!=null) {
					pessoas[indice-1].mostrar();
					String conf = Teclado.lerTexto("Deseja realmente excluir o cadastro acima?(Sim ou Não)");
					if(conf.equalsIgnoreCase("sim")) {
						pessoas[indice-1]=null;
						System.out.println("Cadastro removido com sucesso.");
					}else {
						System.out.println("Exclusão cancelada.");
					}
					ficar = false;
				}else {
					System.out.println("Cadastro inexistente.");
				}
			}else {
				System.out.println("Valor de índice inválido. Favor informe um número de 1 a "+pessoas.length+".");
			}
			if(ficar) {
				Teclado.lerTexto("Pressione ENTER para continuar...");
			}
		}while(ficar);
	}

	public static void main(String[] args) {
		Cadastro cadastro = new Cadastro();
		int opcao = 0;
		do {
			cadastro.mostrarMenu();
			opcao = Teclado.lerInt("Opção:");
			switch(opcao) {
			case PESSOA:
				cadastro.cadastrarPessoa(PESSOA);
				break;
			case ALUNO:
				cadastro.cadastrarPessoa(ALUNO);
				break;
			case PROFESSOR:
				cadastro.cadastrarPessoa(PROFESSOR);
				break;
			case EXIBIR_TODOS:
				cadastro.exibirTodos();
				break;
			case EXCLUIR:
				cadastro.excluirCadastro();
				break;
			case SAIR:
				System.out.println("\nSaindo do sistema...\n");
				break;
			default:
				System.out.println("\nOpção inválida.\n");
				break;
			}
			Teclado.lerTexto("\nPressione ENTER para continuar...\n");
		}while(opcao!=SAIR);
		System.out.println("\nSistema encerrado.\n");

	}

}
