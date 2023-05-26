import java.util.*;


public class Graph9 {

    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[2].add(new Edge(2, 3, 50));
        graph[2].add(new Edge(2, 0, 15));

        graph[3].add(new Edge(3, 2, 40));
        graph[3].add(new Edge(3, 1, 40));

    }

    static class Pair implements Comparable<Pair> {
        int v;
        int cost;

        Pair(int v, int cost) {
            this.cost = cost;
            this.v = v;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;// increasing order
        }
    }

    public static void prims(ArrayList<Edge> graph[], int src) {
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        int finalCost = 0;// final totalmin weight
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.v]) {
                vis[curr.v] = true;
                finalCost+=curr.cost;
                for(int i=0;i< graph[curr.v].size();i++){
                    Edge e= graph[curr.v].get(i);
                   
                        pq.add(new Pair(e.dest, e.wt));
                    
                    
                }
               
            }
        }
        System.out.println(finalCost);
    }
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[]=new ArrayList[4];
        createGraph(graph);
        prims(graph, 0);
    }
}
