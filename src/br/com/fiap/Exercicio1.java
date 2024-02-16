package br.com.fiap;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Declarando variáveis
		Scanner scan;
		
		double nota1, nota2, nota3, nota4;
		
		
		
		// Programa principal
		
		try {
			
			scan = new Scanner(System.in); // instanciando o objeto

			System.out.println("Olá, professor(a)! Seja bem-vindo(a) ao nosso sistema!");
			
			System.out.println("Digite a primeira nota: ");
			nota1 = scan.nextInt();
			
			System.out.println("Digite a segunda nota: ");
			nota2 = scan.nextInt();
			
			System.out.println("Digite a terceira nota: ");
			nota3 = scan.nextInt();
			
			System.out.println("Digite a quarta nota: ");
			nota4 = scan.nextInt();
			
			double mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;
			
			System.out.println("A média de notas desse aluno é de: " + mediaNotas);
			
		} catch (Exception e) {
			System.out.println("Formato incorreto de número! Tente novamente!");
		}

	}

}
