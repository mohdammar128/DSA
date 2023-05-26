package Queue;

/*Implementation of Stack and Queues Using Deque */

import java.util.*;

public class QueueB9 {

    static class Queue {
        static Deque<Integer> dq = new LinkedList<>();

        public boolean isEmpty() {
            return dq.isEmpty();
        }

        public void add(int data) {
            dq.addLast(data);
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is full");
                return -1;
            }
            return dq.removeFirst();
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is full");
                return -1;
            }
            return dq.getFirst();
        }
    }

    static class Stack {
        static Deque<Integer> dq = new LinkedList<>();

        public boolean isEmpty() {
            return dq.isEmpty();
        }

        public void push(int data) {
            dq.addLast(data);
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return dq.removeLast();
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return dq.getLast();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }

    }
}
