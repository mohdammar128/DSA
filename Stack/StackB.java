// /*IMPLEMENTATION OF STACK OF USING ARRAT LIST */
// import java.util.ArrayList;

// public class StackB {
//     public static class Stack {
//         static ArrayList<Integer> list = new ArrayList<>();

//         public boolean isEmpty() {
//             if (list.size() == 0) {
//                 return true;
//             }
//             return false;
//         }

//         public int pop() {
//             if(isEmpty()){

//                 return Integer.MIN;
//             }
//             int top = list.get(list.size() - 1);
//             list.remove(list.size() - 1);
//             return top;
//         }

//         public int peek() {
//             if(isEmpty()){
//                 return Integer.MIN_VALUE;
//             }
//             int top = list.get(list.size() - 1);
//             return top;
//         }

//         public void push(int data) {
//          list.add(data);
//         }
//     }

//     public static void main(String[] args) {
//         Stack s=new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while(!s.isEmpty()){
//          System.out.println(s.pop());

//         }

//     }

// }

public class StackB {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        // isEmpty()
        public boolean isEmpty() {
            if (head == null) {
                return true;
            }
            return false;
        }

        // push
        public void push(int data) {
            if (head == null) {
                head = new Node(data);
                return;
            }
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }
            if (head.next == null) {
                int top = head.data;
                head = null;
                return top;

            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        System.out.println(s.pop());
    }
}
