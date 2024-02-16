package br.com.fiap;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Declarando variáveis
		Scanner scan;
		
		int anoAtual, anoNasc;
		
		// Programa principal
		
		try {
			scan = new Scanner(System.in); // instanciando o objeto
			
			System.out.println("Em que ano estamos atualmente?");
			anoAtual = scan.nextInt();
			
			System.out.println("Em que ano você nasceu?");
			anoNasc = scan.nextInt();
			
			int idade = anoAtual - anoNasc;
			
			System.out.println("Sua idade é, desconsiderando o dia e o mês: " + idade);
			
		} catch (Exception e) {
			System.out.println("Formato incorreto de número! Tente novamente!");
		}
	}

}
