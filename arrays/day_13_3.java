
//Diagonal sum problem
import java.util.*;

public class day_13_3 {
    public static int DiagonalSum(int m[][]) {
        // brute force approach ----O(n^2)
        int n = m.length - 1;

        // int ps, ss;// primary sum and secody sum
        // ps = 0;
        // ss = 0;
        // for (int i = 0; i <= n; i++) {
        //     for (int j = 0; j <= n; j++) {
        //         if (i == j) {
        //             ps += m[i][j];
        //         } else if (i + j == n) {
        //             ss += m[i][j];
        //         }
        //     }
        // }
        // return ps + ss;

        //optimized solution  O(n)
        int sum=0;
        for(int i=0;i<=n;i++){
        sum+=m[i][i];
        sum+=m[i][n-i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int res = DiagonalSum(matrix);
        System.out.println(res);
        sc.close();
    }
}
