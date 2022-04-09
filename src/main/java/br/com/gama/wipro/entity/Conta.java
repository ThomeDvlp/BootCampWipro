package br.com.gama.wipro.entity;

public abstract class Conta {

	protected int numero;

	protected float saldo;

	protected CartaoDeCredito cartaoDeCredito;

	public Conta(int numero, float saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public CartaoDeCredito getCartaoDeCredito() {
		return cartaoDeCredito;
	}

	public int getNumero() {
		return numero;
	}

	public float getSaldo() {
		return saldo;
	}

	protected void depositar(float valor) {
		this.saldo = (saldo + valor);
	}

	protected void sacar(float valor) {
		this.saldo = (saldo - valor);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [numero=" + numero + ", saldo=" + saldo + ", cartaoDeCredito="
				+ cartaoDeCredito + "]";
	}
}