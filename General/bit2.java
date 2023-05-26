//find even or odd 
package General;

import java.util.*;

public class bit2 {
   public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int num=sc.nextInt();
    int res=num&1;
    if(res>0){
        System.out.println("Odd number");
    }
    else{
        System.out.println("Even number");
    }
    sc.close();
   } 

}
