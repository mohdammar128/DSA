
// longest increasing subsequence

import java.util.Arrays;
import java.util.HashSet;

public class dynamic11 {
    public static int longestIncreasingSubsequence(int n, int m, int arr1[], int arr2[], int dp[][]) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        if (arr1[n - 1] == arr2[m - 1]) {
            dp[n][m] = 1 + longestIncreasingSubsequence(n - 1, m - 1, arr1, arr2, dp);
            return dp[n][m];
        } else {
            int first = longestIncreasingSubsequence(n - 1, m, arr1, arr2, dp);
            int second = longestIncreasingSubsequence(n, m - 1, arr1, arr2, dp);
            dp[n][m] = Math.max(first, second);
            return dp[n][m];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 10, 7, 4, 8 };

        HashSet<Integer> set = new HashSet<>();
        for (int val : arr) {
            set.add(val);
        }
        int arr2[] = new int[set.size()];
        int i = 0;
        for (Integer val : set) {
            arr2[i++] = val;
        }
        // System.out.println(set);
        Arrays.sort(arr2);
        int dp[][] = new int[arr.length + 1][arr2.length + 1];
        for (int k = 0; k <= arr.length; k++) {
            for (int j = 0; j <= arr2.length; j++) {
                dp[k][j] = -1;
            }
        }
        longestIncreasingSubsequence(i, i, arr, arr2, dp);
        System.out.println(dp[arr.length][arr2.length]);

    }
}
