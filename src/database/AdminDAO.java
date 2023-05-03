package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Admin;

public class AdminDAO extends DAO {
	
	public boolean autenticar(Admin admin) throws SQLException {
		String u=admin.getLogin(), s=admin.getSenha();
		String sql = "select * from administrador "
				+ "where usuario='"+u+ "' and senha='"+s+"'";
		//System.out.println(sql);
		PreparedStatement statement = 
				connection.prepareStatement(sql);
		ResultSet result = statement.executeQuery();
		
		
		result.next();
		//System.out.println("tamanho = " + result.getRow());
		return (result.getRow()>0);
	}
	
}
