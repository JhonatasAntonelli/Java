import java.util.Scanner;

public class programacomcondicional {
	public static void main(String[] args) {
		int idade;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Qual a sua idade? ");
			idade = sc.nextInt();
		}
		if (idade >= 18) {
			System.out.println("Você é maior de idade");

		} else {
			System.out.println("Você é menor de idade");
		}
	}

}
