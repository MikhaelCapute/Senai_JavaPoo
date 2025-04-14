package model;

public class Gerente extends Pessoa{
	private String projeto;
	
	public Gerente() {
		super();
	}

	public Gerente(String nome, String nasc, int avaliacao, double salario, Endereco endereco, String projeto) {
		super(nome, nasc, avaliacao, salario, endereco);
		this.projeto = projeto;
	}

	public String getProjeto() {
		return projeto;
	}

	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}
	

	@Override
	public double calculaSal() {
		double valorBonusSal = super.calculaSal() * 1.6;
		double porcentBonus = (double)this.getAvaliacao()/100;
		double valorBonusAval = valorBonusSal * porcentBonus;
		return valorBonusSal + valorBonusAval;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\n"+
			   "Projeto: "+this.projeto;
	}

}
