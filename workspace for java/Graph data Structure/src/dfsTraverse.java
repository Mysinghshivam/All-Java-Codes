import java.util.ArrayList;

public class dfsTraverse {

    static class Edge {
        int source;
        int desti;

        Edge(int source, int desti) {
            this.source = source;
            this.desti = desti;
        }
    }

    static void graph(ArrayList<Edge>[] graph, int v) {
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void dfs(ArrayList<Edge> [] Graph, int curr, boolean vis[]) {
        System.out.print(curr + " ");
        vis[curr] = true;
        for (int i=0; i<Graph[curr].size(); i++){
            Edge e = Graph[curr].get(i);
            if (vis[e.desti] == false){
                dfs(Graph, e.desti, vis);
            }
        }
    }

    //find all paths
    public static void findAllPaths(ArrayList<Edge> [] graph, boolean [] vis, int curr, String path, int tar){
        if (curr == tar){
            System.out.println(path);
            return;
        }
        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(vis[e.desti] == false){
                vis[curr] = true;
                findAllPaths(graph, vis, e.desti,path+e.desti, 5);
                vis[curr] = false;
            }

        }

    }
    public static void main(String[] args) {
        int v = 7;

        ArrayList<Edge>[] graph = new ArrayList[v];
        graph(graph, v);

        boolean [] vis = new boolean[v];
        for (int i=0; i<v; i++){
            if (vis[i] == false){
                dfs(graph,i, vis);
            }
        }

        //findAllPaths(graph, new boolean[v], 0, "0", 5);

    }
}
