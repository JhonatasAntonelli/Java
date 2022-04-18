package com.letscode.programmer;

import java.util.Scanner;

public class TesteProva2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para saber se ele é divisivel por 10, 5 ou 2: ");
        double numero = sc.nextDouble();

        if (numero % 10 == 0){
            System.out.println("O número é divisivel por 10");
        }
        if (numero % 5 == 0){
            System.out.println("O número é divisivel por 5");
            }
        if (numero % 2 == 0){
            System.out.println("O número é divisivel por 2");
        }else{
            System.out.println("O número não é divisivel por 10, 5 e nem por 2 ");
        }
    }}



