import java.util.Scanner;

public class Aula4 {
    public static void main(String[] args) {
        int numero1;
        int numero2;

        Scanner pr = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro para realizar uma operação matemática:");
        numero1 = pr.nextInt();

        Scanner sg = new Scanner(System.in);
        System.out.println("Digite o segundo número inteiro para realizar uma operação matemática: ");
        numero2 = sg.nextInt();

        System.out.printf(" O resultado da soma entre %d e %d é %d.", numero1, numero2, numero1 + numero2);

        System.out.println(" ");

        System.out.printf(" O resultado da subtração de %d por %d é %d.", numero1, numero2, numero1 - numero2);

        System.out.println(" ");

        System.out.printf(" O resultado da multiplicação entre %d e %d é %d.", numero1, numero2, numero1 * numero2);

        System.out.println(" ");

        System.out.printf(" O resultado da divisão de %d por %d é %.2f.", numero1, numero2, (float) numero1 / numero2);

        }
    }

