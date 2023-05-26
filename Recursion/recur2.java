public class recur2 {
    public static int fibo(int n){
     if(n==0){
        return 0;
     }
     if(n==1){
        return 1;
     }
     int fn_1=fibo(n-1);
     int fn_2=fibo(n-2);
     int res=fn_1+fn_2;
     return res;
    }
    public static void main(String[] args) {
        int res=fibo(10);
        System.out.println(res);
    }
}

