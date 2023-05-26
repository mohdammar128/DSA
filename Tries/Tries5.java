public class Tries5 {

    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();
    public static int count=1;
    public static void insert(String suff) {
        Node curr = root;
        for (int i = 0; i < suff.length(); i++) {
            int idx = suff.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
                count++;
            }
            curr = curr.children[idx];
        }
        curr.eow=true;
    }

    public static void main(String[] args) {
        /* find suffix */
        String s = "apple";
        String suffix[] = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            suffix[i] = s.substring(i);
        }
        
        for(int i=0;i<suffix.length;i++){
            insert(suffix[i]);
        }
        System.out.println(count);


    }
}
