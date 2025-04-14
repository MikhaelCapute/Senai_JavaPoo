package controller;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AreaDeTextoJanelaComScroll extends JFrame{

	public AreaDeTextoJanelaComScroll() {
		super("Exemplo de Área de Texto Janela com Scroll");
		
		JLabel label = new JLabel("Digite sua mensagem:");
		JTextArea areaDeTexto = new JTextArea(10,30);
		
		JPanel painel = new JPanel();
		painel.add(label);
		painel.add(areaDeTexto);
		
		JScrollPane scroll = new JScrollPane(painel, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		add(scroll);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new AreaDeTextoJanelaComScroll();
	}

}
