package controller;
import model.Carro;
import model.Funcionario;
import model.Livro;
import model.Produto;

public class Cadastro {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.fabricante = "Honda";
		c1.modelo = "Fit";
		c1.cor = "Prata";
		c1.ano = 2020;
		
		System.out.println("Carro 01:");
		System.out.println("Fabricante: "+c1.fabricante);
		System.out.println("Modelo: "+c1.modelo);
		System.out.println("Cor: "+c1.cor);
		System.out.println("Ano: "+c1.ano);
		
		Carro c2 = new Carro();
		c2.fabricante = "Chevrolet";
		c2.modelo = "Camaro";
		c2.cor = "Amarelo";
		c2.ano = 2021;
		
		System.out.println();
		System.out.println("Carro 02:");
		System.out.println("Fabricante: "+c2.fabricante);
		System.out.println("Modelo: "+c2.modelo);
		System.out.println("Cor: "+c2.cor);
		System.out.println("Ano: "+c2.ano);
		
		Carro c3 = new Carro();
		c3.fabricante = "VW";
		c3.modelo = "Fox";
		c3.cor = "Vermelho";
		c3.ano = 2017;
		
		System.out.println();
		System.out.println("Carro 03:");
		System.out.println("Fabricante: "+c3.fabricante);
		System.out.println("Modelo: "+c3.modelo);
		System.out.println("Cor: "+c3.cor);
		System.out.println("Ano: "+c3.ano);
		
		Funcionario f1 = new Funcionario();
		f1.matricula = 123;
		f1.nome = "José Santos";
		f1.cpf = "123.123.123-12";
		
		System.out.println();
		System.out.println("Funcionário 01:");
		System.out.println("Matrícula: "+f1.matricula);
		System.out.println("Nome: "+f1.nome);
		System.out.println("CPF: "+f1.cpf);
		
		Funcionario f2 = new Funcionario();
		f2.matricula = 312;
		f2.nome = "João Lima";
		f2.cpf = "111.222.333-44";
		
		System.out.println();
		System.out.println("Funcionário 02:");
		System.out.println("Matrícula: "+f2.matricula);
		System.out.println("Nome: "+f2.nome);
		System.out.println("CPF: "+f2.cpf);
		
		Livro l1 = new Livro();
		l1.isbn = 123456789;
		l1.nome = "O Pequeno Príncipe";
		l1.autor = "Antoine de Saint-Exupéry";
		l1.editora = "ABC";
		
		System.out.println();
		System.out.println("Livro 01:");
		System.out.println("ISBN: "+l1.isbn);
		System.out.println("Nome: "+l1.nome);
		System.out.println("Autor: "+l1.autor);
		System.out.println("Editora: "+l1.editora);
		
		Produto p1 = new Produto();
		p1.idProduto = 1212;
		p1.nomenclatura = "Caderno";
		p1.descricao = "200 folhas A4";
		p1.quantidade = 120;
		
		System.out.println();
		System.out.println("Produto 01:");
		System.out.println("ID Produto: "+p1.idProduto);
		System.out.println("Nomenclatura: "+p1.nomenclatura);
		System.out.println("Descrição: "+p1.descricao);
		System.out.println("Quantidade: "+p1.quantidade);
		
	}
}
