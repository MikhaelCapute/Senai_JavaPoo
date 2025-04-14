package model;

public class Aluno {
	private String nome;
	private String telefone;
	private String cpf;
	private String nasc;
	private int matricula;
	
	// ------------------------------------------------------------
	
	public Aluno(String nome, String telefone, String cpf, String nasc, int matricula) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.nasc = nasc;
		this.matricula = matricula;
	}

	public Aluno() {
		super();
	}

	//-------------------------------------------------------------
	
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNasc() {
		return nasc;
	}
	public void setNasc(String nasc) {
		this.nasc = nasc;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	// ------------------------------------------------------------
	
	public void mostrar() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Nsacimento: " + this.getNasc());
		System.out.println("Matricula: " + this.getMatricula());
	}
	
}
