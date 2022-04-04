package com.letscode.programmer;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {

		String nome[];
		nome = new String[5];

		double peso[];
		peso = new double[5];

		double altura[];
		altura= new double[5];

		for (int i = 0; i < 5; i++) {

			Scanner cs = new Scanner(System.in);
			System.out.printf("Digite o nome da %dº pessoa: ", i + 1);
			nome[i] = cs.next();

			System.out.printf("Digite a altura em metros da %dº pessoa: ", i + 1);
			altura[i] = cs.nextDouble();

			System.out.printf("Digite o peso da %dº pessoa: ", i + 1);
			peso[i] = cs.nextDouble();

		}	

		for (int i = 0; i < 5; i++) {

			
			if ((float) peso[i] / (altura[i] * altura[i]) > 25
					|| (float) peso[i] / (altura[i] * altura[i]) < 18.5) {

				System.out.println(nome[i] + " está com IMC fora do ideal!");

			}

		}
	}
}
