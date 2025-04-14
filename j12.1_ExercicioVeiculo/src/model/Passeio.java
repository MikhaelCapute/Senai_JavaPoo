package model;

public class Passeio extends Veiculo{
	private int numMarchas;

	public Passeio() {
		super();
	}

	public Passeio(String modelo, String marca, int ano, double preco, int numMarchas) {
		super(modelo, marca, ano, preco);
		this.numMarchas = numMarchas;
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}
	
	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Número de marchas: "+this.numMarchas);
	}

}
