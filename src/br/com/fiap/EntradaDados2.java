package br.com.fiap;

import javax.swing.JOptionPane;

public class EntradaDados2 {
	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0;
		String aux;
		
		try {
			
			aux = JOptionPane.showInputDialog("Digite um número inteiro");
			num1 = Integer.parseInt(aux);
			
			aux = JOptionPane.showInputDialog("Digite outro número inteiro");
			num2 = Integer.parseInt(aux);
			
			JOptionPane.showMessageDialog(null, "\n Valor 1: " + num1 + "\n Valor 2: " + num2 + "\n A soma é " 
						+ (num1 + num2));
					
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato incorreto de número! Tente novamente!");
		}
	}
}
