package controller;

import java.sql.SQLException;

import consts.CodigoLogin;
import database.AdminDAO;
import model.Admin;

public class AdminController {
	
	AdminDAO dao = new AdminDAO();
	
	/**
	 * Controller da autenticação do usuário
	 * @param login nome de usuário fornecido
	 * @param senha senha fornecida
	 * @return objeto enum do tipo CodigoLogin
	 */
	public CodigoLogin autenticar(String login, String senha) {
		Admin user = new Admin(login, senha);
		boolean autenticado;
		autenticado = dao.autenticar(user);
		return (autenticado) ? CodigoLogin.SUCESSO : CodigoLogin.OUTRO_ERRO;
	}
}
