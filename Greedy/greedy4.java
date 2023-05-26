import java.util.*;
class greedy4{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int pair[][]=new int[n][2];
        for(int i=0;i<pair.length;i++){
            pair[i][0]=sc.nextInt();
            pair[i][1]=sc.nextInt();
        }
        Arrays.sort(pair,Comparator.comparingInt(o->o[1]));
        int chainLen=1;
        int chainEnd=pair[0][1];
        for(int i=1;i<pair.length;i++){
            System.out.println(chainLen);
            if(pair[i][0]>chainEnd){
                chainLen++;
                chainEnd=pair[i][1];
            }
        }
        System.out.println("maxChain length "+chainLen);
       
        sc.close();
    }
}