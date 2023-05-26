import java.util.*;

public class bst2 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.left = null;
        }

    }

    // Create balance tree
    public static Node createBst(ArrayList<Integer> arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = createBst(arr, start, mid - 1);
        root.right = createBst(arr, mid + 1, end);
        return root;
    }

    // convert tree into balance bst
    public static Node convertToBalanceBst(Node root, ArrayList<Integer> inorder) {
        // step 1 find inorder sequence
        inorderTraversal(root, inorder);
        // create balance tree using that inorder sequence
        root = createBst(inorder, 0, inorder.size() - 1);
        return root;
    }

    // inorder traversal of tree
    public static void inorderTraversal(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, inorder);
        inorder.add(root.data);
        inorderTraversal(root.right, inorder);
    }

    // preorder traversal of tree
    public static void preorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void main(String[] args) {
        Node root = null;
        ArrayList<Integer> inorder = new ArrayList<>();
        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(3);
        // arr.add(5);
        // arr.add(6);
        // arr.add(8);
        // arr.add(10);
        // arr.add(11);
        // arr.add(12);
        // root= createBst(arr, 0, arr.size()-1);
        root = new Node(8);
        root.left = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        Node balroot = convertToBalanceBst(root, inorder);
        preorderTraversal(balroot);
    }

}
