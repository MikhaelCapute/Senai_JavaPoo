package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Aluno;
import model.Usuario;
import util.Conexao;
import util.Configurador;

public class AlunoDAO {
	
	private static Configurador configurador = new Configurador();
	
	public static Aluno inserir(String login, String senha, int tipo, int matricula, String nome, String turno, String turma) {
		Aluno aluno = null;
		
		Conexao conexao = new Conexao(configurador.getUrl(),configurador.getDriver(),
				configurador.getLogin(),configurador.getSenha());
		Connection con = conexao.obterConexao();
		
		Usuario usuario = UsuarioDAO.inserir(login, senha, tipo);
		
		String sql = "insert into aluno(id, matriculaAluno, nome, turno, turma) values (?,?,?,?,?)";
		
		try {
			PreparedStatement comando = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			comando.setInt(1, usuario.getId());
			comando.setInt(2, matricula);
			comando.setString(3, nome);
			comando.setString(4, turno);
			comando.setString(5, turma);
			
			if (comando.executeUpdate() > 0) {
				ResultSet rs = comando.getGeneratedKeys();
				if(rs.next()) {
					int id = rs.getInt(1);
					aluno = new Aluno(id, login, senha, tipo, matricula, nome, turno, turma);
				}
			
			}
			
			
		} catch(SQLException e) {
			System.out.println("Erro ao inserir no banco de dados.");
			System.out.println("Verifique a sua instrução SQL.");
			System.out.println("Mensagem: " + e.getMessage());
		}
		return aluno;
	}
	
}
