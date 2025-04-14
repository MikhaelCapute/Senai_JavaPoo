package controller;

import model.*;
import java.util.Scanner;

public class Sistema {
	
	Scanner in = new Scanner (System.in);

	private static final int veiculo = 1;
	private static final int passeio = 2;
	private static final int utilitario = 3;
	private static final int carga = 4;
	private static final int mostrarTodos = 5;
	private static final int excluir = 6;
	private static final int sair = 7;
	
	Veiculo[] veiculos = new Veiculo[100];
	
	public void menu() {
		System.out.println("[1] - Cadastrar Veículo\n"
				+ "[2] - Cadastrar Veículo de Passeio\n"
				+ "[3] - Cadastrar Veículo Utilitário\n"
				+ "[4] - Cadastrar Veículo de Carga\n"
				+ "[5] - Mostrar Todos\n"
				+ "[6] - Excluir Veículo\n"
				+ "[7] - Sair\n");
	}
	
	public void cadastro(int flag) {
		System.out.println("\n----- Cadastro -----\n");
		
		System.out.println("Modelo: ");
		String modelo = in.next();
		System.out.println("Marca: ");
		String marca = in.next();
		System.out.println("Ano: ");
		int ano = in.nextInt();
		System.out.println("Preço: ");
		double preco = in.nextDouble();
		Veiculo p = null;
		
		switch(flag) {
			case veiculo:
				p = new Veiculo(modelo, marca, ano, preco);
				break;
				
			case passeio:
				System.out.println("Número de Marcha: ");
				int numMarcha = in.nextInt();
				p = new Passeio(modelo, marca, ano, preco, numMarcha);
				break;
				
			case utilitario:
				System.out.println("Número de passageiros: ");
				int numPassageiro = in.nextInt();
				p = new Utilitario(modelo, marca, ano, preco, numPassageiro);
				break;
				
			case carga:
				System.out.println("Número de Eixos: ");
				int numEixos = in.nextInt();
				System.out.println("Peso Máximo de Carga: ");
				int carga = in.nextInt();
				p = new Carga(modelo, marca, ano, preco, numEixos, carga);
				break;
				
			default:
				System.out.println("Opção inválida");
			
		}
		
	}
		
	public boolean inserirVetor(Veiculo p) {
		for (int i = 0 ; i < veiculos.length ; i ++) {
			if (veiculos[i] == null) {
				veiculos[i] = p;
				return false;
			}
		}
		return false;
		
	}
	
	public void mostrarTodos() {
		for(Veiculo p : veiculos) {
			if (p != null) {
				p.mostrar();
				System.out.println("");
			}
		}
	}
	
	public void excluir() {
		boolean ficar = true;
		do {
			
			for(int i = 0; i < veiculos.length; i++) {
				if(veiculos[i] != null) {
					System.out.println("indice: " + i + " Modelo: " + veiculos[i].getModelo() + " Marca: " + veiculos[i].getMarca()
							+ "Ano: " + veiculos[i].getAno());
					
					System.out.println("Digite o indice que deseja excluir:");
					int ind = in.nextInt();
					
					if(ind > 0 && ind < veiculos.length) {
						if (veiculos[i] != null) {
							
						} else {
							System.out.println("Cadastro Inexistente!");
						}
					} else {
						System.out.println("Valor inválido digite um valor de 0 á " + veiculos.length);
					}
				}
			}
			
			
			
		}while (ficar);
	}
	
	
}
