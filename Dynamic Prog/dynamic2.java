
public class dynamic2 {

    public static int waysToClimb(int n,int ways[]){
     if(n==0){
        return 1;
     }
     if(n<0){
        return 0;
     }
     if(ways[n]!=0){
        return ways[n];
     }
     ways[n]= waysToClimb(n-1,ways)+waysToClimb(n-2,ways);
     return ways[n];
    }
   

    public static void main(String[] args) {
        int n=5;//no of stairs
        int ways[]=new int[n+1];
        System.out.println(waysToClimb(n,ways));
        
    }
}
