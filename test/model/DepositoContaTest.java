package model;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

import exceptions.DepositoNegativoException;

public class DepositoContaTest {
	
	Conta c;
	
	@Before
	public void setUp() {
		c = new Conta(1234);
	}
	
	@Test
	public void depositoTest1() throws DepositoNegativoException {
		c.depositar(50.0);
		assertThat(c.getSaldo(), is(50.0));		
	}
	
	@Test
	public void depositoTest2() throws DepositoNegativoException {
		c.depositar(100.0);
		assertThat(c.getSaldo(), is(100.0));
	}
	
	@Test
	public void depositoContinuoTest() throws DepositoNegativoException {
		c.depositar(50.0);
		c.depositar(100.0);
		assertThat(c.getSaldo(), is(150.0));
	}
	
	@Test
	public void depositoZeroTest() throws DepositoNegativoException {
		c.depositar(0);
		assertThat(c.getSaldo(), is(0.0));
	}
	
	@Test
	public void depositoNegativoTest() {
		try {
			c.depositar(-1);
			fail();
		}
		catch(DepositoNegativoException e) {
			assertTrue(true);
		}
	}
	
	@Test
	public void depositoNegativo2Test() {
		try {
			Conta c = new Conta(1234);
			c.depositar(-10);
			fail();
		}
		catch(DepositoNegativoException e) {
			assertTrue(true);
		}
	}

}





