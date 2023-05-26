package Problems;
/*Cheapest flisght problem */
import java.util.*;

public class prob_g {
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

    public static void createGraph(ArrayList<Edge> graph[], int flights[][]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();

        }
        for (int i = 0; i < flights.length; i++) {
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];
            graph[src].add(new Edge(src, dest, wt));
        }
    }

    static class Information {
        int src;
        int stp;
        int cost;

        Information(int src, int cost, int stp) {
            this.src = src;
            this.stp = stp;
            this.cost = cost;
        }
    }

    public static int cheapestFlight(int n, int flights[][], int src, int dest, int k) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[4];
        createGraph(graph, flights);

        int dist[] = new int[n];

        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;

            }
        }
        Queue<Information> q = new LinkedList<>();
        q.add(new Information(src, 0, 0));
        while (!q.isEmpty()) {
            Information curr = q.remove();
            if (curr.stp > k) {
                break;
            }
            for (int i = 0; i < graph[curr.src].size(); i++) {
                Edge e = graph[curr.src].get(i);
                
                int v = e.dest;
                int wt = e.wt;
                if ( curr.cost+ wt < dist[v] && curr.stp<=k) {
                    dist[v] = curr.cost + wt;
                    q.add(new Information(e.dest, dist[v], curr.stp + 1));

                }

            }
           

        }
        if(dist[dest]==Integer.MAX_VALUE){
            return -1;//matlab mai destination tak pahuncha hi nhi ussey pahley  value exceed ker gyi her possible path key liye
        }
        else{
        return dist[dest];
        }
        
    }

    public static void main(String[] args) {
        int flights[][] = { { 0, 1, 100 }, { 1, 2, 100 }, { 1, 3, 600 }, { 2, 0, 100 }, { 2, 3, 200 } };
        int src = 0;
        int dest = 3;
        int k = 1;
        int n=4;
         int res=cheapestFlight(n, flights, src, dest, k);
         System.out.println(res);
    }
}
