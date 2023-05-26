
//reverse an array 
//time complexity=O(n)
//space complexity=O(1)
import java.util.*;

public class day_9_5 {

    public static void reverseArr(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int si, arr[];
        si = sc.nextInt();
        arr = new int[si];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArr(arr);
        for (int val : arr) {
            System.out.print(val + " ");
        }
        sc.close();

    }
}
