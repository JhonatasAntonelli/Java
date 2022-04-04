package com.letscode.programmer;

import java.util.Scanner;

public class ArreiAula3 {
	public static void main(String[] args) {// args é um dos meios de passar informação para a execução do programa

		boolean[] idade;// valor padrão do boolean é false
		int[] idades;
		double pesos[];

		// qunado não sabemos o nosso arrey criamos igual a forma acima
		// quando ja sabemos o que vai dentro do arrei, criamos igual esta abaixo
		// o Arrey pode ser modificado o seu conteúdo, valor, posição, mas não podemos
		// alterar o tamanho dele

		idades = new int[3];
		idades[0] = 13;
		idades[2] = 99;
		idades[1] = 45;
		idades[2] = 12;

		pesos = new double[50];

		int[] numeros;
		numeros = new int[] { 1, 2, 5, 7, 5 };// uma forma de iniciar o arrey

		int[] numeros2 = { 1, 2, 5, 7, 5 };// outra forma de iniciar o arrey
		System.out.println(idades[2] * idades[0]);
		System.out.println(idades[(idades.length) - 1]);

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(i + " ");

		}

		for (int ida : idades) {// igual ao outro for mais coplexo
			System.out.println(ida);
		}

		System.out.println(" ");
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Posição: " + i + " valor: " + idades[i]);
		}
		int x = 1;
		while (x < 10) {
			System.out.println("Estamos na " + x + "ª execussão");

			if (x == 3) {
				System.out.println("estamos na terça feira");
			}
			x++;// A diferença do while e do do while é que esse ultimo executa ao menos
			// uma vez e no final se não estiver na conmdição
		}

		int y = 0;
		do {
			System.out.println("jjj " + y);
			y++;
		} while (y < 10);// A diferença do Break e return é que o Break para
		// apenas a execução que ele esta, já o return para todo o bloco
		// Além disso o return retorna um valor

		for (int z = 1; z < 10; z++) {
			if (z == 8) {// nesse caso ele vai parar
				break;
			}
			if (z == 5) {
				continue;// nesse caso ele não vai executar a ordem
			}
			System.out.println("Jhonatas" + z);

		}
		String names32 = "jhonatas";
		
		System.out.printf("nome %s.", names32);// O print com o % serve para trocar a % por algum parametro
		// e depois do % deve tre a letra do tipo. Ex: String é %s.
		// se tiver mais parametros, coloca primeiro todos os % e depois na mesma ordem os parametros
	System.out.println(" ");
		int n = 4654651;
		System.out.format("%,8d%n%n", n);
		
		// usar apenas o next o scanner le apenas uma palavra e se colocar o nextLine ele vai ler tudo
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o seu nome? ");
		String nome = sc.nextLine();
		System.out.println(nome);
		// estudar sobre os args
		
				
	}
}
