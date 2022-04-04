package com.letscode.programmer;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {

		String frutas[];
		frutas = new String[5];
				
		for (int i = 0; i < 5; i++) {

			Scanner sc = new Scanner(System.in);
			System.out.printf("Qual o nome da %dº fruta? ", i + 1);
			frutas[i] = sc.nextLine();
			
		}
		System.out.println("A lista das frutas armazenadas no carrinho de compras são: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(frutas[i] + "  ");
		}
	}
}