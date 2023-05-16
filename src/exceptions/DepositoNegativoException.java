package exceptions;

public class DepositoNegativoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public DepositoNegativoException() {
		super("Houve uma tentativa de depósito negativo");
	}
	
}
