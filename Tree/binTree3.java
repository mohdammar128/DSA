//ZigZag traversal
import java.util.*;
public class binTree3 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void ZigZag(Node root) {
        Stack<Node> currLevel = new Stack<>();
        Stack<Node> nextLevel = new Stack<>();
        boolean leftToRight = true;
        currLevel.push(root);
        while (!currLevel.isEmpty()) {
            if(currLevel.isEmpty() && nextLevel.isEmpty())
            break;
            Node node = currLevel.pop();
            System.out.print(node.data + " ");
            if (leftToRight) {
               //left to right store ker rahey hain ,but pop kertey time right to left print hoga because of stack
                if (node.left != null) {
                    nextLevel.push(node.left);
                }
                if (node.right != null) {
                    nextLevel.push(node.right);

                }
            } else {
               //right to left store ker rahey hain ,but pop kertey time left to  right print hoga because of stack

                if (node.right != null) {
                    nextLevel.push(node.right);

                }
                if (node.left != null) {
                    nextLevel.push(node.left);
                }
            }
            if (currLevel.isEmpty()) {
                leftToRight = !leftToRight; //her level ko traverse kerney key baad ham flag ko change ker detey hain
                // swapping of stack
                Stack<Node> temp = new Stack<>();
                temp = currLevel;
                currLevel = nextLevel;
                nextLevel = temp;

            }
        }
       
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
       
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        ZigZag(root);
    }
}
