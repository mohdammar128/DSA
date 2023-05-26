package Queue;

import java.util.*;

public class QueueB6 {
    public static void findfirstNonRepeating(String str, int frequency[]) {
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            frequency[ch - 'a']++;
            while (!q.isEmpty() && frequency[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.print("-1");
            } else {
                System.out.print(q.peek());
            }

        }

    }

    public static void main(String[] args) {
        String str = "abcdef";
        int frequency[] = new int[26];
        findfirstNonRepeating(str, frequency);

    }
}
