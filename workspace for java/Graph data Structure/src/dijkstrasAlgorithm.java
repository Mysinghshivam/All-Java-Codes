import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class dijkstrasAlgorithm {

    public static class Edge {
        int src;
        int des;
        int wt;

        Edge(int src, int des, int wt) {
            this.src = src;
            this.des = des;
            this.wt = wt;
        }
    }

    public static void buildGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

    }

    //dijkestra's algo
    public static class Pair implements Comparable<Pair>{
        int node;
        int dis;

        Pair(int node, int dis) {
            this.node = node;
            this.dis = dis;
        }

        @Override
        public int compareTo(Pair p2){
           return this.dis - p2.dis; //ascending order
           //for desc p2.dis - this.dis
        }
    }

    public static void dijkestra(ArrayList<Edge> [] graph, int V, int src){
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>();

        int [] dis = new int[V];
        for(int i = 0; i< V; i++){
            if(i != src){
                dis[i] = Integer.MAX_VALUE;
            }
        }
        boolean [] vis = new boolean[V];
        priorityQueue.add(new Pair(0, 0));

        //bfs
        while(!priorityQueue.isEmpty()){
            Pair pair = priorityQueue.remove();

            if(!vis[pair.node]){
                vis[pair.node] = true;
                for(Edge edgeWt : graph[pair.node]){
                    int u = edgeWt.src;
                    int v = edgeWt.des;

                    if(dis[u] + edgeWt.wt < dis[v]){
                        dis[v] = dis[u] + edgeWt.wt;
                        priorityQueue.add(new Pair(v, dis[v]));
                    }
                }
            }
        }
        for(int i : dis ){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        buildGraph(graph);

        dijkestra(graph, v, 0);

    }
}
