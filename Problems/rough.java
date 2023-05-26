package Problems;

public class rough {
    public static boolean isJumph(int start, int nums[]) {
        if (start < 0 || start > nums.length-1 ) {
            return false;
        }
        if (nums[start] == 0) {
            return true;
        }
      
        // every index has two choice
        boolean res= isJumph(start - nums[start], nums) || isJumph(start + nums[start], nums);
        System.out.println(res);
       return res;
    }

    public static void main(String[] args) {
        int nums[] = {3,0,2,1};
        // int dp[] = new int[nums.length];
        System.out.println(isJumph(2, nums));

    }
}
