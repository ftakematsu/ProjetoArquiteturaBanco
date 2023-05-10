package database;

import java.sql.*;
import consts.*;
import model.Usuario;

public class UsuarioDAO extends DAO {
	public CodigoCadastro inserir(Usuario user) {
		String sql = 
				"INSERT INTO usuario(nome, email, cpf)"
				+ " VALUES(?, ?, ?)";
		try {
			PreparedStatement statement = 
					connection.prepareStatement(sql);
			statement.setString(1, user.getNome());
			statement.setString(2, user.getEmail());
			statement.setString(3, user.getCpf());
			statement.execute();
		} catch (SQLException e) {
			return CodigoCadastro.ERRO;
		}
		return CodigoCadastro.SUCESSO;
	}
}
