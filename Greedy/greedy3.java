import java.util.Arrays;

//find minimum sum of absolute difference 
public class greedy3 {
    public static void main(String[] args) {
        int a[]={4,1,8,7};
        int b[]={2,3,5,6};
        Arrays.sort(a);
        Arrays.sort(b);
        double sum=0;
        for(int i=0;i<a.length;i++){
        sum+=Math.abs(a[i]-b[i]);
        }
        System.out.println(sum);
    }
}
