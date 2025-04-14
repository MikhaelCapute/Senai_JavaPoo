package model;

public class Carga extends Veiculo{
	private int numEixos;
	private int carga;
	
	public Carga() {
		super();
	}

	public Carga(String modelo, String marca, int ano, double preco, int numEixos, int carga) {
		super(modelo, marca, ano, preco);
		this.numEixos = numEixos;
		this.carga = carga;
	}

	public int getNumEixos() {
		return numEixos;
	}

	public void setNumEixos(int numEixos) {
		this.numEixos = numEixos;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Número de eixos: "+this.numEixos);
		System.out.println("Carga: "+this.carga);
	}
}
