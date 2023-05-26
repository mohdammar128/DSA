package General;

//lexicographical order
import java.util.*;
public class str3 {
    public static void LexicoGraphicallyLargest(String arr[]){
        String largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(largest.compareToIgnoreCase(arr[i])<0){
             largest=arr[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number Number of string");
        int n=sc.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();

            
        }
        System.out.println("Print");
        LexicoGraphicallyLargest(str);
        sc.close();
    }
}
