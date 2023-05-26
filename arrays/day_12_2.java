//inbuit sorting in arrays

import java.util.*;

public class day_12_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Integer nums[] = new Integer[sc.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        // Arrays.sort(nums); Acsending order
        // Arrays.sort(nums,0,3);
        Arrays.sort(nums,Collections.reverseOrder());
        
        for (int val : nums) {
            System.out.print(val + " ");
        }
        sc.close();
    }
}
