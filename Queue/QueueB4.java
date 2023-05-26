package Queue;

import java.util.*;

public class QueueB4 {
  public static void main(String[] args) {
    // Queue<Integer> q=new LinkedList<>();//or new ArrayDeque<>();
    Queue<Integer> q = new ArrayDeque<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    while (!q.isEmpty()) {
      System.out.println(q.remove());
    }
  }
}
