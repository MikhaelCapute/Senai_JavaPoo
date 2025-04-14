package controller;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ExercicioJanelasEPaineis extends JFrame{

	JTabbedPane abas = new JTabbedPane();
	
	JPanel painelPrincipalDodge = new JPanel();//parte principal para a aba do carro dodge(janela em branco ainda)
	JPanel painelPrincipalFerrari = new JPanel();
	JPanel painelPrincipalFusca = new JPanel();
	JPanel painelPrincipalLamborghini = new JPanel();
	
	JPanel painelDadosDodge = new JPanel(); // parte onde ficará os dados do carro. 
	JPanel painelDadosFerrari = new JPanel();
	JPanel painelDadosFusca = new JPanel();
	JPanel painelDadosLamborghini = new JPanel();
	
	JPanel painelImagemDodge = new JPanel(); // Painel onde ficará a foto do carro.
	JPanel painelImagemFerrari = new JPanel();
	JPanel painelImagemFusca = new JPanel();
	JPanel painelImagemLamborghini = new JPanel();
	
	ImageIcon iconeDodge = new ImageIcon("img/dodge.jpg"); //Localizando e armazenando a imagem em uma variável
	ImageIcon iconeDodgeAba = new ImageIcon("img/dodgeAba.jpg"); // Icone que ficará na aba.
	ImageIcon iconeFerrari = new ImageIcon("img/ferrari.jpg");
	ImageIcon iconeFerrariAba = new ImageIcon("img/ferrariAba.jpg");
	ImageIcon iconeFusca = new ImageIcon("img/fusca.jpg");
	ImageIcon iconeFuscaAba = new ImageIcon("img/fuscaAba.jpg");
	ImageIcon iconeLamborghini = new ImageIcon("img/lamborghini.jpg");
	ImageIcon iconeLamborghiniAba = new ImageIcon("img/lamborghiniAba.jpg");
	
	JLabel labelFabricanteDodge = new JLabel("Fabricante: Dodge"); //Label de dados:
	JLabel labelModeloDodge = new JLabel("Modelo: Charger");
	JLabel labelAnoDodge = new JLabel("Ano: 1969");
	JLabel labelMotorDodge = new JLabel("Motor: 850cv");
	JLabel labelPrecoDodge = new JLabel("Preço: R$ 1.300.000,00");
	JLabel labelIconeDodge = new JLabel(iconeDodge);
	
	JLabel labelFabricanteFerrari = new JLabel("Fabricante: Ferrari");
	JLabel labelModeloFerrari = new JLabel("Modelo: Enzo");
	JLabel labelAnoFerrari = new JLabel("Ano: 2004");
	JLabel labelMotorFerrari = new JLabel("Motor: 660cv");
	JLabel labelPrecoFerrari = new JLabel("Preço: R$ 15.892.000,00");
	JLabel labelIconeFerrari = new JLabel(iconeFerrari);
	
	JLabel labelFabricanteFusca = new JLabel("Fabricante: VW");
	JLabel labelModeloFusca = new JLabel("Modelo: Fusca");
	JLabel labelAnoFusca = new JLabel("Ano: 1974");
	JLabel labelMotorFusca = new JLabel("Motor: 52cv");
	JLabel labelPrecoFusca = new JLabel("Preço: R$ 30.000,00");
	JLabel labelIconeFusca = new JLabel(iconeFusca);
	
	JLabel labelFabricanteLamborghini = new JLabel("Fabricante: Lamborghini");
	JLabel labelModeloLamborghini = new JLabel("Modelo: Superveloce");
	JLabel labelAnoLamborghini = new JLabel("Ano: 2016");
	JLabel labelMotorLamborghini = new JLabel("750cv");
	JLabel labelPrecoLamborghini = new JLabel("Preço: R$ 3.200.000,00");
	JLabel labelIconeLamborghini = new JLabel(iconeLamborghini);
	
	public ExercicioJanelasEPaineis() {
		super("Exercício Janelas e Painéis - Carros");
		
		//Dodge:
		painelDadosDodge.setLayout(new GridLayout(5,1)); // Colocando em um certo lugar(linha 5, coluna 1); (esquerda)
		painelDadosDodge.add(labelFabricanteDodge);
		painelDadosDodge.add(labelModeloDodge);
		painelDadosDodge.add(labelAnoDodge);
		painelDadosDodge.add(labelMotorDodge);
		painelDadosDodge.add(labelPrecoDodge);
		
		painelImagemDodge.add(labelIconeDodge); // 
		
		painelPrincipalDodge.add(painelDadosDodge); // Colocando os dados dentro da janela
		painelPrincipalDodge.add(painelImagemDodge); // Colocando a imagem dentro da janela
		
		abas.addTab("Dodge"/*Nome da aba*/, iconeDodgeAba/*A foto do ícone da aba*/, painelPrincipalDodge/*O que vai aparenar quando clicarmos na aba*/, "Dodge Charger 1969"/*ToolTip(Dica para quando passar o mouse em cima*/);
		
		//Ferrari:
		painelDadosFerrari.setLayout(new GridLayout(5,1));
		painelDadosFerrari.add(labelFabricanteFerrari);
		painelDadosFerrari.add(labelModeloFerrari);
		painelDadosFerrari.add(labelAnoFerrari);
		painelDadosFerrari.add(labelMotorFerrari);
		painelDadosFerrari.add(labelPrecoFerrari);
		
		painelImagemFerrari.add(labelIconeFerrari);
		
		painelPrincipalFerrari.add(painelDadosFerrari);
		painelPrincipalFerrari.add(painelImagemFerrari);
		
		abas.addTab("Ferrari", iconeFerrariAba, painelPrincipalFerrari, "Ferrari Enzo 2004");
		
		//Fusca:
		painelDadosFusca.setLayout(new GridLayout(5,1));
		painelDadosFusca.add(labelFabricanteFusca);
		painelDadosFusca.add(labelModeloFusca);
		painelDadosFusca.add(labelAnoFusca);
		painelDadosFusca.add(labelMotorFusca);
		painelDadosFusca.add(labelPrecoFusca);
		
		painelImagemFusca.add(labelIconeFusca);
		
		painelPrincipalFusca.add(painelDadosFusca);
		painelPrincipalFusca.add(painelImagemFusca);
		
		abas.addTab("Fusca", iconeFuscaAba, painelPrincipalFusca, "VW Fusca 1974");
		
		//Lamborghini:
		painelDadosLamborghini.setLayout(new GridLayout(5,1));
		painelDadosLamborghini.add(labelFabricanteLamborghini);
		painelDadosLamborghini.add(labelModeloLamborghini);
		painelDadosLamborghini.add(labelAnoLamborghini);
		painelDadosLamborghini.add(labelMotorLamborghini);
		painelDadosLamborghini.add(labelPrecoLamborghini);
		
		painelImagemLamborghini.add(labelIconeLamborghini);
		
		painelPrincipalLamborghini.add(painelDadosLamborghini);
		painelPrincipalLamborghini.add(painelImagemLamborghini);
		
		abas.addTab("Lamborghini", iconeLamborghiniAba, painelPrincipalLamborghini, "Lamborghini Aventador Roadster Superveloce 2016");
		
		add(abas);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new ExercicioJanelasEPaineis();

	}

}
