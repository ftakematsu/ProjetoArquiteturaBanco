package model;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class ContaTest {
	
	@Test
	public void depositoTest1() {
		Conta c = new Conta();
		c.depositar(50.0);
		assertThat(c.getSaldo(), is(50.0));		
	}
	
	@Test
	public void depositoTest2() {
		Conta c = new Conta();
		c.depositar(100.0);
		assertThat(c.getSaldo(), is(100.0));
	}
	
	@Test
	public void depositoContinuoTest() {
		Conta c = new Conta();
		c.depositar(50.0);
		c.depositar(100.0);
		assertThat(c.getSaldo(), is(150.0));
	}

}





