package model;

public abstract class Usuario implements Comparador {
	private String login;
	private String senha;
	private int tipo;
	
	public Usuario() {
		super();
	}

	public Usuario(String login, String senha, int tipo) {
		super();
		this.login = login;
		this.senha = senha;
		this.tipo = tipo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public abstract void mostrar();
	
	@Override
	public int comparadoA(Comparador comparador) {
		Usuario usuario = (Usuario)comparador;
		if(this.login.compareTo(usuario.login) > 0) {
			return MAIOR;
		}else {
			if(this.login.compareTo(usuario.login) < 0) {
				return MENOR;
			}
		}
		return IGUAL;
	}
	
	
	
	
}
