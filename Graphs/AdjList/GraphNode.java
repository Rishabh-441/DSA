package Graphs.AdjList;

import java.util.ArrayList;

public class GraphNode {
    String name;
    int index;
    boolean isVisited;
    public GraphNode parent;
    ArrayList<GraphNode> neighbours = new ArrayList<>();

    public GraphNode(int index, String name) {
        this.name = name;
        this.index = index;
        this.isVisited = false;
    }
}
