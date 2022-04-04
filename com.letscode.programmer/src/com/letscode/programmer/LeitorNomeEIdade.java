package com.letscode.programmer;

import java.util.Scanner;

public class LeitorNomeEIdade {
	

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Digite o nome da 1º pessoa: ");
			String nome1 = sc.next();
			
			System.out.print("Digite a idade da 1º pessoa: ");
			int idade1 = sc.nextInt();

			String velho = nome1;
			String novo = nome1;
			int maioridade = idade1;
			int menoridade = idade1;
			int soma = idade1;
			
			for (int i = 2; i <= 5; i++) {
				
				Scanner cs = new Scanner(System.in);
				System.out.printf("Digite o nome da %dº pessoa: ", i);
				String nome = cs.next();
				
				System.out.printf("Digite a idade da %dº pessoa: ", i);
				int idade = cs.nextInt();

				if (idade > maioridade) {
					velho = nome;
					maioridade = idade;
				}

				if (idade < menoridade) {
					novo = nome;
					menoridade = idade;
				}
				soma += idade;
			}
			System.out.println("A pessoa mais velha é " + velho);
			System.out.println("A pessoa mais nova é " + novo);
			System.out.println("A media das idade é " + (float) soma / 5);

		}
	}



