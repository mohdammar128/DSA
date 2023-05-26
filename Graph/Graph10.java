
/*Minimum cost for coneecting cities */
import java.util.*;

public class Graph10 {
    static class Edge implements Comparable<Edge> {
        int dest, wt;

        Edge(int dest, int wt) {

            this.dest = dest;
            this.wt = wt;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.wt - e2.wt;
        }
    }

    public static int minimumCost(int cities[][]) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[cities.length];
        pq.add(new Edge(0, 0));
        int minCost = 0;
        
        //O(V+E)logV
        while (!pq.isEmpty()) {
            Edge curr = pq.remove();
            if (!vis[curr.dest]) {
                vis[curr.dest] = true;
                minCost += curr.wt;
                for (int j = 0; j < cities[curr.dest].length; j++) {
                    if (cities[curr.dest][j] != 0) {
                        pq.add(new Edge(j, cities[curr.dest][j]));
                    }
                }
            }

        }
        return minCost;
    }

    public static void main(String[] args) {
         int cities[][]={{0,1,2,3,4},{1,0,5,0,7},{2,5,0,6,0},{3,0,6,0,0},{4,7,0,0,0}};
          
      int res= minimumCost(cities);
      System.out.println(res);
    }
}
