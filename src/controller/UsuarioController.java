package controller;

import java.util.ArrayList;
import consts.CodigoCadastro;
import database.UsuarioDAO;
import model.Usuario;

public class UsuarioController {
	
	ArrayList<Usuario> lista = new ArrayList<>();
	UsuarioDAO dao = new UsuarioDAO();
	
	public CodigoCadastro cadastrar(Usuario user) {
		//lista.add(user);
		CodigoCadastro retorno;
		retorno = dao.inserir(user);
		return retorno;
	}
	
	public void listar() {
		for (Usuario user : lista) {
			// Princípio Tell dont ask
			user.gerarRelatorio();
		}
	}
	
	public Usuario buscar(String cpf) {
		for (Usuario user : lista) {
			if (user.getCpf().equals(cpf)) { // Achou
				return user;
			}
		}
		return null; // Caso o usuário não tenha sido encontrado
	}
	
	public ArrayList<Usuario> buscarPorNome(String nome) {
		ArrayList<Usuario> lista = new ArrayList<>();
		for (Usuario user : lista) {
			if (user.getNome().contains(nome)) { // Achou
				lista.add(user);
			}
		}
		return lista;
	}
	
	
	
}
