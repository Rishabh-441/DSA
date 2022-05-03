package Graphs.AdjList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<>();

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addUndirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbours.add(second);
        second.neighbours.add(first);
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < nodeList.size(); i++) {
            str.append(nodeList.get(i).name + ": ");
            int j = 0;
            for (j = 0; j < nodeList.get(i).neighbours.size()-1; j++) {
                str.append(nodeList.get(i).neighbours.get(j).name + "-->");
            }
            if (nodeList.get(i).neighbours.size() == 0) {
                str.append("\n");
            }
            else
                str.append(nodeList.get(i).neighbours.get(j).name + "\n");
        }
        return str.toString();
    }

    //BFS internal
    void bfsVisit (GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode  currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            for (GraphNode neighbour : currentNode.neighbours) {
                if (!neighbour.isVisited) {
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                }
            }
        }
    }
    void  bfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                bfsVisit(node);
            }
        }
        for (GraphNode node: nodeList) {
            node.isVisited = false;
        }
    }

    //dfs internal
    void dfsVisit(GraphNode node) {
        Stack<GraphNode> stack  = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()) {
            GraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name  + " ");
            for (GraphNode neighbour: currentNode.neighbours) {
                if (!neighbour.isVisited) {
                    stack.push(neighbour);
                    neighbour.isVisited = true;
                }
            }
        }
    }

    void dfs() {
        for (GraphNode node: nodeList) {
            if (!node.isVisited) {
                dfsVisit(node);
            }
        }
        for (GraphNode node: nodeList) {
            node.isVisited = false;
        }
    }

    //topological sort:
    public void addDirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbours.add(second);
    }

    void topologicalVisit(GraphNode node, Stack<GraphNode> stack) {
        for (GraphNode neighbour: node.neighbours) {
            if (!neighbour.isVisited) {
                topologicalVisit(neighbour, stack);
            }
        }
        node.isVisited = true;
        stack.push(node);
    }

    void topologicalSort() {
        Stack<GraphNode> stack = new Stack<>();
        for (GraphNode node: nodeList) {
            if (!node.isVisited) {
                topologicalVisit(node, stack);
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop().name + " ");
        }
        for (GraphNode node: nodeList) {
            node.isVisited = false;
        }
    }

    public static void pathPrint(GraphNode node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    public void SSSP (GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print("Printing path for node "+ currentNode.name + ": ");
            pathPrint(currentNode);
            System.out.println();
            for (var neighbour: currentNode.neighbours) {
                if (!neighbour.isVisited) {
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                    neighbour.parent = currentNode;
                }
            }
        }
    }
}



















