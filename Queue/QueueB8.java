package Queue;

import java.util.*;

public class QueueB8 {
    public static void reverseQueue(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }
        int front = q.remove();
        reverseQueue(q);
        q.add(front);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverseQueue(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
