package com.letscode.programmer;

import java.util.Scanner;

public class SeparadorNumeros {

	public static void main(String[] args) {
		
		int numeros[];
		numeros = new int[5];

		for (int i = 0; i < 5; i++) {

			Scanner sc = new Scanner(System.in);
			System.out.printf("Digite o %dº número: ", i+1);
			numeros [i] = sc.nextInt();
		}
		System.out.print("Os números ímpars são: ");
		for (int i = 0; i < 5; i++) {
			
			if (numeros[i] % 2 != 0) {
				System.out.print(numeros[i] + " ");
			}
		}
		System.out.println(" ");
		System.out.print("Os números pares são: " );
		for (int i = 0; i < 5; i++) {			
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
			}
		}
				
	}
}



