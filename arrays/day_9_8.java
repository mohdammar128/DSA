
//find maximum of subarray
// import java.util.*;

public class day_9_8 {
    // brute force approach
    // public static void MaxSubarraySum(int arr[]){
    // int curr_sum;
    // int max_sum=Integer.MIN_VALUE;
    // for(int i=0;i<arr.length;i++){
    // for(int j=i;j<arr.length;j++){
    // curr_sum=0;
    // for(int k=i;k<=j;k++){
    // curr_sum+=arr[k];
    // }
    // if(curr_sum>max_sum)
    // max_sum=curr_sum;
    // }
    // }
    // System.out.println(max_sum);
    // }

    // prefix_Sum
    // approach------------------------------------------------------------
    // public static int MaxSubarraySum(int arr[]) {
    //     int prefix_Sum[] = new int[arr.length];
    //     // prefix array
    //     prefix_Sum[0] = arr[0];
    //     for (int i = 0; i < arr.length; i++) {

    //         prefix_Sum[i] = prefix_Sum[i - 1] + arr[i];

    //     }

    //     int max_sum = Integer.MIN_VALUE;
    //     int curr_sum = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < arr.length; j++) {
    //             curr_sum = i == 0 ? prefix_Sum[j] : prefix_Sum[j] - prefix_Sum[i - 1];
    //             max_sum = (curr_sum > max_sum) ? curr_sum : max_sum;// updating the max_sum if condition will be true
    //         }
    //     }
    //     return max_sum;
    // }


    //-------------------------------kadane's algorithm-----------------------------------------
    //time complexity =O(n)
    public static int MaxSubarraySum(int arr[]){
    int max_sum=Integer.MIN_VALUE;
    int curr_sum=0;
    for(int i=0;i<arr.length;i++){
        curr_sum+=arr[i];
        curr_sum= curr_sum<0? 0:curr_sum;
       max_sum= Math.max(max_sum, curr_sum);
    }

        return max_sum;
    }
    public static void main(String args[]) {
        int number[] = { -2,-3,4,-1,-2,1,5,-3 };
        int res = MaxSubarraySum(number);
        System.out.println("Max_sum : " + res);
        
    }
}
