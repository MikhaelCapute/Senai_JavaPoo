package model;

public class Professor extends Usuario implements IUsuario{
	
	private int matriculaProf;
	private String nome;
	private String especialidade;
	
	public Professor() {
		super();
	}

	public Professor(String login, String senha, int tipo, int matriculaProf, String nome, String especialidade) {
		super(login, senha, tipo);
		this.matriculaProf = matriculaProf;
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public int getMatriculaProf() {
		return matriculaProf;
	}

	public void setMatriculaProf(int matriculaProf) {
		this.matriculaProf = matriculaProf;
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
	public void mostrar() {
		System.out.println("Informações Professor: ");
		System.out.println("Login: " + this.getLogin());
		System.out.println("Senha: ***** ");
		
		System.out.println("Matricula: " + this.getMatriculaProf());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Especialidade: " + this.getEspecialidade());
		
	}
	
	@Override
	public boolean validarLogin(String login, String senha) {
		if(this.getLogin().equals(login) && this.getSenha().equals(senha)) {
			return true;
		}
		return false;
	}
	
	
}
