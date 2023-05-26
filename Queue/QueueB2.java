package Queue;

/*Circular queue */

public class QueueB2 {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return (rear == -1 && front == -1);
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("queue is full");
                return;
            }
            if (rear == -1) {
                front = 0;
                rear = 0;
                arr[rear] = data;
                return;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;

        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("quueu is empty");
                return -1;
            }
            if (front == rear) {
                rear = -1;
                front = -1;
                return arr[front + 1];
            } else {
                int res = arr[front];
                front = (front + 1) % size;
                return res;
            }

        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }

    }
}
