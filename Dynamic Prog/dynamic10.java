// longest common substring
public class dynamic10 {
    public static void main(String[] args) {
        String x = "abcde";
        String y = "abgce";
        int dp[][] = new int[x.length() + 1][y.length() + 1];
        int ans = 0;
        // here i and j will tell about length of string
        for (int i = 1; i <= x.length(); i++) {
            for (int j = 1; j <= y.length(); j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    ans = Math.max(ans, dp[i][j]);

                } else {
                    dp[i][j] = 0;
                }
            }
        }
        System.out.println(ans);
    }
}
