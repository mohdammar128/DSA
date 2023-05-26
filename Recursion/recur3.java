
/*towe of hanio problem */
public class recur3 {
    public static void towerOfHanoi(int n,char src,char dest,char helper){
    if(n==1){
        System.out.println("move from disk "+ n + " "+src +" to "+ dest);
        return ;
    }
    towerOfHanoi(n-1, src, helper, dest);
    System.out.println("move from disk "+ n +" "+ src +" to "+ dest);
    towerOfHanoi(n-1, helper, dest, src);
    }
    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'C', 'B');
    }
}
