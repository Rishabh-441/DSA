package Graphs.AdjMatrix;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    ArrayList<GraphNode> nodeList;
    int[][] adjacencyMatrix;

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
        this.adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedNode(int i, int j) {
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("   ");
        for (int i = 0; i < nodeList.size(); i++) {
            str.append(nodeList.get(i).name + " ");
        }
        str.append("\n");

        for (int i = 0; i < nodeList.size(); i++) {
            str.append(nodeList.get(i).name + ": ");
            for (int j = 0; j < nodeList.size(); j++) {
                str.append(adjacencyMatrix[i][j] + " ");
            }
            str.append("\n");
        }
        return str.toString();
    }

    //get neighbours:
    public ArrayList<GraphNode> getNeighbours(GraphNode node) {
        ArrayList<GraphNode> neighbours = new ArrayList<>();
        int nodeIndex = node.index;
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if (adjacencyMatrix[nodeIndex][i] == 1) {
                neighbours.add(nodeList.get(i));
            }
        }
        return neighbours;
    }

    //bfs internal:
    void bfsVisit(GraphNode node) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove();
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<GraphNode> neighbours = getNeighbours(currentNode);
            for (GraphNode neighbour: neighbours) {
                if (!neighbour.isVisited) {
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                }
            }
        }
    }

    public void bfs() {
        for (var node : nodeList) {
            if (!node.isVisited) {
                bfsVisit(node);
            }
        }
        for (GraphNode node: nodeList) {
            node.isVisited = false;
        }
    }

    void dfsVisit(GraphNode node) {
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            GraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<GraphNode> neighbours = getNeighbours(currentNode);
            for (GraphNode neighbour: neighbours) {
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
        adjacencyMatrix[i][j] = 1;
    }

    void topologicalVisit(GraphNode node, Stack<GraphNode> stack) {
        ArrayList<GraphNode> neighbours = getNeighbours(node);
        for (GraphNode neighbour: neighbours) {
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
    }

    //SSSP:
    public static void pathPrint(GraphNode node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    public void SSSP (GraphNode node) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.poll();
            currentNode.isVisited = true;
            System.out.print("Printing path for node " + currentNode.name + " : ");
            pathPrint(currentNode);
            System.out.println();
            ArrayList<GraphNode> neighbours = getNeighbours(currentNode);
//            System.out.println(neighbours);
            for (var neighbour: neighbours) {
                if (!neighbour.isVisited) {
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                    neighbour.parent = currentNode;
                }
            }
        }
    }


















}
