package Graphs.AdjMatrix;

public class GraphNode {
    String name;
    int index;
    boolean isVisited;
    GraphNode parent;

    public GraphNode(int index, String name) {
        this.name = name;
        this.index = index;
    }
}
