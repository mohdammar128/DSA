package Problems;
/*You are given an array points representing integer coordinates of some points on a 2D-plane, where points[i] = [xi, yi].

The cost of connecting two points [xi, yi] and [xj, yj] is the manhattan distance between them: |xi - xj| + |yi - yj|, where |val| denotes the absolute value of val.

Return the minimum cost to make all points connected. All points are connected if there is exactly one simple path between any two points.
 
  */
import java.util.*;

public class connectingPoint {

    static class Edge  {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

       
    }

    public static ArrayList[] createGraph(int[][] points) {
        ArrayList<Edge> graph[] = new ArrayList[points.length];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        int dist = 0;
        for (int i = 0; i < points.length; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];

            for (int j = 0; j < points.length; j++) {
                if (i != j) {
                    int x2 = points[j][0];
                    int y2 = points[j][1];
                    dist = Math.abs(x2 - x1) + Math.abs(y2 - y1);
                    graph[i].add(new Edge(i, j, dist));
                }
            }

        }
        return graph;
    }

    static class Pair implements Comparable<Pair> {
        int v;
        int key;

        Pair(int v, int key) {
            this.v = v;
            this.key = key;
        }
        @Override
        public int compareTo(Pair p2) {
            return this.key - p2.key;
        }
    }

    public static int prims(ArrayList<Edge> graph[], int src) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[graph.length];
        int requiredVertex=graph.length-1;
        pq.add(new Pair(src, 0));
        int finalCost = 0;
        while (!pq.isEmpty() && requiredVertex!=-1) {
            Pair curr = pq.remove();

            if (!vis[curr.v]) {
                vis[curr.v] = true;
                requiredVertex--;
                finalCost += curr.key;
                for (int i = 0; i < graph[curr.v].size(); i++) {
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair(e.dest, e.wt));
                }
            }

        }
        return finalCost;

    }

    public static int minCostConnectPoints(int[][] points) {
        ArrayList<Edge> graph[] = createGraph(points);
        return prims(graph, 0);

    }

    public static void main(String[] args) {
        int points[][] = { { 0, 0 }, { 2, 2 }, { 3, 10 }, { 5, 2 }, { 7, 0 } };

        System.out.println(minCostConnectPoints(points));
    }
}
