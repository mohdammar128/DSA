import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Graph7 {
    static class Edge {
        int dest;
        int src;
        int wt;

        Edge(int src, int dest, int wt) {
            this.dest = dest;
            this.src = src;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    static class Pair implements Comparable<Pair> {
        int node;
        int path;

        Pair(int node, int dist) {
            this.node = node;
            this.path = dist;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path;// increasing order
        }
    }

    public static void Dikstra(ArrayList<Edge> graph[], int src) {
        // step 1
        int dist[] = new int[graph.length];// dist[i]-> src to i
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;// +infinity
            }
        }
        // step 2
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        // step 3
        boolean vis[]=new boolean[graph.length];
       
        while (!pq.isEmpty()) {
           
            Pair curr = pq.remove();// node which has minimum distance
            if(!vis[curr.node]){
                vis[curr.node]=true;
                for (int i = 0; i < graph[curr.node].size(); i++) {
               
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if (dist[u] + wt < dist[v]) {//update distance of src to v
                        dist[v] = dist[u] + wt;
                    }
                    pq.add(new Pair(v,dist[v]));
    
                }
            }
            
        }
        //print all source to vertices  path
        for(int i=0;i<dist.length;i++){
            System.out.println(src+"->"+i+" => "+dist[i]);
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[6];
        createGraph(graph);
        int src=0;
        Dikstra(graph, src);
    }
}
