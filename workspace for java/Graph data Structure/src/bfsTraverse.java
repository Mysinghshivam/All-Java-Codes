import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfsTraverse {

    static class Edge {
        int source;
        int destination;

        Edge(int souce, int destination) {
            this.source = souce;
            this.destination = destination;
        }
    }

    public static void graphImplementation(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));

    }

    public static void bfs(ArrayList<Edge> Graph [], int v){
        Queue<Integer> queue = new LinkedList<>();
        boolean [] visited = new boolean[v];
        queue.add(0);

        while (!queue.isEmpty()){
            int curr = queue.remove();
            if (visited[curr] == false){
                System.out.print(curr+" ");
                visited[curr] = true;

                for(int i = 0; i< Graph[curr].size(); i++){
                    Edge e = Graph[curr].get(i);
                    queue.add(e.destination);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] Graph = new ArrayList[v];

        graphImplementation(Graph);

        bfs(Graph, v);
    }
}
