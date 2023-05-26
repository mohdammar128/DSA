package General;

public class bit5 {
    public static void CountSetBit(int n){
        int count=0;
        while(n>0){
        if((n&1)!=0){
         count++;
        }
        n=n>>1;
        
    }
        System.out.println(count);
    }
    public static void main(String[] args) {
        CountSetBit(5);
    }
}
//time complexity O(logn)
