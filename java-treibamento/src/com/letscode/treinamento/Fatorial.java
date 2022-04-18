package com.letscode.treinamento;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String resposta;

        do {

        System.out.println("Digite quantos números você quer fatorar: ");
        int quantidade = in.nextInt();
        int[] lista = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Digite o %dº número para fatora-lo: ", i+1);
            int numero = in.nextInt();
            lista[i] = numero;
        }

        for (int c = 0; c < quantidade; c++){
            int fatoral = lista [c];
            int fator = 1;
            for (int d = 1; d <= fatoral; d++){
                fator *= d;
            }
                System.out.printf("O fatoral de %d é %d", fatoral, fator);
                System.out.println("");

    }
            System.out.println("Quer continuar? (SIM ou NÃO)");
            resposta = in.next().toUpperCase();

        } while("SIM".equals(resposta));

    }
}
