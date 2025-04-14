package model;

public class Utilitario extends Veiculo{
	
	private int numPassageiro;

	public Utilitario(String modelo, String marca, int ano, double preco, int numPassageiro) {
		super(modelo, marca, ano, preco);
		this.numPassageiro = numPassageiro;
	}

	public Utilitario() {
		super();
	}

	public int getNumPassageiro() {
		return numPassageiro;
	}

	public void setNumPassageiro(int numPassageiro) {
		this.numPassageiro = numPassageiro;
	}
	
	@Override
	public void mostrar() {
		System.out.println("Tipo: Utilitário");
		super.mostrar();
		System.out.println("Número de Passageiros: " + this.numPassageiro);
	}
	
}
