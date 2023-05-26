
//print each first later word in uppercaseS
// import java.util.*;


package General;

public class str4 {
    public static String ConvertCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length()) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "hi mariya how are you";
       String s;
       s=ConvertCase(str);
        System.out.println(s);

    }
}
