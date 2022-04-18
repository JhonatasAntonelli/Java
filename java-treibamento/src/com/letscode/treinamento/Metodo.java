package com.letscode.treinamento;

import java.util.Scanner;

public class Metodo {
    public static void main(String[] args) {
        String continuar = "SIM";
        Scanner in = new Scanner(System.in);

        while (continuar.equals("SIM")){

        System.out.println("Digite o primeiro valor: ");
        double valor1 = in.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double valor2 = in.nextDouble();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a operação que você deseja: (+, -, /, *)");
        String operacao = sc.nextLine();

        if (operacao.equals("*")){
            System.out.println("O resultado da multiplicação é " + multiplicacao(valor1, valor2));
            continuar = resposta();
        }
        if (operacao.equals("/")){
            System.out.println("O resultado da divisão é " + divisao(valor1, valor2));
            continuar = resposta();
        }
        if (operacao.equals("+")){
            System.out.println("O resultado da soma é " + soma(valor1, valor2));
            continuar = resposta();
        }
        if (operacao.equals("-")){
            System.out.println("O resultado da subtração é " + subtracao(valor1, valor2));
            continuar = resposta();
        }
    }}

        public static double multiplicacao (double valor1, double valor2){
           double multiplicacao = valor1 * valor2;
           return multiplicacao;
        }
        public static double divisao (double valor1, double valor2){
            double divisa = valor1 / valor2;
            return divisa;
    }
        public static double soma (double valor1, double valor2){
            double soma = valor1 + valor2;
            return soma;
    }
        public static double subtracao (double valor1, double valor2){
            double subtracao = valor1 - valor2;
            return subtracao;
    }
        public static String resposta (){
            Scanner cs = new Scanner(System.in);
            System.out.println("Quer fazer outra operação? (SIM/NÃO)");
            String resposta = cs.nextLine().toUpperCase();
            return resposta;
    }
    }

