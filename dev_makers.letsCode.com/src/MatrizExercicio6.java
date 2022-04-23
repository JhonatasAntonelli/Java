import java.util.Random;

public class MatrizExercicio6 {

    public static void main(String[] args) {
        int l = new Random().nextInt(1,10);
        int c = new Random().nextInt(1,10);
        double[][] mtz = new double[l][c];


        System.out.println("A média dos numeros na linha é " + (media(l, c, mtz)));
    }

    public static double media(int linha, int coluna, double[][] mtz) {
        matriz(linha, coluna, mtz);
        double soma = 0;
        int escolha = new Random().nextInt(linha+1);
        for (coluna = 0; coluna < mtz[0].length; coluna++) {
            soma += mtz[escolha][coluna];

        }
        System.out.println("A linhas escolhida é " + escolha);
        return (soma / (mtz[0].length));
    }

    public static double matriz(int linhas, int colunas, double[][] mtz) {
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                mtz[l][c] = new Random().nextInt(1,10);
            }
        }
        return (0);
    }
}


