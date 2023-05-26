package ArrayList;

import java.util.*;

public class arrlist2 {
    // brute force approach
    // public static int storeWater(ArrayList<Integer>height){
    // int maxWater=0;
    // for(int i=0;i<height.size()-1;i++){
    //     for(int j=i+1;j<height.size();j++){
    //         int ht=Math.min(height.get(i),height.get(j));
    //         maxWater=Math.max(maxWater, ht-(j-i));
    //     }
    // }
    // return maxWater;
    // }

    /*Two pointer approach */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ht = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            ht.add(sc.nextInt());
        }
        sc.close();
     
       

    }
}
