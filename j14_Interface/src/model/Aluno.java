package model;

public class Aluno extends Usuario implements IUsuario{
	private int matriculaAluno;
	private String nome;
	private String turno;
	private String turma;
	
	public Aluno() {
		super();
	}

	public Aluno(String login, String senha, int tipo, int matriculaAluno, String nome, String turno, String turma) {
		super(login, senha, tipo);
		this.matriculaAluno = matriculaAluno;
		this.nome = nome;
		this.turno = turno;
		this.turma = turma;
	}

	public int getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(int matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	@Override
	public void mostrar() {
		System.out.println("Informações Aluno:");
		System.out.println("Login: " + this.getLogin()); 
		System.out.println("Senha: ******");
		
		System.out.println("Matricula " + this.getMatriculaAluno());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Turno: " + this.getTurno());
		System.out.println("Turma: " + this.getTurma());

	}
	
	@Override
	public boolean validarLogin(String login, String senha) {
		if (this.getLogin().equals(login) && this.getSenha().equals(senha)) {
			return true;
		} 
		return false;
		
	}
	
}
