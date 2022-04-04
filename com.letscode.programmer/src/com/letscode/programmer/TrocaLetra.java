package com.letscode.programmer;

import java.util.Scanner;

public class TrocaLetra {
	

		public static void main(String[] args) {
			
			char[] letras;
			String letra = " ";
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite uma palavra para ser reescrita: ");
			String palavra = sc.next();

			letras = palavra.toCharArray();
			
			for (int i = 0; i < palavra.length(); i++) {
				if (i % 2 != 0) {
					letra = String.valueOf(letras[i]).toUpperCase();
					letras[i] = letra.charAt(0);
				}

				System.out.print(letras[i]);
			}
		}

	}



