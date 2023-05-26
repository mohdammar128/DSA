/*
 * find diameter of tree 
 * find whether subtree exist in tree or not
 */
import java.util.*;

public class binTree2 {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    // static class Info {
    // int diam;
    // int ht;

    // Info(int diam, int ht) {
    // this.diam = diam;
    // this.ht = ht;
    // }
    // }

    // public static Info diameter(Node root) {
    // if (root == null) {

    // return new Info(0, 0);
    // }
    // Info leftInfo = diameter(root.left);
    // Info rightInfo = diameter(root.right);
    // int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.diam +
    // rightInfo.diam + 1);
    // int height = Math.max(leftInfo.ht, rightInfo.ht) + 1;
    // return new Info(diam, height);
    // }

    // // checking wheter tree is identical or not
    // public static boolean isIdentical(Node node, Node subroot) {
    // if (node == null && subroot == null) {
    // return true;
    // }
    // else if (node == null || subroot == null || node.data != subroot.data) {
    // return false;
    // }
    // return isIdentical(node.left, subroot.left) && isIdentical(node.right,
    // subroot.right);
    // }

    // public static boolean isSubtree(Node root, Node subRoot) {
    // if (root == null) {
    // return false;
    // }
    // if (root.data == subRoot.data) {
    // if (isIdentical(root, subRoot)) {
    // return true;
    // }
    // }

    // return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    // }

    /* top view of binary tree */
    static class Info {
        Node node;
        int hd;// horizotal distance
        Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }

    public static void topView(Node root) {
    //level order traversal
     Queue<Info> q=new LinkedList<>();
     HashMap<Integer,Node> map=new HashMap<>();
     int min=0;
     int max=0;
     q.add(new Info(root,0));
     while(!q.isEmpty()){
        Info curr=q.remove();
        if(curr.node==null){
            if(q.isEmpty()){
                break;
            }
            else{
                q.add(null);
            }
        }
        else{
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd,curr.node);
            }
            if(curr.node.left!=null){
                q.add(new Info(curr.node.left,curr.hd-1));
                min=Math.min(min,curr.hd-1);
            }
            if(curr.node.right!=null){
                q.add(new Info(curr.node.right,curr.hd+1));
                max=Math.max(max,curr.hd+1);
            }
        }
     }
     for(int i=min;i<=max;i++){
        System.out.print(map.get(i).data+" ");
     }
    
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // subtree
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        topView(root);
        // System.out.println(isSubtree(root, subRoot));
        // System.out.println(diameter(root).diam);
        // System.out.println(diameter(root).ht);
    }
}
