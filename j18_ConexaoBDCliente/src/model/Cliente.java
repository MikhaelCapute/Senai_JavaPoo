package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private String email;

	public Cliente() {
		super();
	}

	public Cliente(int id) {
		super();
		this.id = id;
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

	/*
	 * 
	 * Passo 1:
	 * Carregar o driver do banco de dados.
	 * 
	 * Passo 2:
	 * Estabelecer uma conexão com o banco de dados
	 * (caminho do banco de dados, usuário e a senha).
	 * 
	 * Passo 3:
	 * Preparar a instrução SQL a ser enviada.
	 * 
	 * Passo 4:
	 * Realizar a operação desejada.
	 * 	Passo 4.1: Em caso de consulta, montar o(s) objeto(s)
	 * 			   que representa(m) a(s) linha(s) da(s) tabela(s).
	 * 
	 * Passo 5:
	 * Fechar tudo que abriu (ou seja, a conexão).
	 */

	public boolean carregarCliente(int id) throws ClassNotFoundException, SQLException {
		boolean ok = false;

		//Passo 1:
		Class.forName("com.mysql.cj.jdbc.Driver");

		//Passo 2:
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3303/cliente?useTimezone=true&serverTimezone=UTC","root","alunolab");

		//Passo 3:
		Statement stmt = con.createStatement();

		//Passo 4:
		ResultSet rs = stmt.executeQuery("select * from cliente where id="+id);

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

	public boolean inserirCliente() throws ClassNotFoundException, SQLException{
		boolean ok = false;

		//Passo 1:
		Class.forName("com.mysql.cj.jdbc.Driver");

		//Passo 2:
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3303/cliente?useTimezone=true&serverTimezone=UTC","root","alunolab");

		//Passo 3:
		Statement stmt = con.createStatement();

		//Passo 4:
		String sql = "insert into cliente(nome,cpf,email) values('"+getNome()+"','"+getCpf()+"','"+getEmail()+"')";

		ok = stmt.executeUpdate(sql) > 0;

		//Passo 5:
		stmt.close();
		con.close();

		return ok;

	}

	public boolean excluirCliente() throws ClassNotFoundException, SQLException {
		boolean ok = false;

		//Passo 1:
		Class.forName("com.mysql.cj.jdbc.Driver");

		//Passo 2:
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3303/cliente?useTimezone=true&serverTimezone=UTC","root","alunolab");

		//Passo 3:
		Statement stmt = con.createStatement();

		//Passo 4:
		String sql = "delete from cliente where id="+getId();

		ok = stmt.executeUpdate(sql) > 0;

		//Passo 5:
		stmt.close();
		con.close();

		return ok;		
	}

	public List<Cliente> carregarTodos() throws ClassNotFoundException,SQLException{
		//Passo 1:
		Class.forName("com.mysql.cj.jdbc.Driver");

		//Passo 2:
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3303/cliente?useTimezone=true&serverTimezone=UTC","root","alunolab");

		//Passo 3:
		Statement stmt = con.createStatement();

		//Passo 4:
		String sql = "select * from cliente";
		ResultSet rs = stmt.executeQuery(sql);

		//Passo 4.1:
		List<Cliente> lista = new LinkedList<Cliente>();

		while(rs.next()) {
			Cliente cliente = new Cliente();

			cliente.setId(rs.getInt("id"));
			cliente.setNome(rs.getString("nome"));
			cliente.setCpf(rs.getString("cpf"));
			cliente.setEmail(rs.getString("email"));

			lista.add(cliente);
		}

		//Passo 5:
		rs.close();
		stmt.close();
		con.close();

		return lista;

	}

	public boolean atualizarCliente() throws ClassNotFoundException,SQLException{
		boolean ok = false;

		//Passo 1:
		Class.forName("com.mysql.cj.jdbc.Driver");

		//Passo 2:
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3303/cliente?useTimezone=true&serverTimezone=UTC","root","alunolab");

		//Passo 3:
		Statement stmt = con.createStatement();

		//Passo 4:
		String sql = "update cliente set nome='"+getNome()+"',cpf='"+getCpf()+"',email='"+
						getEmail()+"' where id="+getId();
		
		ok = stmt.executeUpdate(sql) > 0;
		
		//Passo 5:
		stmt.close();
		con.close();
		
		return ok;
	}

}
