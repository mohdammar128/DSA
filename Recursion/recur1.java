public class recur1 {
    // public static void PrintDec(int n){
    //     if(n==1){
    //         System.out.println(n);
    //         return;
    //     }
    //     System.out.println(n);
    //     PrintDec(n-1);

    // }

    // public static int fact(int n){
    //     if(n==0){
    //         return 1;
    //     }
     
    //     int res=n*fact(n-1);
    //     return res;
    // }
    public static int calSum(int n){
     if(n==0){
        return 0;
     }
     int sum=n+calSum(n-1);
     return sum;
    }
    public static void main(String[] args) {
        // PrintDec(10);
        // int res=fact(5);
       int res= calSum(10);
        System.out.println(res);
    }
}
