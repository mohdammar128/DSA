import java.util.*;

/*Parenthesie is valid or not */
public class StackB5 {
    
    public static boolean isValid(String str){
 

        Stack<Character> s=new Stack<>();
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        //opening case
        if(ch=='('||ch=='{'||ch=='['){
            s.push(ch);
        }
        else{
        

          if(s.empty()){
           return false;
          }

        //pair condition
          if((s.peek()=='(' && ch==')') ||(s.peek()=='{' && ch=='}')||(s.peek()=='[' && ch==']')){
            s.pop();
          }
          else{
            return false;
          }
        }
    }
    if(s.empty()){
        return true;
    }
    else{
        return false;
    }
    }

    public static void main(String[] args) {
        String s="({})[]";
        boolean res=isValid(s);
        System.out.println(res);
    }
}
