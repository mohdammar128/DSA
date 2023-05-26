
//tarjans algorithm
import java.util.*;

public class Graph13 {
    static class Edge {
        int dest;
        int src;

        Edge(int src, int dest) {
            this.dest = dest;
            this.src = src;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        // graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        // graph[4].add(new Edge(4, 5));

        // graph[5].add(new Edge(5, 3));
        // graph[5].add(new Edge(5, 4));

    }

    public static void tarjansBridge(ArrayList<Edge> graph[], int src) {
        boolean vis[] = new boolean[graph.length];
        int dt[] = new int[graph.length];
        int low[] = new int[graph.length];
        int time = 0;
        dfs(graph, vis, dt, low, src, -1, time);

    }

    // modified dfs
    public static void dfs(ArrayList<Edge> graph[], boolean vis[], int dt[], int low[], int curr, int p, int time) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int neigh = e.dest;
            if (neigh == p) {
                continue;
            } else if (!vis[neigh]) {
                dfs(graph, vis, dt, low, neigh, curr, time);
                low[curr] = Math.min(low[curr], low[neigh]);
                if (dt[curr] < low[neigh]) {
                    System.out.println("Bridge is " + curr + " ->" + neigh);
                }
            } else if (vis[neigh]) {
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
        }
    }

    // Articulation point
    public static void getAp(ArrayList<Edge> graph[], int curr) {
        int dt[] = new int[graph.length];
        int low[] = new int[graph.length];
        boolean vis[] = new boolean[graph.length];
        int time = 0;
        dfsAp(graph, vis, dt, low, curr, -1, time);

    }

    public static void dfsAp(ArrayList<Edge> graph[], boolean vis[], int dt[], int low[], int curr, int p, int time) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        for (int i = 0; i < graph[curr].size(); i++) {
         
        }
    }

    /* Main function has started from here */
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[5];
        createGraph(graph);
        tarjansBridge(graph, 0);

    }

}
