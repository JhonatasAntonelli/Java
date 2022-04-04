import java.util.Scanner;

public class EstruturaDeRepeti��o {
	public static void main(String[] args) {

		int numero;
		int ultimo;
		int intervalo;
		int total = 1;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("A partir de qual n�ero voc� iniciar a contagem? ");
			numero = sc.nextInt();
			if (numero <= 0) {
				numero = 1;
			}

			System.out.println("Qual � o ultimo n�mero da contagem? ");
			ultimo = sc.nextInt();
			if (ultimo <= 0) {
				ultimo = 1;
			}

			System.out.println("Qual � o intervalo da contagem? ");
			intervalo = sc.nextInt();
			if (intervalo <= 0) {
				intervalo = 1;
			}

		}

		for (int i = numero; i <= ultimo; i += intervalo) {
			System.out.println("Os nueros s�o: " + i);
			total *= i;
		}
		System.out.println("A fatora��o dos n�meros �: " + total);
	}

}
