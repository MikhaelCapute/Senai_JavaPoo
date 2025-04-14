package model;

public class Professor {
	private String nome;
	private String telefone;
	private int RF;
	private String nasc;
	
	public Professor(String nome, String telefone, int RF, String nasc) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.RF = RF;
		this.nasc = nasc;
	}
	
	public Professor() {
		super();
	}

	// ------------------------------------------------------------

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getRF() {
		return RF;
	}

	public void setRF(int rF) {
		RF = rF;
	}

	public String getNasc() {
		return nasc;
	}

	public void setNasc(String nasc) {
		this.nasc = nasc;
	}
	
	// ------------------------------------------------------------
	
	public void mostrar() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("RF: " + this.getRF());
		System.out.println("Nascimento: " + this.getNasc());
	}
	
}
