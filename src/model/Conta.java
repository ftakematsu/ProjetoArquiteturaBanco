package model;

import exceptions.DepositoNegativoException;

public class Conta {
	
	private int numero;
	private double saldo;
	private Usuario titular;
	
	public Conta(int numero) {
		this.numero = numero;
		this.saldo = 0;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void depositar(double valor) throws DepositoNegativoException {
		if (valor<0)
			throw new DepositoNegativoException();
		saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public Usuario getUsuario() {
		return titular;
	}
	
	public void vincularCliente(Usuario titular) {
		this.titular = titular;
	}
	
	public void transferir(Conta destino, double valor) {
		this.saldo -= valor;
		destino.saldo += valor;
	}
	
}
