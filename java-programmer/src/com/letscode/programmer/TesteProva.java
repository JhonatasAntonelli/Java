package com.letscode.programmer;

import java.util.Scanner;

public class TesteProva {
    public static void main(String[] args) {

        String nome;
        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double nota4 = 0;
        double nota5 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        nome = sc.nextLine();

        System.out.print("Digite o tipo de escola ( PU (publica), PR (privada) MT (militar) ): ");
        String escola = sc.nextLine().toUpperCase();

            System.out.print("Digite a nota da atividade 1: ");
            nota1 = sc.nextDouble();

            if (nota1 > 10){
                System.out.println("Você entrou com um valor errado");
                while (nota1 > 10){
                    System.out.print("Digite a nota da atividade 1: ");
                    nota1 = sc.nextDouble();
            }
             }
        System.out.print("Digite a nota da atividade 2: ");
        nota2 = sc.nextDouble();
        if (nota2 > 10){
            System.out.println("Você entrou com um valor errado");
            while (nota2 > 10){
                System.out.print("Digite a nota da atividade 2: ");
                nota2 = sc.nextDouble();
            }
        }
        System.out.print("Digite a nota da atividade 3: ");
        nota3 = sc.nextDouble();
        if (nota3 > 10){
            System.out.println("Você entrou com um valor errado");
            while (nota3 > 10){
                System.out.print("Digite a nota da atividade 3: ");
                nota3 = sc.nextDouble();
            }
        }
        System.out.print("Digite a nota da prova: ");
        nota4 = sc.nextDouble();
        if (nota4 > 50){
            System.out.println("Você entrou com um valor errado");
            while (nota4 > 50){
                System.out.print("Digite a nota da atividade 1: ");
                nota4 = sc.nextDouble();
            }
        }
        System.out.print("Digite a nota da participação: ");
        nota5 = sc.nextDouble();
        if (nota5 > 20){
            System.out.println("Você entrou com um valor errado");
            while (nota5 > 20){
                System.out.print("Digite a nota da aparticipação: ");
                nota5 = sc.nextDouble();
            }
        }
    double soma = nota1 + nota2 + nota3+ nota4 + nota5;
        if (escola.equals("PU")){
            if (soma >= 65){
                System.out.println("O aluno" + nome + "foi APROVADO, total de pontos " + soma);
            }else{
                System.out.println("O aluno" + nome + "Foi REPROVADO, total de pontos " + soma);
            }
        }
        if (escola.equals("PR")){
            if (soma >= 70){
                System.out.println("O aluno" + nome + "foi APROVADO, total de pontos " + soma);
            }else{
                System.out.println("O aluno" + nome + "Foi REPROVADO, total de pontos " + soma);
            }
        }
        if (escola.equals("MI")){
            if (soma >= 80){
                System.out.println("O aluno" + nome + "foi APROVADO, total de pontos " + soma);
            }else{
                System.out.println("O aluno" + nome + "Foi REPROVADO, total de pontos " + soma);
            }
        }



    }
        }



