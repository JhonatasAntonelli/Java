package com.letscode.programmer;

import java.util.Scanner;

public class LeitorNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite o 1� n�mero: ");
		int leitor1 = sc.nextInt();

		int maior = leitor1;
		int menor = leitor1;
		double soma = leitor1;
		
		for (int i = 0; i < 4; i++) {

			Scanner cs = new Scanner(System.in);
			System.out.printf("Digite o %d� n�mero: ", i + 2);
			int leitor = cs.nextInt();

			if (leitor > maior) {
				maior = leitor;
			}
			if (leitor < menor) {
				menor = leitor;
			}
			soma += leitor;

		}
		System.out.println("O maior n�mero � " + maior);
		System.out.println("O menor n�mero � " + menor);
		System.out.println("A m�dia dos n�meros � " + (float) soma / 5);

	}
}