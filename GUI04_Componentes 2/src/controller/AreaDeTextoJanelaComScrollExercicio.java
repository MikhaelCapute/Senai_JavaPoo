package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AreaDeTextoJanelaComScrollExercicio extends JFrame{

	public AreaDeTextoJanelaComScrollExercicio() {
		super("Exercício");
		
		JLabel label = new JLabel("Digite uma mensagem:");
		JTextArea areaDeTexto = new JTextArea(10,30);
		areaDeTexto.setLineWrap(true);
		areaDeTexto.setWrapStyleWord(true);
		
		JButton botao = new JButton("Exibe");
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(areaDeTexto.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Você não digitou nada.");
				}else {
					JOptionPane.showMessageDialog(null, areaDeTexto.getText());
				}
			}
		});
		
		JPanel painel = new JPanel();
		painel.add(label);
		painel.add(areaDeTexto);
		painel.add(botao);
		
		JScrollPane scroll = new JScrollPane(painel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		add(scroll);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new AreaDeTextoJanelaComScrollExercicio();
	}

}
