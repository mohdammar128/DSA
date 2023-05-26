public class dynamic7 {

    public static int rodcutting(int price[], int len[], int rodLen) {
        int n = price.length;
        int dp[][] = new int[n + 1][rodLen + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < rodLen + 1; j++) {
                int p = price[i - 1];// price of ith rod
                int l = len[i - 1];// length of ith rod
                // valid
                if (l <= j) {
                    dp[i][j] = Math.max((p + dp[i][j-l]), dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }

        }
        return dp[n][rodLen];
    }

    public static void main(String[] args) {
        int len[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int rodLength = 8;
        System.out.println(rodcutting(price, len, rodLength));
    }
}
