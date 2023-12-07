import java.util.ArrayList;

public class graphQuestion {

    public static class Edge {
        int src;
        int des;

        Edge(int src, int des) {
            this.src = src;
            this.des = des;
        }
    }

    public static void buildGraph(ArrayList<Edge> Graph[]) {
        for (int i = 0; i < Graph.length; i++) {
            Graph[i] = new ArrayList<Edge>();
        }

        Graph[0].add(new Edge(0,1));
        Graph[0].add(new Edge(0,2));

        Graph[1].add(new Edge(1,0));
        Graph[1].add(new Edge(1,3));

        Graph[2].add(new Edge(2,0));
        Graph[2].add(new Edge(2,4));

        Graph[3].add(new Edge(3,1));
        Graph[3].add(new Edge(3,4));
        Graph[3].add(new Edge(3,5));

        Graph[4].add(new Edge(4,2));
        Graph[4].add(new Edge(4,3));
        Graph[4].add(new Edge(4,5));

        Graph[5].add(new Edge(5,3));
        Graph[5].add(new Edge(5,4));
        Graph[5].add(new Edge(5,6));

        Graph[6].add(new Edge(6,5));

    }

    public static void printPath(ArrayList<Edge> [] Graph, boolean vis[],int curr, String path, int tar){

        if(curr == tar){
            System.out.println(path);
            return;
        }
        for(int i = 0; i<Graph[curr].size(); i++){
            Edge e = Graph[curr].get(i);
            if (vis[e.des] == false){
                vis[curr] = true;
                printPath(Graph, vis, e.des, path+e.des, tar);
                vis[curr] = false;
            }
        }
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>  [] Graph = new ArrayList[v];

        buildGraph(Graph);
        int src = 0, tar = 5;
        printPath(Graph, new boolean [v], 0, "0", 5);

//        for (int i=0; i<Graph[5].size(); i++){
//            Edge e = Graph[5].get(i);
//            System.out.print(e.des + " ");
//        }

    }
}
