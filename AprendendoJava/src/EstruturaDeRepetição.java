import java.util.Scanner;

public class EstruturaDeRepetição {
	public static void main(String[] args) {

		int numero;
		int ultimo;
		int intervalo;
		int total = 1;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("A partir de qual núero você iniciar a contagem? ");
			numero = sc.nextInt();
			if (numero <= 0) {
				numero = 1;
			}

			System.out.println("Qual é o ultimo número da contagem? ");
			ultimo = sc.nextInt();
			if (ultimo <= 0) {
				ultimo = 1;
			}

			System.out.println("Qual é o intervalo da contagem? ");
			intervalo = sc.nextInt();
			if (intervalo <= 0) {
				intervalo = 1;
			}

		}

		for (int i = numero; i <= ultimo; i += intervalo) {
			System.out.println("Os nueros são: " + i);
			total *= i;
		}
		System.out.println("A fatoração dos números é: " + total);
	}

}
