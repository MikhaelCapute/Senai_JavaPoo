package model;

public interface Comparador {
	int MENOR = -1;
	int MAIOR = 1;
	int IGUAL = 0;
	
	int comparadoA(Comparador x);

}
