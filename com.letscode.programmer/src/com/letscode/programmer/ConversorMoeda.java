package com.letscode.programmer;

import java.util.Scanner;

public class ConversorMoeda {
	
	public static void main(String[] args) {
		
		Scanner us = new Scanner(System.in);
		System.out.println("Digite a cotação atual do dolar em reais: R$");
		double cotacaoDolar = us.nextDouble();
		
		Scanner rs = new Scanner(System.in);
		System.out.println("Digite o valor em reais que você quer converter em dolar: R$");
		double valorReais = rs.nextDouble();
		
		System.out.printf("Com o valor de R$%.2f e uma cotação de R$%.2f para cada dolar, você pode comprar U$%.2f.", valorReais, cotacaoDolar, (float)valorReais/cotacaoDolar) ;
	}

}
