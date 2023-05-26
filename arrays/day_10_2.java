
//buy and sell stock
//
import java.util.*;

public class day_10_2 {
    public static int stockPrice(int arr[]) {
        int maxProfit = 0;
        int buy = arr[0];
        int currentPrice;
        for (int i = 1; i < arr.length; i++) {
            currentPrice = arr[i];
            if (currentPrice > buy) {
                maxProfit = Math.max(maxProfit, currentPrice - buy);
            } else {
                buy = currentPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextInt();
        }
        int res = stockPrice(prices);
        System.out.println("the profit is"+res);
        sc.close();
    }
}
