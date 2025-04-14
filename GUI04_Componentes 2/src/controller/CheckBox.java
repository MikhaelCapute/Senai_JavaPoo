package controller;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class CheckBox extends JFrame{
	
	ImageIcon iconeChocolate = new ImageIcon("img/chocolate.jpg");
	ImageIcon iconeCoco = new ImageIcon("img/coco.jpg");
	ImageIcon iconeMorango = new ImageIcon("img/Morango.jpg");
	
	JLabel labelChocolate = new JLabel(iconeChocolate);
	JLabel labelCoco = new JLabel(iconeCoco);
	JLabel labelMorango = new JLabel(iconeMorango);
	
	public CheckBox() {
		super("Exemplo CheckBox");
		
		labelChocolate.setPreferredSize(new Dimension(250, 250));
		labelChocolate.setVisible(false);
		
		labelCoco.setPreferredSize(new Dimension(250, 250));
		labelCoco.setVisible(false);
		
		labelMorango.setPreferredSize(new Dimension(250, 250));
		labelMorango.setVisible(false);
		
		JCheckBox checkChocolate = new JCheckBox("Chocolate");// Palavra que vai aparecer na Janela
		checkChocolate.setMnemonic(KeyEvent.VK_H);// Atahlo para selecionar o teclado alt+H
		
		JCheckBox checkCoco = new JCheckBox("Coco");
		checkChocolate.setMnemonic(KeyEvent.VK_C);
		
		JCheckBox checkMorango = new JCheckBox("Morango"); // Palavra que vai aparecer na Janela
		checkChocolate.setMnemonic(KeyEvent.VK_M);// Atalho para selecionar o teclado alt+M
		
		// ItemListener ficará monitorando o seu estado entre ativo e inativo
		checkChocolate.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.DESELECTED) { // compara se o Item é igual a Deselected  ou seja deselecionado
					labelChocolate.setVisible(false);
				} else {
					labelChocolate.setVisible(true);
				}
				
			}
		});
		
		checkCoco.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.DESELECTED) {
					labelCoco.setVisible(false);
				} else {
					labelCoco.setVisible(true);
				}
			}
		});
		
		checkMorango.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.DESELECTED) {
					labelMorango.setVisible(false);
				} else {
					labelMorango.setVisible(true);
				}
			}
		});
		
		
		JCheckBox checkBox = new JCheckBox("Option");

		InputMap inputMap = checkBox.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap actionMap = checkBox.getActionMap();

		// Define um atalho de teclado (Ctrl + M ou Command + M no macOS)
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()), "toggleCheck");

		// Define a ação associada ao atalho
		actionMap.put("toggleCheck", new AbstractAction() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        checkBox.setSelected(!checkBox.isSelected());
		    }
		});
		
		
		// Os número do grid definem como 1 linha e 3 colunas 
		JPanel checkPainel = new JPanel(new GridLayout(1,3));
		checkPainel.add(checkChocolate);
		checkPainel.add(checkCoco);
		checkPainel.add(checkMorango);
		
		// o Label mostra as imagens dentro da janela
		JPanel label = new JPanel(new GridLayout(1,3));
		label.add(labelChocolate);
		label.add(labelCoco);
		label.add(labelMorango);
		
		Container container = getContentPane();
		container.add(checkPainel, BorderLayout.NORTH);
		container.add(label, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,300);
		setVisible(true);
		setLocationRelativeTo(null);
		
		
	}
	
	
	public static void main(String[] args) {
		new CheckBox();
	}
	
}
