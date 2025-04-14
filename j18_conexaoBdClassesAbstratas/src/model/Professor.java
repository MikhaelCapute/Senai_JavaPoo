package model;

public class Professor extends Usuario{
	
	private int id;
	private int matriculaProfessor;
	private String nome;
	private String especialidade;
	
	public Professor() {
		super();
	}

	public Professor(int id, String login, String senha, int tipo, int matriculaProfessor, String nome, String especialidade) {
		super(id, login, senha, tipo);
		this.matriculaProfessor = matriculaProfessor;
		this.nome = nome;
		this.especialidade = especialidade;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMatriculaProfessor() {
		return matriculaProfessor;
	}

	public void setMatriculaProfessor(int matriculaProfessor) {
		this.matriculaProfessor = matriculaProfessor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\n"+
			   "Matrícula professor: "+this.matriculaProfessor+"\n"+
			   "Nome: "+this.nome+"\n"+
			   "Especialidade: "+this.especialidade;
	}

	@Override
	public void mostrar() {
		System.out.println("Informações de professor:");
		System.out.println("Login: "+this.getLogin());
		System.out.println("Senha: *****");
		
		System.out.println("Matrícula: "+this.matriculaProfessor);
		System.out.println("Nome: "+this.nome);
		System.out.println("Especialidade: "+this.especialidade);
	}
}








