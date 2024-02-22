package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio3Dialogo {
	public static void main(String[] args) {
		// Declarando variáveis
		final double PI = 3.14;
		double raio;
		String aux;
		
		// Programa principal
		
		try {
			aux = JOptionPane.showInputDialog("Digite o valor do raio");
			raio = Double.parseDouble(aux);
			
			// Área do círculo
			double area = PI * Math.pow(raio,2);
			
			JOptionPane.showMessageDialog(null, "A área do círculo é " + area);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato incorreto de número! Tente novamente!");
		}
	}
}
