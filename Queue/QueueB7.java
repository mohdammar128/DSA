package Queue;

import java.util.*;

public class QueueB7 {
  public static void Interleave(Queue<Integer> q1, int size) {

    Queue<Integer> q2 = new LinkedList<>();
    for (int i = 1; i <= size / 2; i++) {
      q2.add(q1.remove());

    }
    while (!q2.isEmpty()) {
      int temp = q2.remove();
      q1.add(temp);
      int temp2 = q1.remove();
      q1.add(temp2);
    }

  }

  public static void main(String[] args) {
    Queue<Integer> q1 = new LinkedList<>();
    q1.add(1);
    q1.add(2);
    q1.add(3);
    q1.add(4);
    q1.add(5);
    q1.add(6);
    q1.add(7);
    q1.add(8);
    q1.add(9);
    q1.add(10);

    Interleave(q1, q1.size());

    while (!q1.isEmpty()) {
      System.out.print(q1.remove() + " ");
    }

  }
}
