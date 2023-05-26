import java.util.*;

/*bipartite graph => O(V+E) */
public class Graph3 {
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
        graph[0].add(new Edge(0, 2, 1));
        // vertex 1
        graph[1].add(new Edge(1, 3, 1));
        graph[1].add(new Edge(1, 0, 1));
        // vertex 2
        graph[2].add(new Edge(2, 0, 1));
        // graph[2].add(new Edge(2, 4, 1));

        // vertex 3
        // graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 1, 1));

        // vertex 4
        // graph[4].add(new Edge(4, 2, 1));
        // graph[4].add(new Edge(4, 3, 1));

    }
//O(V+E)//coloring method bfs based
    public static boolean isBipartite(ArrayList<Edge> graph[]) {
        Queue<Integer> q = new LinkedList<>();
        int color[] = new int[graph.length];
        for (int i = 0; i < color.length; i++) {
            color[i] = -1;
        }
        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) {
                q.add(i);
                color[i] = 0; // yellow color
            }
            while (!q.isEmpty()) {
                int curr = q.remove();
                for (int j = 0; j < graph[curr].size(); j++) {
                    Edge e = graph[curr].get(j);
                    if (color[e.dest] == -1) {
                        q.add(e.dest);
                        color[e.dest] = color[curr] == 1 ? 0 : 1;
                    } else if (color[curr] == color[e.dest]) {
                        return false;//Not bi partite graph
                    }
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
    @SuppressWarnings("unchecked")
     ArrayList<Edge>graph[]=new ArrayList[4];
     for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<>();
     }
     createGraph(graph);
     System.out.println(isBipartite(graph));
    }
}
