package com.letscode.programmer;

import java.util.Scanner;

public class SeparadorDeCaracter {
	public static void main(String[] args) {
		char[] letras;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra para ser separada: ");
		String palavra = sc.next();

		letras = palavra.toCharArray();
		
		for (int i = palavra.length() - 1; i >= 0; i--) {

			System.out.print(letras[i]);
		}
	}

}
