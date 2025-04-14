package controller;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu.Separator;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class Menu extends JFrame{

	JLabel LabelOutput = new JLabel("Comando");
	
	public Menu() {
		super("Exemplo Menu"); // Título da janela principal
		
		// Classe interna
		// Se todos vão ter o mesmo código, eu só preciso criar uma classe anonima, sendo assim, todos tem a mesma funcionalidade.
		class Acao implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {// Action command é o item de menu que foi clicado 
				LabelOutput.setText(e.getActionCommand()); // vai pegar a ação do item clicado e vai mandar exibir no LabelOutput.
				// e ai quando for clicado vai gerar esse evento e o evento vai poder receber o actioncomando e exibir na tela.
			}
		}
		
		Acao acao = new Acao();
		
		JMenuBar menuBar = new JMenuBar(); //  Criação dos menus horizontais dentro da janela
		JMenu menu = new JMenu("Menu"); // Nome do menu
		menu.setMnemonic(KeyEvent.VK_A);// atalho para o Primeiro menu
		menuBar.add(menu);
		
		// Exemplo somente com texto
		JMenuItem menuItem1 = new JMenuItem("Item de menu somente texto"); // O item que aparece dentro do menu
		menuItem1.setActionCommand("Clicou em item de menu somente com texto.");
		menuItem1.addActionListener(acao); // Quando o item for clicado o listener vai ver que ele foi clicado e vai executar a acao
		menuItem1.setMnemonic(KeyEvent.VK_T); // atalho para abrir os menus no teclado
		menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK)); // acelerator é o atalho mais rapido para um item dentro do menu
		// ao invés de clicar no atalho para abrir um menu, ele já cria um atalho pro item do menu automaticamente
		menu.add(menuItem1); //  adicionando item dentro do menu
		
		// Exemplo com Texto e Icone
		ImageIcon iconeAbrir = new ImageIcon("img/abrir.png");
		JMenuItem menuItem2 =  new JMenuItem("Texto e icone juntos: ", iconeAbrir);
		menuItem2.setActionCommand("Clicou em item de menu com texto e icone"); //  isso futuramente pode ser substituido por uma ação.
		menuItem2.addActionListener(acao);
		menuItem2.setMnemonic(KeyEvent.VK_J);
		menuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.CTRL_MASK ));
		menu.add(menuItem2);
		
		// Exemplo como toolTip (Dica ao passar o mouse em cima) ;
		ImageIcon iconeSalvar = new ImageIcon("img/salvar.png");
		JMenuItem menuItem3 = new JMenuItem(iconeSalvar);
		menuItem3.setToolTipText("Salvar"); // Colocando a dica e o que vem escrito nela.
		menuItem3.setActionCommand("Clicou em Salvar");
		menuItem3.addActionListener(acao);
		menuItem3.setMnemonic(KeyEvent.VK_I);
		menuItem3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.META_MASK)); // teste pra ver se é o command
		
		menu.add(menuItem3);
		
		menu.addSeparator();
		
		JRadioButtonMenuItem radioMenuItem1 = new JRadioButtonMenuItem("Um item de menu radio button."); //nome do item dentro da lista de itens dentro do menu
		radioMenuItem1.setActionCommand("Clicou em item de menu Radio Button."); // acão que vai pra label
		radioMenuItem1.addActionListener(acao);
		radioMenuItem1.setMnemonic(KeyEvent.VK_R);
		radioMenuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.SHIFT_MASK));
		// radioMenuItem1.setSelected(true); esse código já deixa essa opção selecionada por padrão.
		menu.add(radioMenuItem1);
		
		JRadioButtonMenuItem radioMenuItem2 = new JRadioButtonMenuItem("Outro item de menu radio Button.");
		radioMenuItem2.setActionCommand("Clicou em outro item de menu Radio Button.");
		radioMenuItem2.addActionListener(acao);
		radioMenuItem2.setMnemonic(KeyEvent.VK_O);
		radioMenuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_5, ActionEvent.ALT_MASK)); //Teste com scroll do mouse
		menu.add(radioMenuItem2);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radioMenuItem1);
		group.add(radioMenuItem2);
		
		menu.addSeparator(); // separator cria uma separação das outras opções dentro do menu
		
		
		
		
		//SubMenu - um menu dentro de outro menu
		JMenu subMenu = new JMenu("SubMenu");
		subMenu.setMnemonic(KeyEvent.VK_U);
		//subMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_6, ActionEvent.CTRL_MASK));
		
		JMenuItem subMenuItem1 = new JMenuItem("Um item no subMenu");
		subMenuItem1.setActionCommand("Clicou em um item de SubMenu.");
		subMenuItem1.addActionListener(acao);
		subMenuItem1.setMnemonic(KeyEvent.VK_B);
		subMenuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_7, ActionEvent.META_MASK));
		subMenu.add(subMenuItem1);
		menu.add(subMenu);
		
		JMenuItem subMenuItem2 = new JMenuItem("Outro item dentro do SubMenu.");
		subMenuItem2.setActionCommand("Clicou em outro item de SubMenu.");
		subMenuItem2.addActionListener(acao);
		subMenuItem2.setMnemonic(KeyEvent.VK_E);
		subMenuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_8, ActionEvent.SHIFT_MASK));
		subMenu.add(subMenuItem2);
		
		menu.add(subMenu);
		
		JMenu menuVazio = new JMenu("Outro Menu (Vazio)");
		menuVazio.setMnemonic(KeyEvent.VK_N);
		menuBar.add(menuVazio);
		
		
		setJMenuBar(menuBar);
		
		Container container = getContentPane();
		container.add(LabelOutput, BorderLayout.CENTER);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,200);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		new Menu();
	}
}
