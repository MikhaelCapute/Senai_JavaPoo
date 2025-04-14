package controller;

import model.Circulo;
import model.Figura;
import model.Retangulo;
import util.Teclado;

public class Teste {

	private Figura[] figuras = new Figura[100];

	private static final int CIRCULO = 1;
	private static final int RETANGULO = 2;
	private static final int EXIBIR_TODOS = 3;
	private static final int APAGAR_POR_INDICE = 4;
	private static final int APAGAR_TODOS = 5;
	private static final int SAIR = 6;

	public void mostrarMenu() {
		System.out.println("===Cadastro de Figuras===");
		System.out.println("1-Cadastrar Círculo.");
		System.out.println("2-Cadastrar Retangulo.");
		System.out.println("3-Exibir todos.");
		System.out.println("4-Apagar por índice.");
		System.out.println("5-Apagar todos.");
		System.out.println("6-Sair.");
	}

	public void cadastrarFigura(int tipo) {
		System.out.println("-->>Informe os dados para cadastro:");
		String cor = Teclado.lerTexto("Cor:");
		int posX = Teclado.lerInt("PosX:");
		int posY = Teclado.lerInt("PosY:");
		switch (tipo) {
		case CIRCULO:
			double raio = Teclado.lerDouble("Raio:");
			Circulo circulo = new Circulo(cor, posX, posY, raio);
			inserirNoVetor(circulo);
			break;
		case RETANGULO:
			double altura = Teclado.lerDouble("Altura:");
			double largura = Teclado.lerDouble("Largura:");
			Retangulo retangulo = new Retangulo(cor, posX, posY, altura, largura);
			inserirNoVetor(retangulo);
			break;
		default:
			break;
		}
	}

	private void inserirNoVetor(Figura figura) {
		for(int i=0;i<figuras.length;i++) {
			if(figuras[i]==null) {
				figuras[i]=figura;
				System.out.println("Figura cadastrada com sucesso.");
				return;
			}
		}
		System.out.println("Erro ao cadastrar figura.\nMemória lotada.");
	}

	public void exibirTodos() {
		System.out.println("===Relatório de Figuras===");
		if(!vetorVazio()) {
			for(int i=0;i<figuras.length;i++) {
				if(figuras[i]!=null) {
					System.out.println("Índice: "+(i+1));
					System.out.println(figuras[i].quemSou());
					System.out.println("Área: "+figuras[i].area());
					System.out.println("Perímetro: "+figuras[i].perimetro());
					System.out.println();
				}
			}
		}else {
			System.out.println("Não existem figuras cadastradas.");
		}
	}

	private boolean vetorVazio() {
		for(int i=0;i<figuras.length;i++) {
			if(figuras[i]!=null) {
				return false;
			}
		}
		return true;
	}

	public void apagarPorIndice() {
		boolean ficar = true;
		if(!vetorVazio()) {
			do {
				System.out.println("===Excluir Cadastro===");
				exibirTodos();
				int indice = Teclado.lerInt("Informe o índice da figura a excluir:");
				if(indice>0 && indice<=figuras.length) {
					if(figuras[indice-1]!=null) {
						System.out.println(figuras[indice-1].quemSou());
						System.out.println("Área: "+figuras[indice-1].area());
						System.out.println("Perímetro: "+figuras[indice-1].perimetro());
						String conf = Teclado.lerTexto("Deseja realmente excluir a figura acima?(Sim ou Não)");
						if(conf.equalsIgnoreCase("sim")) {
							figuras[indice-1] = null;
							System.out.println("Figura removida com sucesso.");
						}else {
							System.out.println("Procedimento cancelado.");
						}
						ficar = false;
					}else {
						System.out.println("Cadastro de figura inexistente.");
					}
				}else {
					System.out.println("Valor de índice inválildo.\nFavor informar um número de 1 a "+figuras.length+".");
				}
				if(ficar) {
					Teclado.lerTexto("Pressione ENTER para continuar...");
				}
			}while(ficar);
		}else {
			System.out.println("Não existem figuras cadastradas para excluir.");
		}
	}

	public void apagarTodos() {
		System.out.println("===Excluir Todos Os Cadastros===");
		if(!vetorVazio()) {
			for(int i=0;i<figuras.length;i++) {
				if(figuras[i]!=null) {
					figuras[i]=null;
				}
			}
			System.out.println("Todos os cadastros excluídos com sucesso.");
		}else {
			System.out.println("Não existem figuras cadastradas para excluir.");
		}
	}

	public static void main(String[] args) {
		Teste teste = new Teste();
		int opcao = 0;
		do {
			teste.mostrarMenu();
			opcao = Teclado.lerInt("Opção:");
			switch (opcao) {
			case CIRCULO:
				teste.cadastrarFigura(CIRCULO);
				break;
			case RETANGULO:
				teste.cadastrarFigura(RETANGULO);
				break;
			case EXIBIR_TODOS:
				teste.exibirTodos();
				break;
			case APAGAR_POR_INDICE:
				teste.apagarPorIndice();
				break;
			case APAGAR_TODOS:
				teste.apagarTodos();
				break;
			case SAIR:
				System.out.println("Saindo do sistema...");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}while(opcao != SAIR);
		System.out.println("Sistema encerrado.");

	}

}
