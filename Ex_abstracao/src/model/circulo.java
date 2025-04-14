package model;

public class circulo extends figura{
	
	private double raio;

	public circulo(double raio, String cor, int posX, int posY) {
		super(cor, posX, posX);
		this.raio = raio;
	}

	@Override
	public void SouQuem() {
		System.out.println("Sou eu um circulo.");
	}

	@Override
	public Double area() {
		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	public Double perimetro() {
		return 2 * Math.PI * this.raio;
	}
	
	
}
