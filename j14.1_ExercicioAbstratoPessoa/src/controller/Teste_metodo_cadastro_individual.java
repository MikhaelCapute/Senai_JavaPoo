package controller;

import model.Endereco;
import model.Funcionario;
import model.Gerente;
import model.Pessoa;
import util.Teclado;

public class Teste_metodo_cadastro_individual {
	private static final int FUNCIONARIO = 1;
	private static final int GERENTE = 2;
	private static final int EXIBIR_TODOS = 3;
	private static final int EXCLUIR = 4;
	private static final int EXCLUIR_TODOS = 5;
	private static final int SAIR = 6;

	private Pessoa[] pessoas = new Pessoa[100];

	private void mostrarMenu() {
		System.out.println("===Sistema de Cadastro===");
		System.out.println("1-Cadastrar Funcionário.");
		System.out.println("2-Cadastrar Gerente.");
		System.out.println("3-Exibir todos.");
		System.out.println("4-Excluir cadastro.");
		System.out.println("5-Excluir todos os cadastros.");
		System.out.println("6-Sair.");
	}
	
	private void obterDados(Pessoa pessoa) {
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
		
		pessoa.setNome(nome);
		pessoa.setNasc(nasc);
		pessoa.setAvaliacao(avaliacao);
		pessoa.setSalario(salario);
		pessoa.setEndereco(endereco);
	}
	
	private void cadastrarFuncionario() {
		System.out.println("\n\n===Cadastrar Funcionário===\n");
		Funcionario funcionario = new Funcionario();
		obterDados(funcionario);
		String setor = Teclado.lerTexto("Setor: ");
		funcionario.setSetor(setor);
		inserirNoVetor(funcionario);
	}
	
	private void cadastrarGerente() {
		System.out.println("\n\n===Cadastrar Gerente===\n");
		Gerente gerente = new Gerente();
		obterDados(gerente);
		String projeto = Teclado.lerTexto("Projeto: ");
		gerente.setProjeto(projeto);
		inserirNoVetor(gerente);
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
		Teste_metodo_cadastro_individual teste = new Teste_metodo_cadastro_individual();
		int opcao = 0;
		do {
			teste.mostrarMenu();
			opcao = Teclado.lerInt("Opção:");
			switch (opcao) {
			case FUNCIONARIO:
				teste.cadastrarFuncionario();
				break;
			case GERENTE:
				teste.cadastrarGerente();
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
