package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Admin;

public class AdminDAO extends DAO {
	
	public boolean autenticar(Admin admin) {
		String u=admin.getLogin(), s=admin.getSenha();
		String sql = "select * from administrador "
				+ "where usuario=? and senha=?";
		//System.out.println(sql);
		PreparedStatement statement;
		try {
			// Cria uma string SQL parametrizada
			statement = connection.prepareStatement(sql);
			
			// Substituir a ? por dados 
			statement.setString(1, u); // 1 - primeira ?
			statement.setString(2, s); // 2 - segunda ?
			
			ResultSet result = statement.executeQuery();
			
			result.next();
			//System.out.println("tamanho = " + result.getRow());
			return (result.getRow()>0);

		} catch (SQLException e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	
}
