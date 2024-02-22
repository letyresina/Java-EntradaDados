package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio2Dialogo {
	public static void main(String[] args) {
		// Declarando variáveis
		int anoAtual, anoNasc;
		String aux;
		
		// Programa principal
		
		try {
			aux = JOptionPane.showInputDialog("Em que ano estamos atualmente?");
			anoAtual = Integer.parseInt(aux);
			
			aux = JOptionPane.showInputDialog("Em que ano você nasceu?");
			anoNasc = Integer.parseInt(aux);
			
			int idade = anoAtual - anoNasc;
			
			JOptionPane.showMessageDialog(null, "Sua idade é, desconsiderando a data que nasceu " + idade);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato incorreto de número! Tente novamente!");
		}
	}
}
