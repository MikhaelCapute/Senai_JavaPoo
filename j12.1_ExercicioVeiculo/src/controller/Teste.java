package controller;

import model.Carga;
import model.Passeio;
import model.Utilitario;
import model.Veiculo;
import util.Teclado;

public class Teste {

	private static final int VEICULO = 1;
	private static final int PASSEIO = 2;
	private static final int UTILITARIO = 3;
	private static final int CARGA = 4;
	private static final int EXIBIR_TODOS = 5;
	private static final int EXCLUIR = 6;
	private static final int SAIR = 7;

	Veiculo[] veiculos = new Veiculo[100];

	public void mostrarMenu() {
		System.out.println("---Sistema de Controle de Veículos---");
		System.out.println("1-Cadastrar veículo comum.");
		System.out.println("2-Cadastrar veículo de passeio.");
		System.out.println("3-Cadastrar veículo utilitário.");
		System.out.println("4-Cadastrar veículo de carga.");
		System.out.println("5-Exibir todos os cadastros.");
		System.out.println("6-Excluir cadastro.");
		System.out.println("7-Sair.");
	}

	private void obterDados(Veiculo veiculo) {
		String modelo = Teclado.lerTexto("Modelo: ");
		String marca = Teclado.lerTexto("Marca: ");
		int ano = Teclado.lerInt("Ano: ");
		double preco = Teclado.lerDouble("Preço: R$");

		veiculo.setModelo(modelo);
		veiculo.setMarca(marca);
		veiculo.setAno(ano);
		veiculo.setPreco(preco);
	}

	private void inserirNoVetor(Veiculo veiculo) {
		for(int i=0;i<veiculos.length;i++) {
			if(veiculos[i]==null) {
				veiculos[i]=veiculo;
				System.out.println("\nVeículo cadastrado com sucesso.\n");
				return;
			}
		}
		System.out.println("\nErro ao cadastrar veículo.\nMemória lotada, remova algum registro.\n");
	}

	public void cadastrarVeiculo() {
		System.out.println("\n\n---Cadastrar Veículo Comum---\n");
		Veiculo veiculo = new Veiculo();
		obterDados(veiculo);
		inserirNoVetor(veiculo);		
	}

	public void cadastrarPasseio() {
		System.out.println("\n\n---Cadastrar Veículo de Passeio---\n");
		Passeio passeio = new Passeio();
		obterDados(passeio);
		int numMarchas = Teclado.lerInt("Número de marchas: ");
		passeio.setNumMarchas(numMarchas);
		inserirNoVetor(passeio);
	}

	public void cadastrarUtilitario() {
		System.out.println("\n\n---Cadastrar Veículo Utilitário---\n");
		Utilitario utilitario = new Utilitario();
		obterDados(utilitario);
		int numPassageiros = Teclado.lerInt("Número de passageiros: ");
		utilitario.setNumPassageiros(numPassageiros);
		inserirNoVetor(utilitario);		
	}

	public void cadastrarCarga() {
		System.out.println("\n\n---Cadastrar Veículo de Carga---\n");
		Carga carga = new Carga();
		obterDados(carga);
		int numEixos = Teclado.lerInt("Número de eixos: ");
		int capacidadeCarga = Teclado.lerInt("Carga: ");
		carga.setNumEixos(numEixos);
		carga.setCarga(capacidadeCarga);
		inserirNoVetor(carga);
	}

	private boolean vetorVazio() {
		for(int i=0;i<veiculos.length;i++) {
			if(veiculos[i]!=null) {
				return false;
			}
		}
		return true;
	}

	public void exibirTodos() {
		System.out.println("\n\n---Relatório de Veículos---\n");
		if(!vetorVazio()) {
			for(int i=0;i<veiculos.length;i++) {
				if(veiculos[i]!=null) {
					System.out.println("--> Índice do veículo :"+(i+1));
					veiculos[i].mostrar();
					System.out.println("toString: "+veiculos[i]);
					System.out.println();
				}
			}
		}else {
			System.out.println("Não existem veículos cadastrados.");
		}
	}

	public void excluirCadastro() {
		boolean ficar = true;
		if(!vetorVazio()) {
			do {
				System.out.println("\n\n---Excluir Veículo---\n");
				exibirTodos();
				int indice = Teclado.lerInt("Informe o índice do veículo a excluir");
				if(indice>0 && indice<=veiculos.length) {
					if(veiculos[indice-1]!=null) {
						veiculos[indice-1].mostrar();
						String conf = Teclado.lerTexto("Deseja realmente excluir o cadastro acima?(Sim ou Não)");
						if(conf.equalsIgnoreCase("sim")) {
							veiculos[indice-1]=null;
							System.out.println("Veículo removido com sucesso.");
						}else {
							System.out.println("Exclusão cancelada.");
						}
						ficar = false;
					}else {
						System.out.println("Cadastro inexistente.");
					}
				}else {
					System.out.println("Valor de índice inválido.\nFavor informar um número de 1 a "+veiculos.length+".");
				}
				if(ficar) {
					Teclado.lerTexto("Pressione ENTER para continuar...");
				}
			}while(ficar);
		}else {
			System.out.println("Não existem veículos cadasatrados para excluir.");
		}
	}

	public static void main(String[] args) {
		Teste teste = new Teste();
		int opcao = 0;
		do {
			teste.mostrarMenu();
			opcao = Teclado.lerInt("Opção:");
			switch (opcao) {
			case VEICULO:
				teste.cadastrarVeiculo();
				break;
			case PASSEIO:
				teste.cadastrarPasseio();
				break;
			case UTILITARIO:
				teste.cadastrarUtilitario();
				break;
			case CARGA:
				teste.cadastrarCarga();
				break;
			case EXIBIR_TODOS:
				teste.exibirTodos();
				break;
			case EXCLUIR:
				teste.excluirCadastro();
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
