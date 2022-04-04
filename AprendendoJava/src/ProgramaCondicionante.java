import java.util.Scanner;

public class ProgramaCondicionante {
	public static void main(String[] args) {

		double nota;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Qual a sua nota? ");
			nota = sc.nextDouble();
		}
		if (nota < 20) {
			System.out.println("Você já reprovou!!");
			return;

		}
		if (nota < 60 && nota >= 20) {
			System.out.println("Você ainda pode fazer a recuperação");
			return;

		} else {
			System.out.println("Você já passou!!");
			return;
		}

	}

}
