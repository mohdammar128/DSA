
//Time Compelexity is O(nlogk)
import java.util.*;

public class Heap6 {
    static class Pair implements Comparable<Pair> {
        int val;
        int indx;

        Pair(int val, int indx) {
            this.val = val;
            this.indx = indx;
        }

        @Override
        public int compareTo(Pair p2) {
            return p2.val - this.val;// descending order
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        ArrayList<Integer> res=new ArrayList<>();
        // 1st sliding window
        for (int i = 0; i < k; i++) {
           pq.add(new Pair(arr[i], i));//O(logn)
        }
        res.add(pq.peek().val);//O(1)
        for(int i=k;i<arr.length;i++){
            while(pq.size()>0 && pq.peek().indx<i-k){
               pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            res.add(pq.peek().val);
        }
        for(Integer val :res){
            System.out.println(val);
        }
        
    }
}
