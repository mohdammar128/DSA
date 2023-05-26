import java.util.*;

public class greedy2 {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;
        double ratio[][] = new double[val.length][2];

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) (weight[i]);
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));// ascending order
        int capacity = W;
        int finalValue = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            //complete saaman bag mey aaney key liye
            if (capacity >= weight[idx]) {
                finalValue += val[idx];
                capacity -= weight[idx];
            } else {
                //fractional item (complete nhi ayega uss khuch fraction bas jayega bag mey)
                finalValue += capacity* ratio[i][1];
                capacity=0;
            }
        }
        System.out.println(finalValue);
    }

}
