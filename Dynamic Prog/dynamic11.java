
// longest increasing subsequence

import java.util.Arrays;
import java.util.HashSet;

public class dynamic11 {
    public static int longestIncreasingSubsequence(int n, int m, int arr1[], int arr2[]) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (arr1[n - 1] == arr2[m - 1]) {
            int len = 1 + longestIncreasingSubsequence(n - 1, m - 1, arr1, arr2);
            return len;
        } else {
            int first = longestIncreasingSubsequence(n - 1, m, arr1, arr2);
            int second = longestIncreasingSubsequence(n, m - 1, arr1, arr2);
            return Math.max(first, second);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 50, 3, 10, 7, 40, 80 };

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
        System.out.println(longestIncreasingSubsequence(arr.length, arr2.length, arr, arr2));

    }
}
