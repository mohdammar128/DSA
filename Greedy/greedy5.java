import java.util.*;
public class greedy5 {
 
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        int countCoins=0;
        int amount=1059;
         Arrays.sort(coins,Comparator.reverseOrder());
     ArrayList<Integer> ans=new ArrayList<>();
     int idx=0;
         while(amount!=0 && idx<coins.length ){
              if(amount>=coins[idx]){
               amount-=coins[idx];
               ans.add(coins[idx]);
               countCoins++;
              }
              else{
                idx++;
              }
         }
         System.out.println("Number of coins used :"+countCoins+"\ncoins used :"+ans);
        }
       
    }

