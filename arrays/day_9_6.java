
//print pair in array 
import java.util.*;

public class day_9_6 {
    public static void printPair(int arr[]){
     for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            System.out.print("("+arr[i]+","+arr[j]+")"+" ");
        }
        System.out.println();
     }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       int numbers[]={2,4,6,8,10};
      printPair(numbers);
      sc.close();

    }
}
