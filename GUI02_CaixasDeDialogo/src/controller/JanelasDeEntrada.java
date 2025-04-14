package controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JanelasDeEntrada {

	public static void main(String[] args) {
		
		String texto1 = JOptionPane.showInputDialog("Janela de entrada 1");
		JOptionPane.showMessageDialog(null, "Você digitou: "+texto1);
		
		//--------------------------------------------------
		
		String texto2 = JOptionPane.showInputDialog(null, "Janela de entrada 2");
		JOptionPane.showMessageDialog(null, "Você digitou: "+texto2);
		
		//--------------------------------------------------
		
		String texto3 = JOptionPane.showInputDialog("Janela de entrada 3",
				"Valor inicial da janela de entrada 3");
		JOptionPane.showMessageDialog(null, "Você digitou: "+texto3);
		
		//--------------------------------------------------
		
		String texto4 = JOptionPane.showInputDialog(null, "Janela de entrada 4",
				"Valor inicial da janela de entrada 4");
		JOptionPane.showMessageDialog(null, "Você digitou: "+texto4);
		
		//--------------------------------------------------
		
		String texto5 = JOptionPane.showInputDialog(null, "Janela de entrada 5",
				"Título da janela de entrada 5", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Você digitou: "+texto5);
		
		//--------------------------------------------------
		
		ImageIcon icone = new ImageIcon("img/dente.png");
		String[] vetorString = {"Canal","Aparelho","Limpeza","Clareamento","Obturação"};
		Object objeto = JOptionPane.showInputDialog(null, "Selecione o serviço:",
				"Tratamento dentário", JOptionPane.PLAIN_MESSAGE, icone, vetorString,
				vetorString[1]);
		JOptionPane.showMessageDialog(null, "Serviço selecionado: "+objeto);
		

	}

}







