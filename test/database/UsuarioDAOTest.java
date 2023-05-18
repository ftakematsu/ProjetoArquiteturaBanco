package database;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.Usuario;

public class UsuarioDAOTest {
	
	UsuarioDAO dao;
	
	@Before
	public void setUp() {
		dao = new UsuarioDAO();
	}

	@Test
	public void selectTest() {
		List<Usuario> lista =  dao.buscarTodos();
		for (Usuario usuario : lista) {
			usuario.gerarRelatorio();
		}
		assertTrue(true);
	}
	
	@After
	public void tearDown() {
		dao.fechar();
	}

}
