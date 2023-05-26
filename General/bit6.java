package General;

//fast exponentiation is O(logn)
public class bit6 {
    public static int fastExpo(int a,int p){
     int ans=1;
     while(p>0){
        if((p&1)==1){
            ans=ans*a;
        }
        a=a*a;
       p=p>>1;
     }
     return ans;

    }
    public static void main(String[] args) {
      int res=  fastExpo(5, 3);
      System.out.println(res);
    }
}
