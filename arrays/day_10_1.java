
//traping rain water problem ---- bht important hai interview perspective sey
//time complexity  = O(n)+O(n)+O(n)+O(n) =>> O(n)
//spacecomplexity  = O(n)+O(n)    => O(n)
import java.util.*;

public class day_10_1 {
    public static int trapingRainWater(int arr[]) {
        int leftMax[] = new int[arr.length]; //spacecom=O(n)
        int rightMax[] = new int[arr.length];//spacecom=O(n)
        leftMax[0] = arr[0];
        rightMax[arr.length - 1] = arr[arr.length - 1];
        // this will find leftmax of each element
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }//O(n)
        // this loop will find right max of each element
        for (int i = arr.length - 2; i >=0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }//O(n)
        int traped_water = 0;
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            traped_water += Math.min(leftMax[i], rightMax[i]) - height;
        }//O(n)
        return traped_water;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int si=sc.nextInt();// si is the size of array
        int height[]=new int[si];
        for(int i=0;i<si;i++){
         height[i]=sc.nextInt();
        }//O(n)
        int res=   trapingRainWater(height);
       System.out.println("trapped water : "+res);
       sc.close();
    }
}


