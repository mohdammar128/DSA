
import java.util.*;

public class day_11_1 {
    // brute force approach O(n^2)

    // public static boolean Duplicate(int arr[]) {
    // int count;
    // for (int i = 0; i < arr.length; i++) {
    // count = 0;
    // for (int j = 0; j < arr.length; j++) {
    // if (arr[i] == arr[j]) {
    // count++;
    // }
    // }
    // if (count > 1) {
    // return true;
    // }
    // }
    // return false;
    // }

    // hash map approach O(n)-------------------------------------
    public static boolean Duplicate(int arr[]) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            m.put(arr[i],0);
        }
        for (int i = 0; i < arr.length; i++) {
            m.put(arr[i], m.get(arr[i]) + 1);// O(1) ---hash map take big O of 1 for insertion and retrieval
      
            if (m.get(arr[i]) > 1) {
                return true;
            }
        }
       

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int si = sc.nextInt();
        int numbers[] = new int[si];
        for (int i = 0; i < si; i++) {
            numbers[i] = sc.nextInt();
        }
        boolean res = Duplicate(numbers);
        System.out.println(res);
        sc.close();
    }
}
