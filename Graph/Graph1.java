import java.util.*;

class Graph1 {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void bfs(ArrayList<Edge> graph[], int src) {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];
        q.add(src);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }

        }
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean visited[]) {
        // pahley visit kerna hai
        System.out.print(curr + " ");
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                dfs(graph, e.dest, visited);
            }
        }

    }

    public static boolean hasPath(ArrayList<Edge> graph[], int src, int dest, boolean visited[]) {
        if (src == dest) {
            return true;
        }
        visited[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            if (!visited[graph[src].get(i).dest] && hasPath(graph, graph[src].get(i).dest, dest, visited)) {
                return true;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertex in Graph :");
        int V = sc.nextInt();
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];// abhi null store kiya hua hai

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        // vertex zero
        graph[0].add(new Edge(0, 1, 5));
        // vertex 1
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        // vertex 2
        graph[2].add(new Edge(2, 4, 2));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 1, 1));
        // vertex 3
        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 1, 3));
        // vertex 4
        graph[4].add(new Edge(4, 2, 2));

        // for (int i = 0; i < graph.length; i++) {
        // ArrayList<Edge> arr = graph[i];// neighbour of ith vertex
        // System.out.print(i + " -> ");
        // for (int j = 0; j < arr.size(); j++) {
        // System.out.print(arr.get(j).dest + " ");
        // }
        // System.out.println();
        // }

        // bfs(graph, 0);
        // dfs(graph, 0, new boolean[graph.length]);
        System.out.println(hasPath(graph, 0, 0, new boolean[graph.length]));
        sc.close();

    }
}