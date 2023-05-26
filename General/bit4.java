package General;

//check number is power of 2 or not
public class bit4 {
    public static boolean isPower(int n){
     if((n&(n-1))==0) {
        return true;
     }
     else{
        return false;
     }
   

    }
    
    public static void main(String[] args) {
      System.out.println(isPower(32));
    }
}
