

class dynamic4 {

    public static boolean targetSum(int numbers[], int sum) {
        boolean dp[][] = new boolean[numbers.length + 1][sum + 1];
        for (int i = 0; i < dp.length; i++) {// 0th coloumn
            dp[i][0] = true;
        }
        
        int j;
        for (int i = 1; i < numbers.length + 1; i++) {
            for ( j = 1; j < sum + 1; j++) {
                int v = numbers[i - 1];
                if (v <= j ) {
                    dp[i][j] = dp[i-1][j-v]||dp[i-1][j];// include,exclude
                   
                }
                // exclude
                else  {
                    dp[i][j]=dp[i-1][j];
                   
                }

            }
            

        }
        
        return dp[numbers.length][sum];
    }

    public static void main(String[] args) {
        int numbers[] = { 4, 2, 7, 1, 3 };
        boolean res = targetSum(numbers, 10);
        System.out.println(res);
    }
}