package Graphs.AdjList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode(0, "A"));
        nodeList.add(new GraphNode(1, "B"));
        nodeList.add(new GraphNode(2, "C"));
        nodeList.add(new GraphNode(3, "D"));
        nodeList.add(new GraphNode(4, "E"));

        Graph g = new Graph(nodeList);
        g.addUndirectedEdge(0, 1);
        g.addUndirectedEdge(0, 2);
        g.addUndirectedEdge(0, 3);
        g.addUndirectedEdge(2, 3);
        g.addUndirectedEdge(3, 4);
        g.addUndirectedEdge(1, 4);

        System.out.println(g);

        g.bfs();
        System.out.println();
        g.dfs();
        System.out.println();
        g.SSSP(nodeList.get(2));
        System.out.println();

    }
}
