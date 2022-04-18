package com.letscode.treinamento;

import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String resposta;

        do {

            System.out.println("Digite quantos números você quer digitar: ");
            int quantidade = in.nextInt();
            int[] lista = new int[quantidade];

            for (int i = 0; i < quantidade; i++) {
                System.out.printf("Digite o %dº número: ", i+1);
                int numero = in.nextInt();
                if (numero <= 0){
                    break;
                }
                lista[i] = numero;
            }
            int produto = 1;
            int soma = 0;

            for (int c = 0; c < quantidade; c++){
                int equacao = lista [c];
                 if (equacao % 2 == 0){
                     soma += equacao;
                }
                 if (equacao % 2 != 0){
                     produto *= equacao;
                 }
                }

                System.out.printf("O produto dos números impares é %d", produto);
                System.out.println("");
                System.out.printf("A soma dos números pares é %d", soma);
                System.out.println("");

            System.out.println("Quer continuar? (SIM ou NÃO)");
            resposta = in.next().toUpperCase();

        } while("SIM".equals(resposta));

    }
}
