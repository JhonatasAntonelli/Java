import java.util.Scanner;

public class ProgramaCondicionante {
	public static void main(String[] args) {

		double nota;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Qual a sua nota? ");
			nota = sc.nextDouble();
		}
		if (nota < 20) {
			System.out.println("Voc� j� reprovou!!");
			return;

		}
		if (nota < 60 && nota >= 20) {
			System.out.println("Voc� ainda pode fazer a recupera��o");
			return;

		} else {
			System.out.println("Voc� j� passou!!");
			return;
		}

	}

}
