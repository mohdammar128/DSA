
/*lowest Common ancestor */
import java.util.*;

public class binTree5 {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean getpath(Node root, ArrayList<Node> path, Node node) {
        if (root == null) {
            return false;
        }
        path.add(root);

        if (root.data == node.data) {
            return true;
        }
        boolean foundleft = getpath(root.left, path, node);
        boolean foundright = getpath(root.right, path, node);
        if (foundleft || foundright) {
            return true;
        }
        path.remove(root);
        return false;
    }

    public static Node lowestCommon(Node root, Node n1, Node n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getpath(root, path2, n2);
        getpath(root, path1, n1);
        if (path1.size() == 0 || path2.size() == 0) {
            System.out.println("No common ancestor exist");
            return null;
        }
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        return path1.get(i - 1);

    }

    // approach
    public static Node lowestCommon2(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftlowest = lowestCommon2(root.left, n1, n2);
        Node rightlowest = lowestCommon2(root.right, n1, n2);
        if (rightlowest == null) {
            return leftlowest;
        }
        if (leftlowest == null) {
            return rightlowest;
        }
        return root;

    }
    // Minimum distance between 2 Nodes

    public static int minimumDistance(Node root, int n1, int n2) {
        Node lca = lowestCommon2(root, n1, n2);
        return LcaDistance(lca, n1) + LcaDistance(lca, n2);
    }

    public static int LcaDistance(Node root, int n1) {

        if (root == null) {
            return -1;
        }
        if (root.data == n1) {
            return 0;
        }
        int leftDistance = LcaDistance(root.left, n1);
        int rightDistance = LcaDistance(root.right, n1);

        if (leftDistance > -1) {
            leftDistance++;
            return leftDistance;
        }
        if (rightDistance > -1) {
            rightDistance++;
            return rightDistance;
        }
        return -1;
    }

    // find kth ancestor

    public static int kthAncestor(Node root, int n1, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n1) {
            return 0;
        }
        int leftDistance = kthAncestor(root.left, n1, k);
        int rightDistance = kthAncestor(root.right, n1, k);
        if (leftDistance == -1 && rightDistance == -1) {
            return -1;
        }
        // ager mujhey node mil gyi
        int max = Math.max(leftDistance, rightDistance);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
    }

    // treeTransform sum
    public static void Transform(Node root) {
        if (root == null) {
            return;
        }
      
        root.data = subTreeSum(root.left) + subTreeSum(root.right);
        Transform(root.left);
        Transform(root.right);

    }

    public static int subTreeSum(Node root) {
        if (root == null) {
            return 0;
        }
        int leftsum = subTreeSum(root.left);
        int Rightsum = subTreeSum(root.right);
        int total_sum=leftsum + Rightsum+root.data;
        return  total_sum;

    }

    public static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println(lowestCommon(root, root.left.right, root.left.left).data);
        // System.out.println(minimumDistance(root, 1, 2));
        // kthAncestor(root, 6, 3);
        Transform(root);
        preOrderTraversal(root);

    }
}
