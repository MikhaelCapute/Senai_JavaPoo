package model;

public class Pessoa {
	private String nome;
	private String sexo;
	private int idade;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void mostrar() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Sexo: "+this.sexo);
		System.out.println("Idade: "+this.idade);
	}
}
