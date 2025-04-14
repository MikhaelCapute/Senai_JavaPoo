package controller;

import model.Endereco;
import model.Funcionario;
import model.Gerente;
import model.Pessoa;
import util.Teclado;

public class Teste {
	private static final int PESSOA = 1;
	private static final int FUNCIONARIO = 2;
	private static final int GERENTE = 3;
	private static final int EXIBIR_TODOS = 4;
	private static final int EXCLUIR = 5;
	private static final int EXCLUIR_TODOS = 6;
	private static final int SAIR = 7;

	private Pessoa[] pessoas = new Pessoa[100];

	private void mostrarMenu() {
		System.out.println("===Sistema de Cadastro===");
		System.out.println("1-Cadastrar Pessoa.");
		System.out.println("2-Cadastrar Funcionário.");
		System.out.println("3-Cadastrar Gerente.");
		System.out.println("4-Exibir todos.");
		System.out.println("5-Excluir cadastro.");
		System.out.println("6-Excluir todos os cadastros.");
		System.out.println("7-Sair.");
	}

	private void cadastrar(int tipo) {
		System.out.println("\n\n---Cadastro---\n");
		String nome = Teclado.lerTexto("Nome:");
		String nasc = Teclado.lerTexto("Nascimento:");
		int avaliacao = Teclado.lerInt("Avaliação:");
		double salario = Teclado.lerDouble("Salário:");
		System.out.println("Endereço:");
		String logradouro = Teclado.lerTexto("Logradouro:");
		String numero = Teclado.lerTexto("Número:");
		String complemento = Teclado.lerTexto("Complemento:");
		String bairro = Teclado.lerTexto("Bairro:");
		String cidade = Teclado.lerTexto("Cidade:");
		String estado = Teclado.lerTexto("Estado:");
		String cep = Teclado.lerTexto("CEP:");
		Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, estado, cep);
		switch (tipo) {
		case PESSOA:
			Pessoa pessoa = new Pessoa(nome, nasc, avaliacao, salario, endereco);
			inserirNoVetor(pessoa);
			break;
		case FUNCIONARIO:
			String setor = Teclado.lerTexto("Setor:");
			Funcionario funcionario = new Funcionario(nome, nasc, avaliacao, salario, endereco, setor);
			inserirNoVetor(funcionario);
			break;
		case GERENTE:
			String projeto = Teclado.lerTexto("Projeto:");
			Gerente gerente = new Gerente(nome, nasc, avaliacao, salario, endereco, projeto);
			inserirNoVetor(gerente);
			break;
		default:
			System.out.println("Erro de tipo de cadastro.\nEntre em contato com o desenvolvedor.");
			break;
		}		
	}

	private void inserirNoVetor(Pessoa pessoa) {
		for(int i=0;i<pessoas.length;i++) {
			if(pessoas[i]==null) {
				pessoas[i]=pessoa;
				System.out.println("\nCadastro realizado com sucesso.\n");
				return;
			}
		}
		System.out.println("Memória insufuciente, cadastro não realizado.");
	}

	private boolean vetorVazio() {
		for(int i=0;i<pessoas.length;i++) {
			if(pessoas[i]!=null) {
				return false;
			}
		}
		return true;
	}

	private void exibirTodos() {
		System.out.println("\n\n===Relatório de Cadastros===\n");
		if(!vetorVazio()) {
			for(int i=0;i<pessoas.length;i++) {
				if(pessoas[i]!=null) {
					System.out.println("Índice: "+(i+1));
					System.out.println(pessoas[i]);
					System.out.println("Salário calculado: R$"+pessoas[i].calculaSal());
					System.out.println();
				}
			}
		}else {
			System.out.println("Não existem cadastros realizados.");
		}
	}
	
	private void excluirCadastro() {
		boolean ficar = true;
		if(!vetorVazio()) {
			do {
				System.out.println("\n\n===Excluir Cadastro===\n");
				exibirTodos();
				int indice = Teclado.lerInt("Informe o índice do cadastro a excluir:");
				if(indice>0 && indice<=pessoas.length) {
					if(pessoas[indice-1]!=null) {
						System.out.println(pessoas[indice-1]);
						String conf=Teclado.lerTexto("Deseja realmente excluir o cadastro acima?(Sim ou Não)");
						if(conf.equalsIgnoreCase("sim")) {
							pessoas[indice-1]=null;
							System.out.println("Cadastro removido com sucesso.");
						}else {
							System.out.println("Procedimento cancelado.");
						}
						ficar = false;
					}else {
						System.out.println("Cadastro inexistente.");
					}
				}else {
					System.out.println("Valor de índice inválido.\nFavor informar um número de 1 a "+pessoas.length+".");
				}
				if(ficar) {
					Teclado.lerTexto("Pressione ENTER para continuar...");
				}
			}while(ficar);
		}else {
			System.out.println("Não existem cadastros para excluir.");
		}
	}
	
	private void excluirTodos() {
		System.out.println("===\n\nExcluir Todos os Cadastros===\n");
		if(!vetorVazio()) {
			for(int i=0;i<pessoas.length;i++) {
				if(pessoas[i]!=null) {
					pessoas[i]=null;
				}
			}
			System.out.println("\nTodos os cadastros excluídos com sucesso.\n");
		}else {
			System.out.println("\nNão existem cadastros para excluir.\n");
		}
	}

	public static void main(String[] args) {
		Teste teste = new Teste();
		int opcao = 0;
		do {
			teste.mostrarMenu();
			opcao = Teclado.lerInt("Opção:");
			switch (opcao) {
			case PESSOA:
				teste.cadastrar(PESSOA);
				break;
			case FUNCIONARIO:
				teste.cadastrar(FUNCIONARIO);
				break;
			case GERENTE:
				teste.cadastrar(GERENTE);
				break;
			case EXIBIR_TODOS:
				teste.exibirTodos();
				break;
			case EXCLUIR:
				teste.excluirCadastro();
				break;
			case EXCLUIR_TODOS:
				teste.excluirTodos();
				break;
			case SAIR:
				System.out.println("\nSaindo do sistema...\n");
				break;
			default:
				System.out.println("\nOpção inválida.\n");
				break;
			}
			Teclado.lerTexto("\nPressione ENTER para continuar...\n");			
		}while(opcao!= SAIR);
		System.out.println("\nSistema encerrado.\n");
	}

}
