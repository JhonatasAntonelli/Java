package com.letscode.programmer;

import java.util.Scanner;

public class ConversorTemperatura {

public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o valor da temperatura em graus Celsius (�C) para ser convertida graus Fahrenheit (�F): ");
	double temperatura = sc.nextInt();
	
	System.out.printf("A temperatura de %.2f �C � igual a %.2f �F", temperatura, (float)temperatura * ((float)5/9) + 32) ;
}
}
