package model;

public class Aluno {
	private String nome;
	private String telefone;
	private String cpf;
	private String dataDeNascimento;
	private int matricula;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public String getDataDeNascimento() {
		return this.dataDeNascimento;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public void mostrar() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Telefone: "+this.telefone);
		System.out.println("CPF.: "+this.cpf);
		System.out.println("Data de nascimento: "+this.dataDeNascimento);
		System.out.println("Matrícula: "+this.matricula);
	}
}
