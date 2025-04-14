package controller;

import util.Teclado;

public class ProgramacaoMultplaEscolha {

	public static void main(String[] args) {
		int matricula = Teclado.lerInt("Informe a matrícula: ");
		int numeroFinal = matricula % 10;
		
		switch(numeroFinal) {
		case 0:
			System.out.println("Pagamento em Janeiro.");
			break;
		case 1:
			System.out.println("Pagamento em Fevereiro.");
			break;
		case 2:
			System.out.println("Pagamento em Março.");
			break;
		case 3:
			System.out.println("Pagamento em Abril.");
			break;
		default:
			System.out.println("Pagamento em Maio.");
		}
	}

}
