import java.util.*;
public class StackB1 {
    
   public static void pushBottom(int data,Stack<Integer> s){
    if(s.empty()){
       s.push(data) ;
       return;
    }
    int top=s.pop();
    pushBottom(data, s);
    s.push(top);
   
   }
    public static void main(String[] args) {
      Stack<Integer> s=new Stack<>();
       s.push(1);
       s.push(2);
       s.push(3);
       pushBottom(4,s);
       s.pop();
       s.pop();
       s.pop();
       System.out.println(s.pop());
    //    while(!s.empty()){
    //     System.out.println();
    //    }
    }
}
