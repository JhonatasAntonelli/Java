package com.letscode.programmer;

import java.util.Scanner;

/*
Um empres�rio comprou 2 terrenos em uma area central da cidade. E quer montar 2 estacionamentos e precisa de um
sistema para controlar a entrada e saida dos ve�culos e controlar o valor a pagar conforme o tempo de perman�ncia
Porem � um requisito muito importante que o sistema seja o mais simples poss�vel.
Capacidade do estacionamento � vari�vel e deve ser enviada na inncializa��o da aplic��o

Para um carro entrar ou sa�r no estabelecimento, a sua placa dever� ser fornecida ao sistema,
caso n�o houver nenhuma outra entrada em aberto para aquela placa dever� ser exibida a mensagem:
>> Entrada do ve�culo de placa: XXX

Caso contr�rio dever� ser exibida a mensagem:
>> Sa�da do ve�culo de placa: XXX. Tempo no estabelecimento: X minutos. Valor a ser cobrado: XX

 O valor a ser cobrado � definido pela seguinte forma:

� De 0 a 5 minutos. Sem cobran�a de valor
� De 5 a 60 minutos. R$ 4,00
� Acima de 60 minutos � cobrado um valor de R$ 6,00 por hora adicional.
    Ex.: 1 hora e 4 minutos de permanecia, dever� ser cobrado:
    4 reais da primeira hora e 6 reais dos 4 minutos que compoe a hora adicional. Total 10 reais.

Ao realizar a entrada ou sa�da de ve�culos do estabelecimento o sistema dever�
imprimir um relat�rio das entradas e sa�das j� realizadas, bem como o tempo que
cada ve�culo que j� saiu ficou no estabelecimento.

OBS: dever�o ser utilizados somente recursos do que foi apresentado neste curso.
Com exce��o da classe LocalDateTime e Math do java e a cria��o de metodos para organiza��o do condigo que podem ser usados
*/

public class Estacionamento {

	public static void main(String[] args) {

		int capacidadeDeCarros = 5;
		int lota��o = 0;
		String carrosFora;
		String placaDoCarro;
		String carroFora;
		String[] carrosEstacionados = new String[capacidadeDeCarros];

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Escreva a placa do mcarro");
			placaDoCarro = sc.nextLine();
			int vagaOcupada = carrosDentro(placaDoCarro, carrosEstacionados);
			int vagalivre = vagasLivres(carrosEstacionados);
			if(vagaOcupada == -1) {
				//metodo que vai estacionar o carro
			}else {
				//vai retirar o carro
			}

		}
	}

	public static int carrosDentro(String placaDoCarro, String[] carrosEstacionados) {//assim � uma fun��o
		for (int i = 0; i < carrosEstacionados.length; i++) {
			if (placaDoCarro.equals(carrosEstacionados[i])) {// o equals vai buscar um nome no array
				return 1;

			}

		}
		return -1;
	}
	public static int estacionar (String placaDoCarro, String [] carrosEstacionados) {
		for(int i = 0; i < carrosEstacionados.length; ++i) {
			if (carrosEstacionados[i] == null) {
				return i;
			}
			
		}
		
	}
}