import java.util.*;

public class Graph8 {
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

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[2].add(new Edge(2, 3, 2));
        graph[3].add(new Edge(3, 4, 4));
        graph[4].add(new Edge(4, 1, -1));
        graph[1].add(new Edge(1, 2, -4));
    }

    public static void createGraph2(ArrayList<Edge> edges) {
        edges.add(new Edge(0, 1, 2));// e1
        edges.add(new Edge(0, 2, 4));// e2
        edges.add(new Edge(2, 3, 2));// e3
        edges.add(new Edge(3, 4, 4));// e4
        edges.add(new Edge(4, 1, -1));// e5
        edges.add(new Edge(1, 2, -4));// e6
    }

    public static void bellamanFord(ArrayList<Edge> edges, int src, int V) {
        int dist[] = new int[V];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;// +infinity
            }
        }
        // outer loop for V-1 times;

        boolean flag = false;
        //O(V)
        for (int i = 1; i <= V - 1; i++) {
            // for each vertex O(E)
            for (int j = 0; j < edges.size(); j++) {
                Edge e = edges.get(j);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;
                // relaxation
                if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }

        }
        for (int i = 0; i < dist.length; i++) {
            System.out.println(src + "->" + i + " =>" + dist[i]);
        }

    }
    //total complexity => O(V*E)

    public static void main(String[] args) {
        // @SuppressWarnings("unchecked")
        // ArrayList<Edge> graph[] = new ArrayList[5];
        ArrayList<Edge> edges = new ArrayList<>();// it will give us edge list
        createGraph2(edges);
        int V = 5;
        bellamanFord(edges, 0, V);

    }
}
