package com.letscode.programmer;

import java.util.Scanner;

public class ConversorMoeda {
	
	public static void main(String[] args) {
		
		Scanner us = new Scanner(System.in);
		System.out.println("Digite a cota��o atual do dolar em reais: R$");
		double cotacaoDolar = us.nextDouble();
		
		Scanner rs = new Scanner(System.in);
		System.out.println("Digite o valor em reais que voc� quer converter em dolar: R$");
		double valorReais = rs.nextDouble();
		
		System.out.printf("Com o valor de R$%.2f e uma cota��o de R$%.2f para cada dolar, voc� pode comprar U$%.2f.", valorReais, cotacaoDolar, (float)valorReais/cotacaoDolar) ;
	}

}
