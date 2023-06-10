import java.util.*;

class dynamic15 {
    public static int countAllBst(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        // it says when we have two nodes then only two bsts are possible
        // lets solve it from small problem to large problem
        // here i tells about value of n for smaller problem
        for (int i = 2; i <= n; i++) {
            for (int left = 0; left <= i - 1; left++) {
                dp[i] += dp[left] * dp[i - left - 1]; // left subtree * right subtree
            }

        }
        return dp[n];

    }

    public static void main(String[] args) {
        int n = 10;
        int res = countAllBst(n);
        System.out.println(res);
    }
}