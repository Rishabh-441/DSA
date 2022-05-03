package Graphs.AdjMatrix;

import Graphs.AdjMatrix.Graph;
import Graphs.AdjMatrix.GraphNode;

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
        g.addUndirectedNode(0, 1);
        g.addUndirectedNode(0, 2);
        g.addUndirectedNode(0, 3);
        g.addUndirectedNode(2, 3);
        g.addUndirectedNode(3, 4);
        g.addUndirectedNode(1, 4);

        System.out.println(g.toString());

        g.bfs();
        System.out.println();
        g.dfs();
        System.out.println();
        g.SSSP(nodeList.get(0));
        System.out.println();
//        Graph.pathPrint(nodeList.get(1));

    }
}
