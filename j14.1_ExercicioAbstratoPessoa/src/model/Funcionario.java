package model;

public class Funcionario extends Pessoa{
	private String setor;

	public Funcionario() {
		super();
	}

	public Funcionario(String nome, String nasc, int avaliacao, double salario, Endereco endereco, String setor) {
		super(nome, nasc, avaliacao, salario, endereco);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	@Override
	public double calculaSal() {
		double metadeAval = (double)this.getAvaliacao()/2;
		double porcentBonus = metadeAval / 100;
		double valorBonus = this.getSalario() * porcentBonus;
		return this.getSalario() + valorBonus;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\n"+
			   "Setor: "+this.setor;
	}
	
	
	
	
}
