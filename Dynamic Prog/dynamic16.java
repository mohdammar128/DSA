//mountains ranges

public class dynamic16 {
    public static int mountainRanges(int pairs) {
        int dp[] = new int[pairs + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= pairs; i++) {
            // for i pairs how many mountains are possible
            for (int j = 0; j < i; j++) {
                int inside = dp[j];
                int outside = dp[i - j - 1];
                dp[i] += inside * outside;
            }
        }
        return dp[pairs];
    }

    public static void main(String[] args) {
        int n = 4;
        int res = mountainRanges(n);
        System.out.println(res);
    }
}
