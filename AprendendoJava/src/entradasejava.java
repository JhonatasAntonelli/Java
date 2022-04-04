import java.util.Scanner;

public class entradasejava {
	public static void main(String[] args) {
		String nome;
		int idade;
		double valor;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Qual o seu nome?");
			nome = sc.nextLine();

			System.out.println("Qual a sua idade?");
			idade = sc.nextInt();

			System.out.println("Qual o seu salário?");
			valor = sc.nextDouble();
		}
		System.out.println("Olá, " + nome + "a sua idade é de " + idade + " anos e você tem um salário de " + valor);
	}

}
