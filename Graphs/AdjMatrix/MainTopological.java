package Graphs.AdjMatrix;

import Graphs.AdjMatrix.Graph;
import Graphs.AdjMatrix.GraphNode;

import java.util.ArrayList;

public class MainTopological {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode(0, "A"));
        nodeList.add(new GraphNode(1, "B"));
        nodeList.add(new GraphNode(2, "C"));
        nodeList.add(new GraphNode(3, "D"));
        nodeList.add(new GraphNode(4, "E"));
        nodeList.add(new GraphNode(5, "F"));
        nodeList.add(new GraphNode(6, "G"));
        nodeList.add(new GraphNode(7, "H"));
        for (var node: nodeList) {
            System.out.println(node.name);
        }
        Graph g = new Graph(nodeList);
        g.addDirectedEdge(0,2);
        g.addDirectedEdge(2,4);
        g.addDirectedEdge(4,7);
        g.addDirectedEdge(4,5);
        g.addDirectedEdge(5,6);
        g.addDirectedEdge(1,2);
        g.addDirectedEdge(1,3);
        g.addDirectedEdge(3,5);

        System.out.println(g);
        g.topologicalSort();
    }
}
