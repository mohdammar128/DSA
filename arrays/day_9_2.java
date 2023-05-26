//find largest number in given array
import java.util.*;
public class day_9_2 {
    public static int LargestNumber(int n,int arr[]){
        int largest=Integer.MIN_VALUE;//yeh minmium value assign kerdega =>  -Infinity
        for(int i=0;i<arr.length;i++){
         if(arr[i]>largest){
            largest=arr[i];//update the largest
         }
        }
        return largest;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int si=sc.nextInt();//size of array
        int arr[]=new int[si];
        for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        }
      int res=  LargestNumber(si, arr);//function will return largest number and it  will store in res
      System.out.println("the largest numbers is "+res);
      sc.close();

    }
}

//time complexity =O(n)
//space complexity=O(1)