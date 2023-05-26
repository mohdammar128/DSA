import java.util.*;

class Hash6 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);
        // contains
        System.out.println(set.contains(2));
        // remove
        set.remove(3);
        System.out.println(set);
        // iteration on set
        System.out.println("Elements of set are: ");
        
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(2);
        lhs.add(1);
        lhs.add(3);
        lhs.add(4);
        System.out.println(lhs);
    }
}
