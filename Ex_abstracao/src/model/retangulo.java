package model;

public class retangulo extends figura{
	
	private double a;
	private double l;

	public retangulo(String cor, int posY, int posX, double altura, double largura) {
		super(cor, posY, posX);
		this.a = altura;
		this.l = largura;
	}

	@Override
	public void SouQuem() {
		System.out.println("Eu sou um retângulo");
	}

	@Override
	public Double area() {
		return this.a * this.l;
	}

	@Override
	public Double perimetro() {
		return 2 * (this.l + this.a);
	}
}
