package controller;

import model.Aluno;
import util.Teclado;

public class Cadastro {

	public static void main(String[] args) {

		Aluno[] alunos = new Aluno[5];

		for(int i=0;i<alunos.length;i++) {
			System.out.println("Informe os dados do aluno "+(i+1)+":");
			String nome = Teclado.lerTexto("Nome:");
			double[] notas = new double[4];
			for(int j=0;j<notas.length;j++) {
				notas[j] = Teclado.lerDouble("Nota "+(j+1)+": ");
			}
			alunos[i] = new Aluno(nome,notas);
		}

		String[][] tabela = new String[5][6];
		for(int i=0;i<tabela.length;i++) {
			tabela[i][0]=alunos[i].getNome();
			for(int j=1;j<tabela[i].length-1;j++) {
				tabela[i][j]=Double.toString(alunos[i].getNotas()[j-1]);
			}
			tabela[i][5]=Double.toString(alunos[i].getMedia());
		}

		System.out.println("Nome:\t\t\tNota1:\tNota 2:\tNota 3:\tNota 4:\tMédia:");
		for(int i=0;i<tabela.length;i++) {
			for(int j=0;j<tabela[i].length;j++) {
				System.out.print(tabela[i][j]+"\t");
			}
			System.out.println();
		}




	}

}
