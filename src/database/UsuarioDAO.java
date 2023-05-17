package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
	
	public List<Usuario> buscarTodos() {
		String sql = "SELECT * FROM usuario";
		ArrayList<Usuario> lista = new ArrayList<>();
		try {
			PreparedStatement statement = 
					connection.prepareStatement(sql);
			// Resulta em uma lista (iterador)
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) { // iterador
				lista.add(Usuario.fromResultSet(resultSet));
			}
			return lista;
		}
		catch (SQLException e) {
			// TODO: handle exception
			return null;
		}
		
	}
	
	
	
	
	
}
