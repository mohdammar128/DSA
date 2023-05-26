import java.util.*;

public class binTree1 {
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

    static class BinaryTree {

        static int idx = -1;

        public Node binaryTree(int node[]) {
            idx++;
            if (node[idx] == -1) {
                return null;
            }
            Node newNode = new Node(node[idx]);
            newNode.left = binaryTree(node);
            newNode.right = binaryTree(node);
            return newNode;
        }

        public void preorderTraversal(Node root) {
            if (root == null) {
                System.out.print("-1" + " ");

                return;
            }
            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

        public void inorderTraversal(Node root) {
            if (root == null) {
                return;
            }
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }

        public void postorderTraversal(Node root) {
            if (root == null) {
                return;
            }
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data + " ");

        }

        // level order traversal
        public void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }

            }
        }

        // height of tree
        public int heightOfTree(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = heightOfTree(root.left);
            int rh = heightOfTree(root.right);
            int height = Math.max(lh, rh) + 1;
            return height;

        }
        public int minheightOfTree(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = minheightOfTree(root.left);
            int rh = minheightOfTree(root.right);
            int height = Math.min(lh, rh) + 1;
            return height;

        }

        // count
        public int count(Node root) {
            if (root == null) {
                return 0;
            }
            int left_count = count(root.left);
            int right_count = count(root.right);
            int total_count = left_count + right_count + 1;
            return total_count;

        }

        // sum of nodes
        public int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftSubtreeSum = sumOfNodes(root.left);
            int rightSubtreeSum = sumOfNodes(root.right);
            int treeSum = leftSubtreeSum + rightSubtreeSum + root.data;
            return treeSum;
        }

        

    }

    public static void main(String[] args) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.binaryTree(node);
        // Node root=new Node(2);
        // root.right=new Node(3);
        // root.right.left=null;
        // root.right.right=new Node(4);
        // root.right.right.left=null;
        // root.right.right.right=new Node(5);
        // System.out.println(root.data);
        // tree.preorderTraversal(root);
        // tree.postorderTraversal(root);
        tree.levelOrder(root);
        // int res=tree.heightOfTree(root);
        // int res=tree.count(root);
        // int res = tree.sumOfNodes(root);
        int res=tree.minheightOfTree(root);
    
        System.out.println("Min height of  : " + res);
      
    }

}
