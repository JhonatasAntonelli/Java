package com.letscode.programmer;

import java.util.Scanner;

public class ConversorCmEmPl {
	
	public static void main(String[] args) {
		
		Scanner pl = new Scanner(System.in);
		System.out.println("Digite o comprimento em polegadas, para ser convertido em centimetros: ");
		double comprimentoPl = pl.nextDouble();
		
		double fatorConversor = 2.54;
		
		System.out.printf("O comprimento de %.2f polegadas é %.2f centimetros", comprimentoPl, comprimentoPl * fatorConversor) ;
	}

}
