package com.letscode.programmer;

import java.util.Scanner;

public class TesteProva5 {
    public static void main(String[] args) {

        System.out.print("Digite uma palavra para ve-la ao contrário: ");
        Scanner sc = new Scanner(System.in);

        String palavra = sc.next();
        char[] palavraInvertida = new char[palavra.length()];
        int tamanhoPalavra = palavra.length() - 1;

        char[] letras;
        letras = palavra.toCharArray();
        int x = 0;

        for (int i = tamanhoPalavra; i >= 0; i--) {
            palavraInvertida[i] = letras[x];
            x ++;
        }

        String letras2 = String.valueOf(letras);
        String palavraInvertida2 = String.valueOf(palavraInvertida);


        if(letras2.equals(palavraInvertida2)){
            System.out.printf("A palavra %s é um palíndromo", palavra);
        }else{
            System.out.printf("A palavra %s não é um palíndromo",palavra);
        }

        }

    }

