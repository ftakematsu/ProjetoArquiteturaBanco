package demo;

import java.sql.*;

public class Main {

	public static void main(String[] args) {
		String usuario = "root";
		String senha = "";
		try {
			Connection connection = 
				DriverManager.
				getConnection("jdbc:mysql://localhost/arquitetura", usuario, senha);
			System.out.println("Conexão efetuada com sucesso!");
			
			String u="admin", s="12342";
			
			String sql = "select * from administrador "
					+ "where usuario='"+u+ "' and senha='"+s+"'";
			System.out.println(sql);
			PreparedStatement statement = 
					connection.prepareStatement(sql);
			ResultSet result = statement.executeQuery();
			
			
			result.next();
			System.out.println("tamanho = " + result.getRow());
			if (result.getRow()>0)
				System.out.println(result.getInt("id") + "\t" + 
							   result.getString("usuario"));
			else {
				System.out.println("credenciais inválidas!");
			}
			
			connection.close();
		}
		catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
