package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
}
