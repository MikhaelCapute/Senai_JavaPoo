package controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JanelasDeConfirmacao {

	public static void main(String[] args) {
		int opt1 = JOptionPane.showConfirmDialog(null, "Janela de Confirmação 1");
		
		switch(opt1) {
		case JOptionPane.CANCEL_OPTION:
			JOptionPane.showMessageDialog(null, "Você clicou em \"Cancelar\"");
			break;
		case JOptionPane.YES_OPTION:
			JOptionPane.showMessageDialog(null, "Você clicou em \"Sim\"");
			break;
		case JOptionPane.NO_OPTION:
			JOptionPane.showMessageDialog(null, "Você clicou em \"Não\"");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Você fechou a janela");
			break;
		}
		//----------------------------------------
		int opt2 = JOptionPane.showConfirmDialog(null, "Janela de confirmação 2",
				"Título da janela", JOptionPane.OK_CANCEL_OPTION);
		switch(opt2) {
		case JOptionPane.CANCEL_OPTION:
			JOptionPane.showMessageDialog(null, "Você clicou em \"Cancelar\"");
			break;
		case JOptionPane.OK_OPTION:
			JOptionPane.showMessageDialog(null, "Você clicou em \"Ok\"");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Você fechou a janela");
			break;			
		}
		//---------------------------------------
		int opt3 = JOptionPane.showConfirmDialog(null, "Janela de confirmação 3",
				"Título da janela de confirmação 3", JOptionPane.YES_NO_OPTION,
				JOptionPane.ERROR_MESSAGE);
		switch(opt3) {
		case JOptionPane.YES_OPTION:
			JOptionPane.showMessageDialog(null, "Você clicou em \"Sim\"");
			break;
		case JOptionPane.NO_OPTION:
			JOptionPane.showMessageDialog(null, "Você clicou em \"Não\"");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Você fechou a janela");
			break;
		}
		//-----------------------------------------
		
		ImageIcon icone = new ImageIcon("img/backup.png");
		int opt4 = JOptionPane.showConfirmDialog(null, "Janela de confirmação 4",
				"Título da janela de confirmação 4", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE, icone);
		switch(opt4) {
		case JOptionPane.YES_OPTION:
			JOptionPane.showMessageDialog(null, "Você clicou em \"Sim\"");
			break;
		case JOptionPane.NO_OPTION:
			JOptionPane.showMessageDialog(null, "Você clicou em \"Não\"");
			break;
		case JOptionPane.CANCEL_OPTION:
			JOptionPane.showMessageDialog(null, "Você clicou em \"Cancelar\"");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Você fechou a janela");
			break;
		}

	}

}













