public class dynamic5 {
    // here we are using tabulation method
    public static int unboundedKnapsack(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];// it will store maximum of considered item
        for (int i = 0; i < dp.length; i++) {// oth row
            dp[i][0] = 0;

        }
        for (int j = 0; j < dp[0].length; j++) {// oth row
            dp[0][j] = 0;

        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        /*
         * i=> no of item
         * j=> size of knapsack
         */
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1];
                int w = wt[i - 1];
                // include+excluude
                if (w <= j) {
                    dp[i][j] = Math.max(v + dp[i][j - w], dp[i - 1][j]);
                }
                // exclude
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        int val[] = {10, 15, 40};
        int wt[] = {1, 2, 3};
        int W = 6;
        System.out.println(unboundedKnapsack(val, wt, W));

    }

}
