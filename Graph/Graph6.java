import java.util.*;
public class Graph6 {
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
        graph[0].add(new Edge(0, 3));
    }

public static void printAllPaths(ArrayList<Edge> graph[],int src,int dest,String path){
    if(src==dest){
        path=path+src;
        System.out.println(path);
        return ;
    }
    for(int i=0;i<graph[src].size();i++){
        Edge e=graph[src].get(i);
        printAllPaths(graph, e.dest, dest, path+src);

    }
}

    public static void main(String[] args) {
        @SuppressWarnings ("unchecked")
        ArrayList<Edge> graph[]=new ArrayList[6];
        createGraph(graph);
        printAllPaths(graph, 5, 1, "");
    }
}
