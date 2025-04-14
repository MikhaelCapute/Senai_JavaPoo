package model;

public class Pessoa {
	private String nome;
	private String nasc;
	private int avaliacao;
	private double salario;
	private Endereco endereco;
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String nasc, int avaliacao, double salario, Endereco endereco) {
		super();
		this.nome = nome;
		this.nasc = nasc;
		this.setAvaliacao(avaliacao);
		this.setSalario(salario);
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNasc() {
		return nasc;
	}

	public void setNasc(String nasc) {
		this.nasc = nasc;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		if(avaliacao < 0) {
			this.avaliacao = 0;
		}else {
			if(avaliacao > 10) {
				this.avaliacao = 10;
			}else {
				this.avaliacao = avaliacao;
			}
		}	
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if(salario < 1412) {
			this.salario = 1412;
		}else {
			this.salario = salario;
		}
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public double calculaSal() {
		return this.salario;
	}
	
	@Override
	public String toString() {
		return "Nome: "+this.nome+"\n"+
			   "Nascimento: "+this.nasc+"\n"+
			   "Avaliação: "+this.avaliacao+"\n"+
			   "Salário: R$"+this.salario+"\n"+
			   "Endereço:\n"+this.endereco.toString();
	}
		
}
