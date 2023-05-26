package Queue;

import java.util.Stack;

public class QueueB5 {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.empty();
        }

        // O(n)=>for add function
        public void add(int data) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.empty()) {
                s1.push(s2.pop());
            }

        }

        public int remove() {
            return s1.pop();
        }

        public int peek() {
            return s1.peek();
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
