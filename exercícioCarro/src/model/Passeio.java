package model;

public class Passeio extends Veiculo{
	
	private int numMarcha;

	public Passeio(String modelo, String marca, int ano, double preco, int numMarcha) {
		super(modelo, marca, ano, preco);
		this.numMarcha = numMarcha;
	}

	public Passeio() {
		super();
	}

	public int getNumMarcha() {
		return numMarcha;
	}

	public void setNumMarcha(int numMarcha) {
		this.numMarcha = numMarcha;
	}
	
	@Override
	public void mostrar() {
		System.out.println("Tipo: Passeio");
		super.mostrar();
		System.out.println("Número de Marchas: " + this.numMarcha);
	}
	
}
