package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio1Dialogo {
	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4;
		String aux;
		
		try {
			
			aux = JOptionPane.showInputDialog("Digite a primeira nota");
			nota1 = Double.parseDouble(aux);
			
			aux = JOptionPane.showInputDialog("Digite a segunda nota");
			nota2 = Double.parseDouble(aux);
			
			aux = JOptionPane.showInputDialog("Digite a terceira nota");
			nota3 = Double.parseDouble(aux);
			
			aux = JOptionPane.showInputDialog("Digite a quarta nota");
			nota4 = Double.parseDouble(aux);
			
			// Média das notas
			double mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;
			
			JOptionPane.showMessageDialog(null, "A média desse aluno é de " + mediaNotas);
					
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato incorreto de número! Tente novamente!");
		}
	}
}