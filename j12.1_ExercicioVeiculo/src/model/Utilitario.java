package model;

public class Utilitario extends Veiculo{
	private int numPassageiros;

	public Utilitario() {
		super();
	}

	public Utilitario(String modelo, String marca, int ano, double preco, int numPassageiros) {
		super(modelo, marca, ano, preco);
		this.numPassageiros = numPassageiros;
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	
	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Número de passageiros: "+this.numPassageiros);
	}

}
