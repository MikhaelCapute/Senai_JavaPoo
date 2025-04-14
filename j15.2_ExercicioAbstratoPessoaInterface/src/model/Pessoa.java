package model;

import ordena.Comparador;

/*
 -Converter a classe Pessoa em abstrata;
 -Converter o método calculaSal em abstrato;
 -Corrigir os erros que aparecerão para que o sistema funcione corretamente.

 */

public abstract class Pessoa implements Comparador{
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
	
	public abstract double calculaSal();
	
	@Override
	public String toString() {
		return "Nome: "+this.nome+"\n"+
			   "Nascimento: "+this.nasc+"\n"+
			   "Avaliação: "+this.avaliacao+"\n"+
			   "Salário: R$"+this.salario+"\n"+
			   "Endereço:\n"+this.endereco.toString();
	}
	
	@Override
	public int comparadoA(Comparador comparador) {
		Pessoa pessoa = (Pessoa)comparador;
		if(this.avaliacao > pessoa.avaliacao) {
			return MAIOR;
		}else {
			if(this.avaliacao < pessoa.avaliacao) {
				return MENOR;
			}
		}
		return IGUAL;
	}
		
}
