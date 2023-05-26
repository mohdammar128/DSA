import java.util.*;

/*Disjoint unoin set data structure */
public class Graph11 {
    static class Edge implements Comparable<Edge> {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
@Override
        public int compareTo(Edge e2) {
            return this.wt - e2.wt;// increasing order
        }
    }

    static int n = 4;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init() {
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    public static int find(int x) {
        if (x == par[x]) {
            return x;
        }
        par[x] = find(par[x]);
        return par[x];

    }

    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);
        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] > rank[parB]) {
            par[parB] = parA;
        } else {
            par[parB] = parA;
        }
    }

    public static void createGraph(ArrayList<Edge> edges) {
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
        edges.add(new Edge(0, 3, 30));
    }

    public static void krushkals(ArrayList<Edge> edges,int V) {
        Collections.sort(edges);// O(E logE)
      
        init();
        int minimumCost = 0;
        int count = 0;// yeh track karega kii kitni edge include kiya
        for (int i = 0; count <V-1; i++) {
            Edge e = edges.get(i);
            // System.out.println(e.wt);
            int u = e.src;
            int v = e.dest;
            int wt = e.wt;
            if (find(u) != find(v)) {
                minimumCost += wt;
                
                union(u,v);
                count++;
            }
        }
        System.out.println(minimumCost);
    }

    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
        krushkals(edges,V);
    }
}
