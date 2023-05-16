import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import model.DepositoContaTest;
import model.TransferenciaContaTest;
import model.UsuarioContaTest;

@RunWith(Suite.class)
@SuiteClasses({
	UsuarioContaTest.class,
	DepositoContaTest.class,
	TransferenciaContaTest.class,
})
public class AllTests {

}
