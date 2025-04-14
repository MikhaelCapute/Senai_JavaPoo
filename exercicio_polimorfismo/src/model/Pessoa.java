package model;

public class Pessoa {
	
	private String nome;
	private String nasc;
	private int avaliacao;
	private double salario;
	private Endereco endereco;
	
	public Pessoa(String nome, String nasc, int avaliacao, double salario) {
		super();
		this.nome = nome;
		this.nasc = nasc;
		this.avaliacao = avaliacao;
		this.salario = salario;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}



	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}



	public Pessoa() {
		super();
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
		if (avaliacao < 0) {
			this.avaliacao = 0;
		} else if(avaliacao > 10) {
			this.avaliacao = 10;
		} else {
			this.avaliacao = avaliacao;
		}
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario < 1.412) {
			this.salario = 1.412;
		} else {
			this.salario = salario;
		}	
	}
	
	public double calcularSaldo() {
		return this.salario;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + 
				", nasc=" + nasc + 
				", avaliacao=" + avaliacao + 
				", salario=" + salario + "]";
	}
}
