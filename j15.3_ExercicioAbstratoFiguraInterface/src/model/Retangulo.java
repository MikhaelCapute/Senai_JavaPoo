package model;

public class Retangulo extends Figura{
	private double altura;
	private double largura;
	
	public Retangulo() {
		super();
	}

	public Retangulo(String cor, int posX, int posY, double altura, double largura) {
		super(cor, posX, posY);
		this.altura = altura;
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	@Override
	public String quemSou() {
		return "Cor: "+this.getCor()+"\n"+
			   "PosX: "+this.getPosX()+"\n"+
			   "PosY: "+this.getPosY()+"\n"+
			   "Altura: "+this.altura+"\n"+
			   "Largura: "+this.largura;
	}
	
	@Override
	public double area() {
		return this.altura * this.largura;
	}
	
	@Override
	public double perimetro() {
		return 2*this.altura + 2*this.largura;
	}
	
}
