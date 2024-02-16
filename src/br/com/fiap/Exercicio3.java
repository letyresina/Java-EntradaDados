package br.com.fiap;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Declarando variáveis
		
		Scanner scan;
		
		final double PI = 3.14;
		
		double raio;
		
		// Programa principal
		try {
			
			scan = new Scanner(System.in); // instanciando o objeto
			
			System.out.println("Digite o raio do círculo");
			raio = scan.nextDouble();
			
			// Área do círculo
			double area = PI * Math.pow(raio,2);
			
			System.out.println("A área desse círculo é de " + area);
			
		} catch (Exception e) {
			System.out.println("Formato incorreto de número! Tente novamente!");
		}
		

	}

}
