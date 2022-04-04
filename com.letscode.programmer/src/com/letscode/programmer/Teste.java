package com.letscode.programmer;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {

		int resposta = 1;
		while (resposta == 1) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Voc� quer saber a tabuada de qual numero? (Digite um n�nero entre 1 e 10): ");
			int numero = sc.nextInt();

			if (numero < 0 || numero > 10) {
				System.out.println("Voc� digitou um n�mero n�o aceito!!");
				continue;
			}
			if (numero < 10 || numero < 0) {
				for (int i = 1; i <= 10; i++) {
					System.out.println(i + " X " + numero + " = " + i * numero);
				}

			}

			Scanner rs = new Scanner(System.in);
			System.out.println("Voc� quer saber a tabuada de outro numero? (digite '1' para sim e '2' para n�o):");
			resposta = rs.nextInt();

		}

	}
}