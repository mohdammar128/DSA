//number of ways to use the coin so that we get sum=amount
public class dynamic6 {
    public static int coinChange(int val[], int amount) {
        int n = val.length;
        int dp[][] = new int[n + 1][amount + 1];
        for (int j = 1; j < amount + 1; j++) {// 0th col
            dp[j][0] = 1;

        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < amount + 1; j++) {

                int v = val[i - 1]; // val of ith item
                if (v <= j) {// valid
                    dp[i][j] = dp[i][j - v] + dp[i - 1][j];

                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + "   ");
            }
            System.out.println();
        }
        return dp[n][amount];
    }

    public static void main(String[] args) {
        int val[] = { 2,5,3,6 };
        int amount = 4;
        System.out.println(coinChange(val, amount));
    }
}
