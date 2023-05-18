package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * DAO: Data Access Object 
 * Objeto de Acesso a Dados: responsável por isolar 
 * a responsabilidade de conexão e manipulação com banco de dados
 * com o restante do sistema.
 * @author Fabio
 */
public abstract class DAO {
	private String usuario="root";
	private String senha="";
	protected Connection connection;
	
	public DAO() {
		try {
			connection = 
				DriverManager.
				getConnection("jdbc:mysql://localhost/arquitetura", usuario, senha);
		}
		catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	public void fechar() {
		try {
			connection.close();
		} catch (SQLException e) {
			System.err.println("Erro ao fechar a conexão");
		}
	}
	
}
