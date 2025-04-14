package model;

public interface Comparador {
	int menor = -1;
	int maior = 1;
	int igual = 0;
	
	int comparadorA(Comparador X);
	
}
