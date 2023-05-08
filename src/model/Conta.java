package model;

public class Conta {
	
	private double saldo;
	
	public Conta() {
		this.saldo = 0;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
