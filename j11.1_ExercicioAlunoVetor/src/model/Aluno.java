package model;

public class Aluno {
	private String nome;
	private double[] notas = new double[4];
	private double media;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, double[] notas) {
		super();
		this.nome = nome;
		this.notas = notas;
		this.calcularMedia();
	}

	public Aluno(String nome, double[] notas, double media) {
		super();
		this.nome = nome;
		this.notas = notas;
		this.media = media;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	public void calcularMedia() {
		double soma = 0;
		for(int i=0;i<this.notas.length;i++) {
			soma=soma+this.notas[i];
		}
		this.media = soma/this.notas.length;
	}
	
	public void mostrar() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Notas:");
		for(int i=0;i<this.notas.length;i++) {
			System.out.println("  Nota "+(i+1)+": "+this.notas[i]);
		}
		System.out.println("Média: "+this.media);
	}	
}
