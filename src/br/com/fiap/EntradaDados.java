package br.com.fiap;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		Scanner scan; // declarando um objeto
		
		try {
			
			scan = new Scanner(System.in); // instanciando o objeto
			System.out.println("Digite um número inteiro");
			num1 = scan.nextInt();
			System.out.println("Digite outro número inteiro");
			num2 = scan.nextInt();
			int soma = num1 + num2;
			System.out.println("A soma dos números " + num1 + " + " + num2 + " é " + soma);
			
		} catch (Exception e) {
			System.out.println("Formato incorreto de número! Tente novamente!");
		}
	}

}
