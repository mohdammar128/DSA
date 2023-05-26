import java.util.*;

class Graph2 {
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
        // vertex 0
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 3, 1));
        // vertex 1
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 1));
        // vertex 2
        graph[2].add(new Edge(2, 1, 1));

        // vertex 3
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 0, 1));

        // vertex 4
        graph[4].add(new Edge(4, 3, 1));

    }

    // bfs for connected component of graph
    public static void bfs(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                bfsUtil(graph, i, visited);
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge> graph[], int i, boolean visited[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while (!q.isEmpty()) {
            int curr = q.remove();
            // adjacent vertex of curr
            if (!visited[curr]) {
                System.out.println(curr + " ");
                visited[curr] = true;
                for (int j = 0; j < graph[curr].size(); j++) {
                    Edge e = graph[curr].get(j);
                    q.add(e.dest);
                }
            }
        }
    }

    // dfs for connected component
    public static void dfs(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                dfsUtil(graph, visited, i);
            }
        }
    }

    public static void dfsUtil(ArrayList<Edge> graph[], boolean visted[], int curr) {
        System.out.print(curr + " ");
        visted[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visted[e.dest])
                dfsUtil(graph, visted, e.dest);
        }
    }

    // cycle detection in graph
    public static boolean detectCycle(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];

        // for each component of graph we have to check that why we are using for loop
        // here
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                if (detectUtil(graph, visited, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectUtil(ArrayList<Edge> graph[], boolean visited[], int curr, int parent) {
        visited[curr] = true;
        // adjacent(neighbour of curr) of curr
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            // case 3
            if (!visited[e.dest]) {
                if (detectUtil(graph, visited, e.dest, curr))
                    return true;
            }
            // case 1 always exist cyle
            else if (visited[e.dest] && e.dest != parent) {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        createGraph(graph);
        // bfs(graph);
        // dfs(graph);
        boolean res = detectCycle(graph);
        if (res) {
            System.out.println("Cycle exits in graph");
        } else {
            System.out.println("cycle does not exit ");
        }

    }
}