import java.util.HashMap;
import java.util.Set;

public class Hash1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        // insert ->O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Usa", 20);
        hm.put("Nepal", 200);
        hm.put("Brazil", 1500);
        // System.out.println(hm);
        // get -> O(1)
        // int population= hm.get("India");
        // System.out.println(population);
        // System.out.println(hm.get("Indonesia"));//when key does not exist in map then
        // its return null

        // condtains key -> O(1)
        // boolean res =hm.containsKey("India");
        // System.out.println(res);

        // remove -> O(1) : yeah key value dono ko delete ker dea ||ager key exits hi
        // nhi kerti toh uss time woh null return karega
        // int val=hm.remove("India");
        // System.out.println(val);

        // Size()
        System.out.println(hm.size());

        // isEmpty
        System.out.println(hm.isEmpty());

        // clear
        // hm.clear();
        // System.out.println(hm);


        //iteration on HashMap
      //hm.entrySet() -> return set of smaller maps
      System.out.println(hm.entrySet());
        Set<String> keys=hm.keySet();
        System.out.println(keys);

        for (String k: keys) {
            System.out.println(k+" "+hm.get(k));
        }
    }
}
