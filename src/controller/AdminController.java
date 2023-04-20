package controller;

import consts.CodigoLogin;
import model.Admin;

public class AdminController {
	/**
	 * Controller da autenticação do usuário
	 * @param login nome de usuário fornecido
	 * @param senha senha fornecida
	 * @return objeto enum do tipo CodigoLogin
	 */
	public CodigoLogin autenticar(String login, String senha) {
		// TODO obter os dados das credenciais de um banco de dados
		Admin admin = new Admin("admin", "1234");
		Admin user = new Admin(login, senha);
		return user.validar(admin);
	}
}
