public class recur5 {
    public static int titlingProblem(int n){
     if(n==0 ||n==1){
        return 1;
     }
     /*vertical kaam */
     int f1=titlingProblem(n-1);//faith ker rHA hoon kii agey ka kaam yeh ker dega 
     /*Horizontal choice */
     int f2=titlingProblem(n-2); //faith ker rHA hoon kii agey ka kaam yeh ker dega 
     int totways=f1+f2;
     return totways;
    }
    public static void main(String[] args) {
        int res=titlingProblem(4);
        System.out.println(res);
    }
}
