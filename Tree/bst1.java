import java.util.*;

public class bst1 {
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

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.data) {
            root.left = insert(root.left, val);

        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }

    }

    /*
     * Delete function
     * cases
     * leaf Node
     * one child
     * two child
     */
    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.right = delete(root.right, val);
        } else if (root.data < val) {
            root.left = delete(root.left, val);
        } else {// hamey node mil gyi jo delete kerni hai
                // case 1 leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 one child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            // case 3 two children
            Node inor_succ = findSuccessor(root.right);
            root.data = inor_succ.data;
            root.right = delete(root.right, inor_succ.data);

        }
        return root;

    }

    public static Node findSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    /* print in range */
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data <= k2 && root.data >= k1) {
            System.out.print(root.data + " ");
            printInRange(root.left, k1, k2);
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

    /* Root to leaf travel */
    public static void rootToLeaf(Node root, Stack<Integer> s) {
        if (root == null) {
            return;
        }
        s.push(root.data);
        if (root.left == null && root.right == null) {
            System.out.println(s);

        }
        rootToLeaf(root.left, s);
        rootToLeaf(root.right, s);
        s.pop();

    }

    /* Mirror of bst */
    public static void mirrorTree(Node root) {
        if (root == null) {
            return;
        }

        mirrorTree(root.left);
        mirrorTree(root.right);
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

    }

    public static void main(String[] args) {
        int val[] = { 8, 5, 10, 3, 6, 11, 1, 4, 14 };
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);
        }
        // System.out.println(search(root, 7));
        // inorderTraversal(root);

        // delete(root, 1);
        // System.out.println();
        // inorderTraversal(root);
        // printInRange(root, 1, 14);
        // rootToLeaf(root, new Stack<>());
        mirrorTree(root);
        inorderTraversal(root);
    }
}
