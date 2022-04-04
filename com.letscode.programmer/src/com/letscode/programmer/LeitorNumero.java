package com.letscode.programmer;

import java.util.Scanner;

public class LeitorNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite o 1º número: ");
		int leitor1 = sc.nextInt();

		int maior = leitor1;
		int menor = leitor1;
		double soma = leitor1;
		
		for (int i = 0; i < 4; i++) {

			Scanner cs = new Scanner(System.in);
			System.out.printf("Digite o %dº número: ", i + 2);
			int leitor = cs.nextInt();

			if (leitor > maior) {
				maior = leitor;
			}
			if (leitor < menor) {
				menor = leitor;
			}
			soma += leitor;

		}
		System.out.println("O maior número é " + maior);
		System.out.println("O menor número é " + menor);
		System.out.println("A média dos números é " + (float) soma / 5);

	}
}