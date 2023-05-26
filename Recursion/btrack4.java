//knight tour very very important question
public class btrack4 {
    static int n = 8;
    static int chess[][] = new int[n][n];

    public static boolean KnightMove(int chess[][], int i, int j, int move) {

        if (i >= chess.length || j >= chess.length || j < 0 || i < 0 || chess[i][j] > 0) {
            return false;
        }

        else if (move == (chess.length * chess.length)) {
            chess[i][j] = move;
            chess[i][j] = 0;
            return true;
        }

        chess[i][j] = move;
        if (KnightMove(chess, i - 1, j + 2, move + 1))
            return true;
        if (KnightMove(chess, i - 2, j + 1, move + 1)) {
            return true;
        }
        if (KnightMove(chess, i + 1, j + 2, move + 1)) {
            return true;
        }
        if (KnightMove(chess, i + 2, j + 1, move + 1)) {
            return true;
        }
        if (KnightMove(chess, i + 2, j - 1, move + 1)) {
            return true;
        }
        if (KnightMove(chess, i + 1, j - 2, move + 1)) {
            return true;
        }
        if (KnightMove(chess, i - 1, j - 2, move + 1)) {
            return true;
        }
        if (KnightMove(chess, i - 2, j - 1, move + 1)) {
            return true;
        }

        chess[i][j] = 0;
        return false;
    }

    public static void print_arr(int tabel[][]) {
        System.out.println("-------solution-----------");
        for (int i = 0; i < tabel.length; i++) {
            for (int j = 0; j < tabel.length; j++) {
                System.out.print(tabel[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        KnightMove(chess, 0, 0, 1);
        print_arr(chess);
     
    }

}
