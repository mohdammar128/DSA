//soduko problem
public class btrack3 {
    public static void print(int table[][]) {
        System.out.println("--solution table---");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int table[][], int row, int col, int digit) {
        // for row checking
        for (int i = 0; i < table.length; i++) {
            if (table[row][i] == digit) {
                return false;
            }
        }
        for (int i = 0; i < table.length; i++) {
            if (table[i][col] == digit) {
                return false;
            }
        }
        // to check whether it is present in subgrid or not
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (table[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean solveSoduko(int table[][], int row, int col) {
        // base case

        if (row == table.length) {
            return true;
        }
        int nextRow = row;
        int nextCol = col + 1;
        if (nextCol == table.length) {
            nextRow = row + 1;
            nextCol = 0;
        }
        if (table[row][col] != 0) {
            return solveSoduko(table, nextRow, nextCol);
        }
        for (int digit = 1; digit <= table.length; digit++) {
            if (isSafe(table, row, col, digit)) {

                table[row][col] = digit;
                if (solveSoduko(table, nextRow, nextCol)) {
                    return true;
                }

            }
            table[row][col] = 0;

        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = { { 0,0,0,0,0,0,0,0,0 },
        { 0,0,1,0,0,7,0,0,5 },
        { 4, 0, 0, 2, 0, 0, 0, 0, 9 },
        { 0, 0, 0, 0, 0, 0, 8, 3, 0 },
        { 6, 0, 0, 5, 0, 0, 0, 0, 2 },
        { 1, 0, 0, 0, 3, 0, 5, 0, 0 },
        { 0, 0, 7, 0, 2, 0, 0, 9, 8 },
        { 0, 0, 9, 4, 0, 0, 0, 0, 0 },
        { 0, 0, 8, 3, 0, 0, 0, 0, 0 } };
     boolean res=   solveSoduko(arr, 0, 0);
     if(res){
        print(arr);
     }
     else{
        System.out.println("nt possible to solve");
     }

    }
    
}
