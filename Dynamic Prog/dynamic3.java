public class dynamic3 {

    public static int knapsack(int val[], int wt[], int W, int n, int dp[][]) {
        // base case
        if (W == 0 || n == 0) {
            return 0;
        }
        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n - 1] <= W) {
            // include
            int ans1 = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1, dp);
            // exclude
            int ans2 = knapsack(val, wt, W, n - 1, dp);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        } else {
            // exclude
            dp[n][W] = knapsack(val, wt, W, n - 1, dp);
            return dp[n][W];
        }
    }

    // taboulation method
    public static int Tknapsack(int val[], int wt[], int W) {
        int dp[][] = new int[val.length + 1][W + 1];// it will store maximum of considered item
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

        for (int i = 1; i < val.length + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int w = wt[i - 1];// ith item weight
                int v = val[i - 1];// ith item weight
                if (w <= j) {
                    dp[i][j] = Math.max(v + dp[i - 1][j - w], dp[i - 1][j]);// max(include,excclude)

                } else {
                    dp[i][j] = dp[i - 1][j];// exclude wala case hai
                }
            }
        }
        return dp[val.length][W];
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;

        System.out.println(Tknapsack(val, wt, W));

    }
}
