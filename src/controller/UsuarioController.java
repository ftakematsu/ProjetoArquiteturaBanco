package controller;

import java.util.ArrayList;

import consts.CodigoCadastro;
import model.Usuario;

public class UsuarioController {
	
	ArrayList<Usuario> lista = new ArrayList<>();
	
	public CodigoCadastro cadastrar(Usuario user) {
		lista.add(user);
		return CodigoCadastro.SUCESSO;
	}
	
	public void listar() {
		for (Usuario user : lista) {
			System.out.println(" - Nome: " + user.getNome());
			System.out.println(" - E-mail: " + user.getEmail());
			System.out.println(" - CPF: " + user.getCpf());
		}
	}
	
}
