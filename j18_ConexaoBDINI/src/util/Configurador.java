package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configurador {
	public String url;
	private String driver; 
	private String login;
	private String senha;
	
	public Configurador() {
		
		try {
			FileInputStream arquivo = new FileInputStream("config.ini");
			
			//criando um objeto properties
			Properties propriedades = new Properties();
			
			arquivo.close();
			
			url = propriedades.getProperty("url");
			driver = propriedades.getProperty("driver");
			login = propriedades.getProperty("login");
			senha = propriedades.getProperty("senha");
			
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao abrir arquivo config.ini ou  arquivo inexistente.");
			System.out.println("Mensagem de erro: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erro ao manipular arquivo de configurações ou dados inconsistentes");
			System.out.println("Mensagem de erro: " + e.getMessage());
			e.printStackTrace();
		}
		
	}

	public String getUrl() {
		return url;
	}

	public String getDriver() {
		return driver;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}
	
	
	
}
