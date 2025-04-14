package controller;

public class ExemploClasseMath {

	public static void main(String[] args) {
		double valorSorteado = Math.random();
		System.out.println("Valor sorteado no random:"+valorSorteado);
		
		//Sortear um número entre 50 e 80:
		int resultado = 50 + (int)(valorSorteado * 31);
		System.out.println("Sorteio entre 50 e 80: "+resultado);
		
		//Sorteio da mega-sena:
		for(int i=0;i<6;i++) {
			double numeroSena = Math.random();
			int numeroSorteado = (int)(Math.round(numeroSena * 60));
			System.out.println("Número sorteado: "+numeroSorteado);
		}
		
		//Maior entre dois números:
		int maior = Math.max(resultado, 65);
		System.out.println("Entre 65 e "+resultado+", o maior é: "+maior);
		
		//Área de um círcula de raio 5:
		double area = Math.PI * Math.pow(5, 2);
		System.out.println("Área de um círculo de raio 5 é: "+area);
		
		double sen, cos, tan;
		double a=60;
		sen = Math.sin(Math.toRadians(a));
		cos = Math.cos(Math.toRadians(a));
		tan = Math.tan(Math.toRadians(a));
		
		System.out.println("Seno: "+sen);
		System.out.println("Cosseno: "+cos);
		System.out.println("Tangente: "+tan);
		
		//Raiz quadrada:
		double raiz = Math.sqrt(81);
		System.out.println("Raiz quadrada de 81 é: "+raiz);
		
	}

}
