
//binary search 
//time complexity=O(logn)
//space complexity=O(1)
import java.util.*;

public class day_9_3 {
    public static boolean binarySearch(int key, int arr[]) {
        int mid;
        int start = 0;
        int end = (arr.length) - 1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (key == arr[mid]) {
                return true;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            }
        }

        return false;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int si = sc.nextInt();
        int sorted_numbers[] = new int[si];
        for (int i = 0; i < sorted_numbers.length; i++) {
            sorted_numbers[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        boolean res = binarySearch(key, sorted_numbers);
        System.out.println(res);
        sc.close();

    }
}
