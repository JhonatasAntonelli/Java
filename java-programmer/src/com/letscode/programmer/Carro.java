package com.letscode.programmer;

import java.util.Scanner;


public class Carro {

    public static void main(String[] args) {
        int vagas = 5;
        String [] entradas = {"null", "null", "null", "null", "null" };
        int lotacao = 0;

        while (lotacao < vagas){

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a placa do seu carro");
        String placaCarro = ler.nextLine().toUpperCase();

        for (int i = 0; i < vagas; i++){
            if (placaCarro == entradas[i]){
                entradas[i] = "null";
                lotacao --;
                break;
            }if (entradas[i] == "null"){
                entradas[i] = placaCarro;
                lotacao ++;
                break;
            }
        }
            for (int i = 0; i < vagas; i++){
                System.out.println(entradas[i]);
        }

    }

    }
}
