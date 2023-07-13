import java.util.ArrayList;
import java.util.Formattable;

public class undirectedUnweightedgraphImpli {

    static class Edge {
        int source;
        int dest;

        Edge(int source, int dest) {
            this.source = source;
            this.dest = dest;
        }
    }


    public static void graphImplement(ArrayList<Edge> Graph[]) {

        for (int i = 0; i < Graph.length; i++) {
            Graph[i] = new ArrayList<Edge>();
        }
        Graph[0].add(new Edge(1,2));

        Graph[1].add(new Edge(1,2));
        Graph[1].add(new Edge(1,3));

        Graph[2].add(new Edge(2,0));
        Graph[2].add(new Edge(2,1));
        Graph[2].add(new Edge(2,3));

        Graph[3].add(new Edge(3,1));
        Graph[3].add(new Edge(3,2));
    }

    public static void main(String[] args) {
        int v = 4; //no. of vertx is 4
        ArrayList<Edge>[] Graph = new ArrayList[v];

        graphImplement(Graph);

        //print neighbours of a particular node
        for(int i=0; i<Graph[2].size(); i++){
            Edge e = Graph[2].get(i);
            System.out.print(e.dest+" ");
        }
    }
}
