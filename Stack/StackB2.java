import java.util.*;

public class StackB2 {
    public static  String reverseString(Stack<Character> s) {
        StringBuilder str = new StringBuilder("");
        while (!s.empty()) {
            str.append(s.pop());
        }
        String str2 = str.toString();
        return str2;
    }

    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str = "Ammar";
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        System.out.println(reverseString(s));

    }
}
