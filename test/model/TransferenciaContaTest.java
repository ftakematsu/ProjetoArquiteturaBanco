package model;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exceptions.DepositoNegativoException;

public class TransferenciaContaTest {
	
	Conta conta1;
	Conta conta2;
	
	@Before
	public void setUp() {
		conta1 = new Conta(1234);
		conta2 = new Conta(5678);
	}

	@Test
	public void transferenciaConta1Test() throws DepositoNegativoException {
		// Cenário
		conta1.depositar(1000);
		conta2.depositar(1000);
		
		// Execução
		conta1.transferir(conta2, 200);
		
		// Validação
		assertThat(conta1.getSaldo(), is(800.0));
		assertThat(conta2.getSaldo(), is(1200.0));
	}
	
	@Test
	public void transferenciaConta2Test() throws DepositoNegativoException {
		// Cenário
		conta1.depositar(1000);
		conta2.depositar(1000);
		
		// Execução
		conta1.transferir(conta2, 400);
		
		// Validação
		assertThat(conta1.getSaldo(), is(600.0));
		assertThat(conta2.getSaldo(), is(1400.0));
	}
	
	@Test
	public void transferenciaValorMaiorSaldoTest() throws DepositoNegativoException {
		// Cenário
		conta1.depositar(1000);
		conta2.depositar(1000);
		
		// Execução
		conta1.transferir(conta2, 1500);
		fail(); // Se deixar transferir, falhar o teste
		// TODO definir o comportamento esperado
				

	}
	

}
