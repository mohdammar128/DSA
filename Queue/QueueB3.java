package Queue;

public class QueueB3 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static class Queue {
        static Node head = null;// head=front
        static Node tail = null;// tail=rear

        public boolean isEmpty() {
            if (head == null && tail == null) {
                return true;
            }
            return false;
        }

        public void add(int data) {
            if (head == null) {
                head = tail = new Node(data);
                return;
            }
            Node newNode = new Node(data);
            tail.next = newNode;
            tail = newNode;// its like rear++
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
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
}
