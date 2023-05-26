
//print subarrays
import java.util.*;

public class day_9_7 {
    public static void printSubarray(int arr[]){
        int sum=0;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            sum=0;
            for(int k=i;k<=j;k++){
                sum+=arr[k];
                System.out.print(arr[k]+" ");
            }
            if(sum!=0)
            System.out.println(" = "+sum);
            
            
        }
       
    }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number[] = {1,2,3,4,5,-5,-3,-42};
        printSubarray(number);
        sc.close();
    }
}
