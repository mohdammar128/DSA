/*Kahn algorithm for topological sort 
 * O(V+E)
*/
import java.util.*;
public class Graph5 {
    static class Edge{
        int dest;
        int src;
        Edge(int src,int dest){
            this.dest=dest;
            this.src=src;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[3].add(new Edge(3, 1));
        graph[2].add(new Edge(2, 3));
    }
public static void calcIndeg(ArrayList<Edge> graph[],int indeg[]){
  for(int i=0;i<graph.length;i++){
    int v=i;
   for(int j=0;j<graph[v].size();j++){
    Edge e=graph[v].get(j);
    indeg[e.dest]++;
   }


  }
}
    public static void topSort(ArrayList<Edge> graph[]){
     int indeg[]=new int[graph.length];
     calcIndeg(graph, indeg);
     Queue<Integer> q=new LinkedList<>();
     for(int i=0;i<indeg.length;i++){
        if(indeg[i]==0){
            q.add(i);//add the vertex
        }
     }
     //bfs
     while(!q.isEmpty()){
        int curr=q.remove();
        System.out.print(curr+" ");
        for(int j=0;j<graph[curr].size();j++){
            Edge e=graph[curr].get(j);
            indeg[e.dest]--;
            if(indeg[e.dest]==0){
                q.add(e.dest);
            }
        }
     }
    }

    public static void main(String[] args) {
        @SuppressWarnings ("unchecked")
        ArrayList<Edge> graph[]=new ArrayList[6];
        createGraph(graph);
        topSort(graph);
    }
}
