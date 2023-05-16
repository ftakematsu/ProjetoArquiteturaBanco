package model;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UsuarioContaTest {
	
	Conta c;
	
	@Before
	public void setUp() {
		c = new Conta(1234);
	}
	
	@Test
	public void atribuirNumeroContaTest() {
		c.setNumero(1234);
		assertThat(c.getNumero(), is(1234));
	}

	@Test
	public void atribuirUsuarioContaTest() {
		c.vincularCliente(
			new Usuario("fulano", "fulano@mail.com", "12345")
		);
		assertThat(c.getUsuario().getNome(), is("fulano"));
		assertThat(c.getUsuario().getEmail(), is("fulano@mail.com"));
		assertThat(c.getUsuario().getCpf(), is("12345"));
	}
	
}
