package modules;
import java.util.*;

import modules.admin.AdminLoginModule;

public class MainModule {
	static Scanner scan = new Scanner(System.in);
	
	public static void menuPrincipal() {
		int opcao = 0;
		do {
			System.out.println("SELECIONE O QUE DESEJA FAZER");
			System.out.println("(1) Painel administrativo");
			System.out.println("(2) Acessar minha conta");
			System.out.println("(0) Sair");
			System.out.print("OPÇÃO: ");
			opcao = scan.nextInt();
			switch (opcao) {
				case 1:
					AdminLoginModule.adminLogin();
					break;
				case 2:
					break;
				case 0:
					System.out.println("Saindo...");
				default:
					System.out.println("Opção inválida!\n");
			}
		} while (opcao!=0);
	}
}
