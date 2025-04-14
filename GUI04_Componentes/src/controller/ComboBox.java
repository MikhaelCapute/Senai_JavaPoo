package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ComboBox extends JFrame{

	public ComboBox() {
		super("Estudo de ComboBox");
		JLabel label = new JLabel();
		String[] vetor = {"Um","Dois","Três"};
		JComboBox comboBox = new JComboBox(vetor);
		
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				String itemSelecionado = (String)cb.getSelectedItem();
				label.setText(itemSelecionado);
			}
		});
		
		JButton botao = new JButton("Exibe");
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String itemSelecionado = (String)comboBox.getSelectedItem();
				JOptionPane.showMessageDialog(null, itemSelecionado);
				
			}
		});
		
		
		JPanel painel = new JPanel();
		painel.add(comboBox);
		painel.add(label);
		painel.add(botao);
		
		add(painel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		//setSize(300, 200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComboBox();
	}

}
