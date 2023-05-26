
import java.util.* ;
public class Heap4 {
    public static void main(String[] args) {
        PriorityQueue<Integer> minimumCostHeap=new PriorityQueue<>();
        int ropes[]={4,3,2,6};
        for(int i=0;i<ropes.length;i++){
            minimumCostHeap.add(ropes[i]);
        }
        int cost=0;
        while(minimumCostHeap.size()>1){
         int r1=minimumCostHeap.remove();
         int r2=minimumCostHeap.remove();
         minimumCostHeap.add(r1+r2);
         cost+=r1+r2;
        }
        System.out.println(cost);
    }
}
