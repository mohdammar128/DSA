import java.util.*;

class Solution {
    // memoization technique
    public static int catalansNumber(int n, int dp[]) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int ans = 0;
        for (int i = 0; i <= n - 1; i++) {
            ans = ans + catalansNumber(i, dp) * catalansNumber(n - 1 - i, dp);

        }
        dp[n] = ans;
        return ans;

    }

    public static int catlanTabulation(int n) {
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            // for summation
            int ans = 0;
            for (int j = 0; j <= i - 1; j++) {
                ans += dp[j] * dp[i - j - 1];
            }
            dp[i] = ans;
        }
        return dp[n];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dp[] = new int[11];
        Arrays.fill(dp, -1);
        // int res = catalansNumber(10, dp);
        int res2 = catlanTabulation(10);
        System.out.println(res2);
        sc.close();
    }
}