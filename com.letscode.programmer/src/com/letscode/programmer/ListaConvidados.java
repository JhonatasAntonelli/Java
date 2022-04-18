package com.letscode.programmer;

import java.util.Scanner;

public class ListaConvidados {
	
	public static void main(String[] args) {

		char[] letras;
		String lista[];
		lista = new String[5];
		int tamanho = 0;
		String maior = " ";

		for (int i = 0; i < 5; i++) {

			Scanner sc = new Scanner(System.in);
			System.out.printf("Digite o nome do %dº convidado: ", +i + 1);
			String convidado = sc.next();

			lista[i] = convidado;
			letras = convidado.toCharArray();

			if (tamanho < convidado.length()) {
				tamanho = convidado.length();
				maior = convidado;
			}
		}
		System.out.print("A lista de convidados é formada por: " );
		for (int i = 0; i < 5; i++) {
			
			System.out.print(lista[i] + " ");
		}
		System.out.println(" ");
		System.out.println("O convidado com o nome mais longo é: " + maior);
// só podemos ter um main por class
		
	}
}


