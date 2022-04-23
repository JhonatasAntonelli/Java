public class MatarzExercicio2 {
    public static void main(String[] args) {

    letraA(3,10);
    letraB(6,6);
    letraC(6, 10);
    letraD(9, 7);
    }

    public static int letraB (int linha, int coluna) {
        int [] [] letraB = new int [linha] [coluna];
        for (int l = 0; l < linha; l++){
            for (int c = 0; c < coluna; c++){
                letraB [l] [c] = l;
                System.out.print(" " + l + " ");
            }
            System.out.println();
        }
        return (0);

    }

    public static int letraA (int linha, int coluna) {

    int[][] letraA = new int [linha][coluna];
    for (int l = 0; l < linha; l++){
        for (int c = 0; c < coluna; c++){
            letraA [l] [c] = c;
            System.out.print(" " + c + " ");
        }
        System.out.println();
    }
    return (0);
    }

    public static int letraC (int linha, int coluna) {

        int[][] letraC = new int [linha][coluna];
        for (int l = 0; l < linha; l++){
            for (int c = 0; c < coluna; c++){
                letraC [l] [c] = c;
                System.out.print(" " + c * c + " ");
            }
            System.out.println();
        }
        return (0);
    }
    public static int letraD (int linha, int coluna) {

        int[][] letraD = new int [linha][coluna];
        for (int l = 0; l < linha; l++){
            for (int c = 0; c < coluna; c++) {
                if (l % 2 == 0) {
                    letraD[l][c] = -1;
                    System.out.print(" " + -1 + " ");
                } else {
                    System.out.print("  " + 0 + " ");

                }
            }
            System.out.println();
        }
        return (0);
    }
}
