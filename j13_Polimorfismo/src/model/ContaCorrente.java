package model;

public class ContaCorrente {
	private String titular;
	private String agencia;
	private String numeroConta;
	private double saldo;
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String titular, String agencia, String numeroConta, double saldo) {
		super();
		this.titular = titular;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double calcularSaldo() {
		return this.saldo;
	}
	
	//@Override
	public String toString() {
		return "Titular: "+this.titular+"\n"+
			   "Agência: "+this.agencia+"\n"+
			   "Numero da conta: "+this.numeroConta+"\n"+
			   "Saldo: "+this.saldo;
	}
	
	public double getLimite() {
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
}
