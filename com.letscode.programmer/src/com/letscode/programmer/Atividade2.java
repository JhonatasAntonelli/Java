package com.letscode.programmer;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		int numero1;
		int numero2;
		
		Scanner pr = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero inteiro para realizar uma opera��o matem�tica:");
		numero1 = pr.nextInt();
		
		Scanner sg = new Scanner(System.in);
		System.out.println("Digite o segundo n�mero inteiro para realizar uma opera��o matem�tica: ");
		numero2 = sg.nextInt();
				
		System.out.printf(" O resultado da soma entre %d e %d � %d.", numero1, numero2, numero1 + numero2);

		System.out.println(" ");

		System.out.printf(" O resultado da subtra��o de %d por %d � %d.", numero1, numero2, numero1 - numero2);

		System.out.println(" ");

		System.out.printf(" O resultado da multiplica��o entre %d e %d � %d.", numero1, numero2, numero1 * numero2);

		System.out.println(" ");

		System.out.printf(" O resultado da divis�o de %d por %d � %.2f.", numero1, numero2, (float) numero1 / numero2);
	}

}
