
// Time complexity O(n*m)
// convert string 1st into string2  with min number of operation
import java.util.*;

public class dynamic12 {
    public static int allSolution(String w1, String w2, int n, int m, int dp[][]) {
        if (n == 0 && m != 0) {
            return m;
        }
        if (n != 0 && m == 0) {
            return n;
        }
        if (n == 0 && m == 0) {
            return 0;
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        if (w1.charAt(n - 1) == w2.charAt(m - 1)) {
            dp[n][m] = allSolution(w1.substring(0, n - 1), w2.substring(0, m - 1), n - 1, m - 1, dp);
            return dp[n][m];
        } else {
            int add = 1 + allSolution(w1, w2.substring(0, m - 1), n, m - 1, dp);
            int del = 1 + allSolution(w1.substring(0, n - 1), w2, n - 1, m, dp);
            int replace = 1 + allSolution(w1.substring(0, n - 1), w2.substring(0, m - 1), n - 1, m - 1, dp);
            dp[n][m] = Math.min(Math.min(add, del), replace);
            return dp[n][m];

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w1 = "intention";
        String w2 = "execution";
        int n = w1.length();
        int m = w2.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = -1;
            }
        }
        int res = allSolution(w1, w2, n, m, dp);
        System.out.println(res);
        sc.close();
    }
}
