package model;

public class Veiculo {
	private String modelo;
	private String marca;
	private int ano;
	private double preco;
	
	public Veiculo() {
		super();
	}

	public Veiculo(String modelo, String marca, int ano, double preco) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.preco = preco;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void mostrar() {
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Marca: "+this.marca);
		System.out.println("Ano: "+this.ano);
		System.out.println("Preço: R$"+this.preco);
	}
}