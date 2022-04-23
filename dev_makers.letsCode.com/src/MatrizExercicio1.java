public class MatrizExercicio1 {
    public static void main(String[] args) {
        int [][] numeros = new int [3][20];
        impressao(numeros);
            }

    public static int[][] inteiros (int [][] mtzInt) {
        for (int l = 0; l < mtzInt.length; l++){
            for (int c1 = 0; c1 < 20; c1 ++){
                if (l == 0) {
                    mtzInt[l][c1] = c1;
                }
                if (l == 1 & (c1 % 2 == 0)){
                    mtzInt[l][c1] = c1;
                }
                if (l == 2){
                    mtzInt[l][c1] = 19 - c1;
                }
                }
            }
        return mtzInt;
    }
    public static int impressao (int [][] mtzInt) {
        inteiros(mtzInt);
        for (int l = 0; l < mtzInt.length; l++) {
            for (int c1 = 0; c1 < 20; c1++) {
                    System.out.print(" " + mtzInt[l][c1]);
            }
            System.out.printf("%n");
        }
        return 0;
    }
}
