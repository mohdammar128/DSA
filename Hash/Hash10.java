import java.util.*;

public class Hash10 {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = { 15, -2, 2, -8, 1, 7, 10 };
        int sum = 0;
        int len = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (!map.containsKey(sum)) {
                map.put(sum, j);
            } else {
                len = j - map.get(sum);

            }
        }
        System.out.println(len);

    }
}
