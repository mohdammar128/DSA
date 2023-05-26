package General;

import java.util.Scanner;

public class bit3 {
    public static int getIthbit(int n,int i){
    int bitmask=1<<i;
    if((bitmask&n)==0){
    return 0;
    }
    else{
        return 1;
    }
    }
    public static int setIthbit(int n,int i){
    int bitmask=1<<i;
    return n|bitmask;
    }
    
    public static int ClearIthbit(int n,int i){
    int bitmask=~(1<<i);
    return n&bitmask;
    }
    public static int ClearIbit(int n,int i){
    int bitmask=~(0)<<i;

    return n&bitmask;
    }
    public static int ClearRangebit(int n,int i,int j ){
    int a=~(0)<<(j+1);
    int b=1<<i - 1;
    int bitmask=a|b;
    return n&bitmask;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,j;
        n=sc.nextInt();
        i=sc.nextInt();
    j=sc.nextInt();
    //    System.out.println(getIthbit(n, i));
    //    System.out.println(setIthbit(n, i));
    //    System.out.println(ClearIthbit(n, i));
       System.out.println(ClearRangebit(n, i,j));
       sc.close();
    }
}
