package model;

public class Gerente extends Pessoa{
	
	private String projeto;

	public Gerente(String nome, String nasc, int avaliacao, double salario, String projeto) {
		super(nome, nasc, avaliacao, salario);
		this.projeto = projeto;
	}

	public Gerente() {
		super();
	}

	public String getProjeto() {
		return projeto;
	}

	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}

	@Override
	public String toString() {
		return  super.toString() + "\n" + 
		"Gerente [projeto=" + projeto + "]";
	}
	
	@Override
	public double calcularSaldo() {
		double valBonusSal = super.calcularSaldo() * 1.6;
		double percentBonus = (double)this.getAvaliacao()/100;
		double valBonusAval = percentBonus * valBonusSal;
		return valBonusSal + valBonusAval;
		
	}
	
	
}
