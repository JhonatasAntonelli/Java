package com.letscode.programmer;

import java.util.Scanner;

public class Calculador {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String continuar = "S";

        while (continuar.equals("S")) {

            System.out.print("Digite o primiro número para realizar a operação: ");
            double numero1 = num.nextDouble();

            System.out.print("Digite o segundo número para realizar a operação: ");
            double numero2 = num.nextDouble();

            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a operação que deseja realizar (+, -, *, /,%): ");
            String operacao = sc.nextLine();

            if (operacao.equals("+")) {
                System.out.println("O resultado da some é " + soma(numero1, numero2));
                continuar = resposta();
            }
            if (operacao.equals("-")) {
                System.out.println("O resultado da subtração é " + subtracao(numero1, numero2));
                continuar = resposta();
            }
            if (operacao.equals("*")) {
                System.out.println("O resultado da multiplicação é " + multiplicacao(numero1, numero2));
                continuar = resposta();
            }
            if (operacao.equals("/")) {
                System.out.println("O resultado da divisão é " + divisao(numero1, numero2));
                continuar = resposta();
            }
            if (operacao.equals("%")) {
                System.out.println("O resto da divisão é " + resto(numero1, numero2));
                continuar = resposta();
            }
        }
    }
    public static double soma(double numero1, double numero2){
        double soma = numero1 + numero2;
        return soma;
    }
    public static double subtracao(double numero1, double numero2){
        double subtracao = numero1 - numero2;
        return subtracao;
    }
    public static double multiplicacao (double numero1, double numero2){
        double multiplicacao = numero1 * numero2;
        return multiplicacao;
    }
    public static double divisao (double numero1, double numero2) {
        double divisao = numero1 / numero2;
        return divisao;
    }
    public static double resto (double numero1, double numero2){
        double resto = numero1 % numero2;
        return resto;
    }
    public static String resposta (){
        Scanner rs = new Scanner(System.in);
        System.out.print("deseja fazer outra operação? ('N' para não e 'S' para sim) ");
        String resposta = rs.next().toUpperCase();

        if (resposta.equals("N")){
            System.out.println("Obrigado por usar nossos produtos. Tenha um bom dia!!!");
        }
        return resposta;
    }
}
