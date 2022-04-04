package com.letscode.programmer;

import java.util.Scanner;

public class CalculoIcm {

	public static void main(String[] args) {

		String pessoasacima[];
		pessoasacima = new String[5];

		String pessoasabaixo[];
		pessoasabaixo = new String[5];

		int acima = 0;
		int abaixo = 0;

		for (int i = 0; i < 5; i++) {

			Scanner cs = new Scanner(System.in);
			System.out.printf("Digite o nome da %d� pessoa: ", i + 1);
			String nome = cs.next();

			System.out.printf("Digite a altura em cm da %d� pessoa: ", i + 1);
			int altura = cs.nextInt();

			System.out.printf("Digite o peso da %d� pessoa: ", i + 1);
			int peso = cs.nextInt();		
			

			if ((float) peso / (altura * altura) > 25 || (float) peso / (altura * altura) < 18,5) {
				
				System.out.print(nome + "Est� com IMC for ado ideal!")
			}

			if ((float) peso / (altura * altura) < 18.5) {
				pessoasacima[abaixo] = nome;
				abaixo++;
			}
		}
		if (acima > 0) {
			System.out.print("As pessoas com IMC acima do ideal s�o: ");
			
			for (int i = 0; i < acima; i++) {
				System.out.print(pessoasacima[i] + " ");
			}
			
			System.out.println(" ");
		}
		
		if (abaixo > 0) {
			System.out.print("As pessoas com IMC abaixo do ideal s�o: ");

			for (int i = 0; i < abaixo; i++) {
				System.out.print(pessoasabaixo[i] + " ");
			}

		}
	}
}
