import java.util.Random;

public class MatrizExercicio4 {
    public static void main(String[] args) {
        int l = new Random().nextInt(10);
        int c = new Random().nextInt(10);
        int [][] mtz = new int[l][c];


        System.out.println(maior(l, c, mtz));
    }

    public static int maior(int linha, int coluna, int[][] mtz) {
        matriz(linha, coluna, mtz);
        int maiornum = 0;
        for (linha = 0; linha < mtz.length; linha++) {
            for (coluna = 0; coluna < mtz[0].length; coluna++) {
                if (mtz[linha][coluna] > maiornum) {
                   maiornum = mtz[linha][coluna];
                }
            }
        }
        return (maiornum);
    }

    public static int matriz(int linhas, int colunas, int [][] mtz) {
        for (int l = 0; l < linhas; l++){
            for (int c = 0; c < colunas; c++){
                mtz[l][c] = new  Random().nextInt(1000);
            }
        }
        return (0);
    }
}
