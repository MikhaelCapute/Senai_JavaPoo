package model;

public class Professor {
	private String nome;
	private String telefone;
	private int registroFuncional;
	private String dataDeNascimento;
	
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
	
	public void setRegistroFuncional(int registroFuncional) {
		this.registroFuncional = registroFuncional;
	}
	
	public int getRegistroFuncional() {
		return this.registroFuncional;
	}
	
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public String getDataDeNascimento() {
		return this.dataDeNascimento;
	}
	
	public void mostrar() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Telefone: "+this.telefone);
		System.out.println("Registro funcional: "+this.registroFuncional);
		System.out.println("Data de nascimento: "+this.dataDeNascimento);
	}
}
