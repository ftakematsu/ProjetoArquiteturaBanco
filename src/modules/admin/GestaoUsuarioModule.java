package modules.admin;
import java.util.*;

import consts.CodigoCadastro;
import controller.UsuarioController;
import model.Usuario;

public class GestaoUsuarioModule {
	
	static UsuarioController controller = new UsuarioController();
	
	static Scanner scan = new Scanner(System.in);
	public static void menu() {
		int opcao=0;
		do {
			System.out.println("\nGESTÃO DE USUÁRIOS");
			System.out.println("(1) Cadastrar usuário");
			System.out.println("(2) Listar usuários");
			System.out.println("(3) Buscar um usuário");
			System.out.println("(0) Sair do painel administrativo");
			System.out.print("OPÇÃO: ");
			opcao = scan.nextInt();
			switch (opcao) {
				case 1: 
					cadastrarUsuario();
					break;
				case 2:
					listarUsuario();
					break;
				case 3:
					buscarUsuario();
					break;
				case 0:
					System.out.println("Saindo...");
					break;
			}
		} while (opcao!=0);
	}
	
	public static void listarUsuario() {
		controller.listar();
	}
	
	public static void cadastrarUsuario() {
		String nome, email, cpf;
		scan.nextLine();
		System.out.print(" - Nome: ");
		nome = scan.nextLine();
		System.out.print(" - E-mail: ");
		email = scan.nextLine();
		System.out.print(" - CPF (somente números): ");
		cpf = scan.nextLine();
		// Criar uma model
		Usuario user = new Usuario(nome, email, cpf);
		CodigoCadastro retorno = controller.cadastrar(user);
		switch (retorno) {
			case SUCESSO:
				System.out.println("Usuário cadastrado com sucesso!");
				break;
			case ERRO:
				System.err.println("Ocorreu um erro");
				break;
		}
	}
	
	public static void buscarUsuario() {
		scan.nextLine();
		System.out.print(" - CPF (somente números): ");
		String cpf = scan.nextLine();
		
		Usuario user = controller.buscar(cpf);
		if (user!=null) { // Se o usuário foi encontrado
			// Princípio Tell dont ask
			user.gerarRelatorio();
		}
		else {
			System.err.println("Usuário não encontrado!");
		}
	}
	
	
}
