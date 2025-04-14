package model;

public class Funcionario extends Pessoa{
	
	private String setor;

	public Funcionario(String nome, String nasc, int avaliacao, double salario, String setor) {
		super(nome, nasc, avaliacao, salario);
		this.setor = setor;
	}

	public Funcionario(String setor) {
		super();
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" +
		"Funcionario [setor=" + setor + "]";
	}

	@Override
	public double calcularSaldo() {
		double metadeVal = (double) this.getAvaliacao()/2;
		double porcentBonus = metadeVal / 100;
		double valorBonus = super.calcularSaldo() * porcentBonus;
		return valorBonus + valorBonus;
	}
	
}
