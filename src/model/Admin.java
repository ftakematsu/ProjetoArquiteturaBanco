package model;

import consts.CodigoLogin;

public class Admin {
	private String login;
	private String senha;
	
	public Admin(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	/**
	 * Valida o login.
	 * 0 - sucesso, 1 - usuário incorreto, 2 - senha incorreta
	 * @param admin 
	 * @return objeto que representa as credenciais originais
	 */
	public CodigoLogin validar(Admin admin) {
		if (this.login.equals(admin.login) && 
			this.senha.equals(admin.senha)) {
			return CodigoLogin.SUCESSO;
		}
		else if (!this.login.equals(admin.login)){
			return CodigoLogin.ERRO_USUARIO;
		}
		else if (!this.senha.equals(admin.senha)) {
			return CodigoLogin.ERRO_SENHA;
		}
		return CodigoLogin.OUTRO_ERRO;
	}
	
	
}
