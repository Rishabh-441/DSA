package Dijkstras_Algorithm_and_BellmanFord_Algorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class WeightedGraph {
    ArrayList<WeightedNode> nodeList = new ArrayList<>();

    public WeightedGraph(ArrayList<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    void dijkstra (WeightedNode node) {
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        node.distance = 0;
        queue.addAll(nodeList);
        while (!queue.isEmpty()) {
            WeightedNode currentNode = queue.remove();
            System.out.println(currentNode);
            for (WeightedNode neighbour : currentNode.neighbours) {
                if (queue.contains(neighbour)) {
                    if (neighbour.distance > currentNode.distance + currentNode.weightMap.get(neighbour)) {
                        neighbour.distance = currentNode.distance + currentNode.weightMap.get(neighbour);
                        neighbour.parent = currentNode;
                        queue.remove(neighbour);
                        queue.add(neighbour);
                    }
                }
            }
        }
        for (WeightedNode nodeToCheck: nodeList) {
            System.out.print("Node " + nodeToCheck + " distance : " + nodeToCheck.distance + " , path : ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }

    public static void pathPrint (WeightedNode node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    public void addWeightedEdge (int i, int j, int d) {
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.neighbours.add(second);
        first.weightMap.put(second, d);
    }


    //Bellman Ford Algorithm:
    public void bellmanFord (WeightedNode source) {
        source.distance = 0;
        for (int i = 0; i < nodeList.size(); i++) {
            for (WeightedNode currentNode : nodeList) {
                for (WeightedNode neighbour : currentNode.neighbours) {
                    if (neighbour.distance > currentNode.distance + currentNode.weightMap.get(neighbour)) {
                        neighbour.distance = currentNode.distance + currentNode.weightMap.get(neighbour);
                        neighbour.parent = currentNode;
                    }
                }
            }
        }
        System.out.println("checking for negative cycle");
        for (WeightedNode currentNode : nodeList) {
            for (WeightedNode neighbour : currentNode.neighbours) {
                if (neighbour.distance > currentNode.distance + currentNode.weightMap.get(neighbour)) {
                    System.out.println("Negative cycle found : \n");
                    System.out.println("Vertex name : " + neighbour.name);
                    System.out.println("old cost : " + neighbour.distance);
                    int newDistance = currentNode.distance + currentNode.weightMap.get(neighbour);
                    System.out.println("new cost : " + newDistance);
                    return;
                }
            }
        }
        System.out.println("negative cycle not found !!");

        for (WeightedNode nodeToCheck: nodeList) {
            System.out.print("Node " + nodeToCheck + " distance : " + nodeToCheck.distance + " , path : ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }

}
