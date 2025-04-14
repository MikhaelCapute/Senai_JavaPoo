package model;

public class ContaEspecial extends ContaCorrente{
	private double limite;

	public ContaEspecial() {
		super();
	}

	public ContaEspecial(String titular, String agencia, String numeroConta, double saldo, double limite) {
		super(titular, agencia, numeroConta, saldo);
		this.limite = limite;
	}

	@Override
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public double calcularSaldo() {
		return super.calcularSaldo()+this.limite;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\n"+
			   "Limite: "+this.limite;
	}
	
}
