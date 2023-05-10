package modules.admin;

import java.util.Scanner;
import consts.CodigoLogin;
import controller.AdminController;

public class AdminLoginModule {
	static Scanner scan = new Scanner(System.in);
	
	public static void adminLogin() {
		String login, senha;
		AdminController adminController = new AdminController();
		
		System.out.print("Login: ");
		login = scan.nextLine();
		System.out.print("Senha: ");
		senha = scan.nextLine();
		
		CodigoLogin responseLogin;
		responseLogin = adminController.autenticar(login, senha);
		
		switch (responseLogin) {
			case SUCESSO:
				System.out.println("Login realizado com sucesso!");
				GestaoUsuarioModule.menu();
				break;
			case ERRO_USUARIO:
				System.out.println("Usuário não encontrado!");
				break;
			case ERRO_SENHA:
				System.out.println("Senha incorreta!");
				break;
			default:
				System.out.println("Ocorreu um erro!");
				
		}
	}
}
