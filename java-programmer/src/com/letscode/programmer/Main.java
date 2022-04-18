package com.letscode.programmer;

/*
    Um empresário comprou 2 terrenos em uma area central da cidade. E quer montar 2 estacionamentos e precisa de um
    sistema para controlar a entrada e saida dos veículos e controlar o valor a pagar conforme o tempo de permanência
    Porem é um requisito muito importante que o sistema seja o mais simples possível.
    Capacidade do estacionamento é variável e deve ser enviada na inncialização da aplicção

    Para um carro entrar ou saír no estabelecimento, a sua placa deverá ser fornecida ao sistema,
    caso não houver nenhuma outra entrada em aberto para aquela placa deverá ser exibida a mensagem:
    >> Entrada do veículo de placa: XXX

    Caso contrário deverá ser exibida a mensagem:
    >> Saída do veículo de placa: XXX. Tempo no estabelecimento: X minutos. Valor a ser cobrado: XX

     O valor a ser cobrado é definido pela seguinte forma:

    • De 0 a 5 minutos. Sem cobrança de valor
    • De 5 a 60 minutos. R$ 4,00
    • Acima de 60 minutos é cobrado um valor de R$ 6,00 por hora adicional.
        Ex.: 1 hora e 4 minutos de permanecia, deverá ser cobrado:
        4 reais da primeira hora e 6 reais dos 4 minutos que compoe a hora adicional. Total 10 reais.

    Ao realizar a entrada ou saída de veículos do estabelecimento o sistema deverá
    imprimir um relatório das entradas e saídas já realizadas, bem como o tempo que
    cada veículo que já saiu ficou no estabelecimento.

    OBS: deverão ser utilizados somente recursos do que foi apresentado neste curso.
    Com exceção da classe LocalDateTime e Math do java e a criação de metodos para organização do condigo que podem ser usados
 */

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int capacidadeDeCarros;
        if (args.length > 0) {
            capacidadeDeCarros = Integer.parseInt(args[0]);
        } else {
            System.out.println("Não foi informada a capacidade do estacionamento.");
            return;
        }
        int lotacao = 0;
        int vagaOcupada;
        int vagaLivre;
        String logDeSaidas = "";
        String placaDoCarro;
        String[] carrosEstacionados = new String[capacidadeDeCarros];
        LocalDateTime[] horaDaEntrada = new LocalDateTime[capacidadeDeCarros];
        LocalDateTime horaAtual;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Qual é a placa do veículo? (Digite SAIR para terminar.)");
            placaDoCarro = sc.nextLine();
            if (placaDoCarro.equalsIgnoreCase("SAIR")) {
                System.out.println("Obrigado, tenha um bom dia!");
                break;
            }
            horaAtual = LocalDateTime.now();
            vagaOcupada = oCarroEstaLaDentro(placaDoCarro, carrosEstacionados);
            if (vagaOcupada == -1) {
                if (lotacao >= capacidadeDeCarros) {
                    System.out.println("O estacionamento está lotado!");
                    continue;
                }
                vagaLivre = vagasLivres(carrosEstacionados);
                carrosEstacionados[vagaLivre] = placaDoCarro;
                horaDaEntrada[vagaLivre] = horaAtual;
                lotacao++;
                System.out.println(">> Entrada do veículo de placa: " + placaDoCarro);
                log(carrosEstacionados, logDeSaidas);
            } else {
                long minutos = Duration.between(horaDaEntrada[vagaOcupada], horaAtual).toMinutes();
                double valor = valorACobrar(minutos);
                carrosEstacionados[vagaOcupada] = null;
                lotacao--;
                logDeSaidas = logDeSaidas + "" + placaDoCarro + " " + minutos + " " + valor + "\n";
                System.out.println(">> Saída do veículo de placa: " + placaDoCarro + " Tempo no estabelecimento: " + minutos + " minutos. Valor a ser cobrado: R$ " + valor);
                log(carrosEstacionados, logDeSaidas);
            }
        }
    }
    public static int oCarroEstaLaDentro(String placaDoCarro, String[] carrosEstacionados) {
        for (int i = 0; i < carrosEstacionados.length; i++) {
            if (placaDoCarro.equals(carrosEstacionados[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int vagasLivres(String[] carrosEstacionados) {
        for (int i = 0; i < carrosEstacionados.length; i++) {
            if (carrosEstacionados[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public static double valorACobrar(long minutos) {
        if (minutos <= 5) {
            return 0;
        } else if (minutos <= 60) {
            return 4;
        } else {
            return (4 + (int)(((minutos-60)/60) + 1)*6);
        }
    }

    public static void log(String[] carrosEstacionados, String logDeSaidas) {
        System.out.println("Carros estacionados:");
        for (int i = 0; i < carrosEstacionados.length; i++) {
            if (carrosEstacionados[i] != null) {
                System.out.println(carrosEstacionados[i]);
            }
        }
        System.out.println("Log de saídas:");
        System.out.println(logDeSaidas);
    }
}
