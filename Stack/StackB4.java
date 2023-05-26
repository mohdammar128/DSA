/*Find next greater element 
 * O(n)
 */

import java.util.*;
public class StackB4 {
    public static void findNextGreater(int arr[],int nextGreater[]){
        Stack<Integer> s=new Stack<>();
    for(int i=arr.length-1;i>=0;i--){
        
        while( (!s.empty()) && arr[i]>=arr[s.peek()] ){
            s.pop();
        }
        if(s.empty()){
            nextGreater[i]=-1;
        }
        else{
            nextGreater[i]=arr[s.peek()];
        }
        s.push(i);
    }
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[sc.nextInt()];
    int nextGreater []=new int[arr.length];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    findNextGreater(arr,nextGreater);
    for(int val:nextGreater){
        System.out.print(val+" ");
    }
    sc.close();
   } 
}
