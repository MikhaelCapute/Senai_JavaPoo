package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import model.Usuario;
import util.Conexao;
import util.Configurador;

public class UsuarioDAO{
	
private static Configurador configurador = new Configurador(); 
	
	public static Usuario inserir(String login, String senha, int  tipo) {
		Usuario usuario = null;
		
		Conexao conexao = new Conexao(configurador.getUrl(),configurador.getDriver(),
				configurador.getLogin(),configurador.getSenha());
		Connection con = conexao.obterConexao();
		
		String sql = "insert into usuario(login,senha,tipo) values (?,?,?)";
		
		try {			
			PreparedStatement comando = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			comando.setString(1, login);
			comando.setString(2, senha);
			comando.setInt(3, tipo);
			
			if(comando.executeUpdate() > 0) {
				ResultSet rs = comando.getGeneratedKeys();
				if(rs.next()) {
					int id = rs.getInt(1);
					usuario = new Usuario(id, login, senha, tipo) {
												
						@Override
						public void mostrar() {
							
						}
					};
				}
				rs.close();
			}
			
			comando.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("Erro ao inserir no Banco de Dados.");
			System.out.println("Verifique sua instrução SQL.");
			System.out.println("Mensagem de erro: "+e.getMessage());
			e.printStackTrace();
		}
		
		return usuario;
		
	}
	
	// >>>>>>>>>>>>>>> BUSCAR TODOS:
	public static List<Usuario> BuscarTodos(){
		Usuario usuario = null;
		List<Usuario> usuarios = new LinkedList<Usuario>();
		
		Conexao conexao = new Conexao(configurador.getUrl(),configurador.getDriver(),
				configurador.getLogin(),configurador.getSenha());
		Connection con = conexao.obterConexao();
		
		String sql = "select * from usuario";
		
		
		
		return null;
	}
	
	// >>>>>>>>>>>>>>>EXCLUIR:
	public static boolean excluir(int id) {
		boolean ok = false;
		
		Conexao conexao = new Conexao(configurador.getUrl(), configurador.getDriver(), 
				configurador.getLogin(), configurador.getSenha());
		
		Connection con = conexao.obterConexao();
		
		// O ponto de interrogação é uma variável coringa, ou seja , vamos adicionar a ela algo dentro do comando.setAlgo(1, variavel);
		// Definindo o que vai entrar ali dentro da interrogação.
		String sql = "delete from usuario where id=?";
		
		try {
			PreparedStatement comando = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			// Esse 1 está executando ao primeiro ponto de interrogação da esquerda pra direita, então isso define a ordem
			// Que estamos colocando as variáveis
			comando.setInt(1, id);
			
			ok = comando.executeUpdate(sql) > 0;
			
			
		}catch(SQLException e) {
			
		}
		
		return ok;
		
	}
	
	
	/*
	public static boolean excluir(int id) {
		boolean ok = false;
		
		Conexao conexao = new Conexao(configurador.getUrl(),configurador.getDriver(),
				configurador.getLogin(),configurador.getSenha());
		Connection con = conexao.obterConexao();
		
		String sql = "delete from aluno where id=?";
		
		try {
			PreparedStatement comando = con.prepareStatement(sql);
			comando.setInt(1, id);
			
			ok = comando.executeUpdate() > 0;
			
			comando.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("Erro ao excluir no Banco de Dados.");
			System.out.println("Verifique sua instrução SQL.");
			System.out.println("Mensagem de erro: "+e.getMessage());
			e.printStackTrace();
		}
		return ok;
	}
	*/
	
}
