public class dynamic8 {
    // recursive approach
    public static int minJumph(int num[], int idx, int tar, int memo[]) {
        if (idx == tar) {
            return 0;
        }
        if (num[idx] == 0) {
            return Integer.MAX_VALUE;
        }
        if (memo[idx] != -1) {
            return memo[idx];
        }
        int minJ = Integer.MAX_VALUE;

        for (int i = idx + 1; i <= idx + num[idx] && i < tar + 1; i++) {
            int jump = minJumph(num, i, tar, memo);
            if (jump != Integer.MAX_VALUE)
                minJ = Math.min(jump + 1, minJ);

        }
        memo[idx] = minJ;
        return minJ;

    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 1, 1, 1 };
        int memo[] = new int[num.length];
        for (int i = 0; i < memo.length; i++) {
            memo[i] = -1;
        }
        System.out.println(minJumph(num, 0, num.length - 1, memo));
    }
}
