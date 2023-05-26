
//Nqueens Problems

public class btrack1 {
    // we are checking that can queen sit on specific cell or not if yes then this
    // fun will return true if not then this fun will return false
    public static boolean isSafe(char board[][], int row, int col) {
        // vertically Up
        for (int i = row - 1; i >= 0; --i) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonally left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonally right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    /* for one solution */
    public static boolean nQueen(char board[][], int row) {
        if (row == board.length) {
            System.out.println("------------------------------Chess board----------------------");
            return true;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueen(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'X';// back tracking step
            }

        }
        return false;
    }
    // -----------------------------------------------------------------------------------------
    // static int count=0;

    // public static void nQueen(char board[][], int row) {
    // if (row == board.length) {
    // System.out.println("------------------------------Chess
    // board----------------------");
    // print_arr(board);
    // count++;
    // return;
    // }
    // for (int j = 0; j < board.length; j++) {
    // if(isSafe(board, row, j)){
    // board[row][j] = 'Q';
    // nQueen(board, row + 1);
    // board[row][j] = 'X';
    // }

    // }
    // }

    public static void print_arr(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }
        boolean res = nQueen(board, 0);
        if (res) {
            print_arr(board);
        } else {
            System.out.println("Solution does not exists");
        }

    }
}
