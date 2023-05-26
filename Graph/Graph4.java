import java.util.*;

public class Graph4 {
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
    /* Directed graph */

    public static void createGraph(ArrayList<Edge> graph[]) {

        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));
        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[3].add(new Edge(3, 1, 1));

    }

    /* Cycle detection in directed graph */
    public static boolean isCylce(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];// it will track call stack
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (isCycleUtil(graph, vis, stack, i)) {
                    return true;
                }
            }
        }
        return false;

    }

    // O(V+E)
    public static boolean isCycleUtil(ArrayList<Edge> graph[], boolean vis[], boolean stack[], int curr) {
        vis[curr] = true;
        stack[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (stack[e.dest]) {// cycle exist
                return true;
            } else if (!vis[e.dest]) {
                if (isCycleUtil(graph, vis, stack, e.dest)) {
                    return true;
                }

            }

        }
        stack[curr] = false;
        return false;

    }

    // topological sorting

    public static void topologicalSort(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topSortUtil(graph, vis, s, i);// modified dfs
            }
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    public static void topSortUtil(ArrayList<Edge> graph[], boolean vis[], Stack<Integer> s, int curr) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topSortUtil(graph, vis, s, e.dest);
            }
        }
        s.push(curr);

    }

    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[6];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        createGraph(graph);
        System.out.println(isCylce(graph));
        topologicalSort(graph);

    }
}
