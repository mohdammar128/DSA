import java.util.*;

public class Hash4 {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int nums[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        // int nums[] = { 1, 2 };
        // for (int i = 0; i < nums.length; i++) {
        // if (!hm.containsKey(nums[i])) {
        // hm.put(nums[i], 0);
        // }
        // }//O(n)
        for (int i = 0; i < nums.length; i++) {

            // hm.put(nums[i], 1 + hm.get(nums[i]));
            // shorthand property
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        } // O(n)

       
        for (Integer k : hm.keySet()) {
            if (hm.get(k) > Math.floorDiv(nums.length, 3)) {
                System.out.print(k + " ");

            }

        } // O(n)

    }
}

// Total time Complexity=> O(n)
