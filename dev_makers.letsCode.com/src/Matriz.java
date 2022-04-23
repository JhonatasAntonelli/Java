
import java.security.SecureRandom;// gera numero aleatórios
public class Matriz {
    // int [][] estranho = new int [2][]; iniciei apenas uma dimensão
    // int[0] = new int [20];na posição 0 eu adicionei um arrey de 20 posições
    // int [1] = new int [10]; na posição 1 eu adicionei um arrey de 10 posições
    // não precisa definir o número de colunas, apenas o de linhas
    public static void main(String[] args) {
        // Matriz 2D, o indicre sempre começa em zero
        // Pode-se udar constantes
        int linha = 3;
        int coluna = 5;
        // é possivel iniciar apenas uma dimensão e as demais podem ser iniciadas depois
        int[][] numeros = new int[3][5]; // assim se cria uma matriz com 3 linhas e 5 colunas

        for (int l = 0; l < linha; l++) {
            for (int c = 0; c < coluna; c++) {
                numeros[l][c] = new SecureRandom().nextInt(100);
                // Assim geramos um número aleatório de 0-100

            }
        }
        impDados(numeros, linha, coluna);//Chamando o método
    }
//metodo criado, chamando uma matriz(int[][]) chamada mtz e as linhas e colunas
//Esse método vai referenciar a matriz, ou seja, esse metodo pode alterar a matriz de outra função
    public static void impDados(int [][] mtz, int linhas, int colunas) {
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                System.out.printf("%d - ", mtz [l][c]);
            }
            System.out.printf("%n");// Assim imprime uma quebra de linha
            // se eu colocar um objeto e ponto logo em seguida abre uma guia com varias opções

        }
    }
}