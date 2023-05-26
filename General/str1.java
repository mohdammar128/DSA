package General;

import java.util.*;

public class str1 {
    public static boolean isPlaindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
   boolean isres =isPlaindrome(str);
   System.out.println(isres);
    sc.close();
    }
}
