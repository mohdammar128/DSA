import java.util.ArrayList;
import java.util.Stack;

public class Graph12 {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;

        }

    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 4));

    }
    // transpose of graph(b)

    public static ArrayList[] transposeGraph(ArrayList<Edge> graph[]) {
        ArrayList<Edge> transGraph[] = new ArrayList[graph.length];
        for (int i = 0; i < graph.length; i++) {
            transGraph[i] = new ArrayList<>();

        }
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); i++) {
                Edge e = graph[i].get(j);
                int src = e.src;
                int dest = e.dest;
                transGraph[dest].add(new Edge(dest, src));

            }
        }
        return transGraph;
    }

    // (a) topological Sort
    public static Stack<Integer> topSort(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topSortUtil(graph, vis, s, i);
            }
        }
        return s;
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

    // dfs on transposeGraph (c)
    public static void dfs(ArrayList<Edge> transGraph[], boolean vis[], int curr) {

        System.out.print(curr + " ");
        vis[curr] = true;
        for (int i = 0; i < transGraph[curr].size(); i++) {
            Edge e = transGraph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(transGraph, vis, e.dest);
            }

        }

    }

    public static void kosarajus(ArrayList<Edge> graph[]) {
        Stack<Integer> s = topSort(graph);
        ArrayList<Edge> transgraph[] = transposeGraph(graph);
        boolean vist[] = new boolean[transgraph.length];
        while (!s.empty()) {
            int curr = s.pop();
            if (!vist[curr]) {
                System.out.print("Scc->");
                dfs(transgraph, vist, curr);
                System.out.println();

            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[5];
        createGraph(graph);
        kosarajus(graph);
    }

}
