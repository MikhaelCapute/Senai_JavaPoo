package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private String email;
	
	public Cliente() {
		super();
	}
	public Cliente(int id, String nome, String cpf, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	
	public Cliente(String nome, String cpf, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + "]";
	}
	
	//5 passos para fazer um acesso a banco em java;
	
	/*
	 * 1 - Carregar o driver;
	 * 
	 * 2 - Estabelecer uma conexão com o banco de dados(caminho do banco, usuário e a senha);
	 * 
	 * 3 - Preparar a instrução SQL a ser enviada;
	 * 
	 * 4 - Realizar a opereção desejada;
	 * 4.1 - Em caso de consulta , montar o(s) objeto(s) que representa(m) a(s) linhas da tabela(s).
	 * 
	 * 5 - Fechar tudo que abriu, ou seja, conexão; 
	 * 
	 */
	
	public boolean carregarCliente(int id) throws ClassNotFoundException, SQLException {
		boolean ok = false;
		
		//Receita de bolo para Conexão com banco de dados e consulta;
		
		//Passo 1 (Carregando drive):
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Passo 2 (Conexão):
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/cliente2?useTimezone=True&serverTimezone=UTC", "root", "alunolab");
		
		//Passo 3 (Preparar Instrução):
		Statement stmt = con.createStatement();
		
		//Passo 4 (Executando o código dentro do SQL no Java):
		ResultSet rs = stmt.executeQuery("select * from contato where id="+id); //revolveremos o problema de sqlInjection depois
		
		if(rs.next()) {
			ok = true;
			setId(rs.getInt("id"));
			setNome(rs.getString("nome"));
			setCpf(rs.getString("cpf"));
			setEmail(rs.getString("email"));
		}
		
		//Passo 5:
		rs.close();
		stmt.close();
		con.close();
		
		return ok;
		
	}
	
	public boolean inserir() throws ClassNotFoundException, SQLException {
		boolean ok = false;
		
		//Passo 1 (Carregando drive):
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Passo 2 (Conexão):
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/cliente2?useTimezone=True&serverTimezone=UTC", "root", "alunolab");
		
		//Passo 3 (Preparar Instrução):
		Statement stmt = con.createStatement();
		
		//Passo 4 (Executando o código dentro do SQL no Java):
		String sql = "insert into contato(nome, cpf, email) values('" + getNome() + "','"  + getCpf() + "','" +  getEmail() + "')";
		
		ok = stmt.executeUpdate(sql) > 0;
		
		//Passo 5:
		
		con.close();
		stmt.close();
		
		return ok;
	}
	
}
