package model;

import ordena.Comparador;

public abstract class Figura implements Comparador{
	private String cor;
	private int posX;
	private int posY;
	
	public Figura() {
		super();
	}

	public Figura(String cor, int posX, int posY) {
		super();
		this.cor = cor;
		this.posX = posX;
		this.posY = posY;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public abstract String quemSou();
	public abstract double area();
	public abstract double perimetro();
	
	@Override
	public int comparadoA(Comparador comparador) {
		Figura figura = (Figura)comparador;
		if(this.area() > figura.area()) {
			return MAIOR;
		}else {
			if(this.area() < figura.area()) {
				return MENOR;
			}
		}
		return IGUAL;	
	}
}
