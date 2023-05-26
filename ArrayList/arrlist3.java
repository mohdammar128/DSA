package ArrayList;

import java.util.*;
public class arrlist3 {
  //brute force approach O(n^2)
//    public static  boolean pairSum(ArrayList<Integer> arr,int tar){
//     for(int i=0;i<arr.size()-1;i++){
//         for(int j=i+1;j<arr.size();j++){
//             int sum=arr.get(i)+arr.get(j);
//             if(sum==tar){
//                 return true;
//             }
//         }
//     }
//     return false;
//    }

/*Two pointer approach  */
public static boolean pairSum(ArrayList<Integer>arr,int target){
   int lp=0;//left pointer variable
   int rp=arr.size()-1; //right pointer variable
   while(lp<rp){
    int sum=arr.get(lp)+arr.get(rp);
    if(sum==target){
    return true;
    }
    //ager mera sum target sey zyada hai toh mai rigthpointer ko decrese ker dunga
    else if(sum>target){
        rp--;
    }
    //ager sum chota hai target sey toh mai left pointer ko update ker dunga
    else{
        lp++;
    }
   }
   return false;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int target=sc.nextInt();
        boolean res=pairSum(arr,target);
        System.out.println(res);
        sc.close();

    }
}
