package model;

public class Circulo extends Figura{
	private double raio;

	public Circulo() {
		super();
	}

	public Circulo(String cor, int posX, int posY, double raio) {
		super(cor, posX, posY);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public String quemSou() { 
		return "Cor: "+this.getCor()+"\n"+
			   "PosX: "+this.getPosX()+"\n"+
			   "PosY: "+this.getPosY()+"\n"+
			   "Raio: "+this.raio;
	}
	
	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}
	
	@Override
	public double perimetro() {
		return 2 * Math.PI * this.raio;
	}
	
}
