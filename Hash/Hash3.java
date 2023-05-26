import java.util.*;

public class Hash3 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        hm.put("Murugank",39);
        hm.put("Abhinav",45);
        hm.put("Ammar", 82);
        System.out.println(hm);
/*keys will be in sorted order in treeMap hash */
        TreeMap<String,Integer> hm2=new TreeMap<>();
        hm2.put("Ammar", 82);
        hm2.put("Aditya", 158);
        hm2.put("murugank", 39);
        hm2.put("Dishant", 136);
        hm2.put("Archit", 50);
        hm2.put("Avi", 138);
        System.out.println(hm2);

    }
}
