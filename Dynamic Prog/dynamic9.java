import java.util.*;

public class dynamic9 {

    public static int LCS(String s1, int n, String s2, int m, int dp[][]) {

        if (n == 0 || m == 0)
            return 0;
        char lc1 = s1.charAt(n - 1);
        char lc2 = s1.charAt(m - 1);
        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        if (lc1 == lc2) {

            dp[n][m] = 1 + LCS(s1, n - 1, s2, m - 1, dp);
            return dp[n][m];
        } else {
            int ans1 = LCS(s1, n - 1, s2, m, dp);
            int ans2 = LCS(s1, n, s2, m - 1, dp);
            dp[n][m] = Math.max(ans1, ans2);
        }
        return dp[n][m];
    }

    public static int lcsTabulation(String s1,String s2,int dp2[][]){
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                // if the last character of string having length i and j are equal
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp2[i][j]=dp2[i-1][j-1]+1;

                }
                // if last character are different 
                else{
                 dp2[i][j]=Math.max(dp2[i-1][j],dp2[i][j-1]);
                }
            }

        }
        return dp2[s1.length()][s2.length()];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int dp[][] = new int[n + 1][m + 1];
        int dp2[][] = new int[n + 1][m + 1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                dp[i][j]=-1;
            }

        }
        sc.nextLine();
        String s1 = sc.next();
        String s2 = sc.next();
      
        // System.out.println(LCS(s1, s1.length(), s2, s2.length(),dp));
        System.out.println(lcsTabulation(s1, s2, dp2));
        sc.close();
    }
    
}
