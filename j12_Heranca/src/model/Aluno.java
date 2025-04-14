package model;

public class Aluno extends Pessoa{
	private String matricula;
	private String curso;
	
	public Aluno() {
		super();
	}

	public Aluno(String nome, String rg, String cpf, String telefone, String email, String matricula, String curso) {
		super(nome, rg, cpf, telefone, email);
		this.matricula = matricula;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Matrícula: "+this.matricula);
		System.out.println("Curso: "+this.curso);
	}

	
}
