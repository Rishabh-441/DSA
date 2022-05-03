package DisjointSetPackage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedNode("A", 0));
        nodeList.add(new WeightedNode("B", 1));
        nodeList.add(new WeightedNode("C", 2));
        nodeList.add(new WeightedNode("D", 3));

        DisjointSet.makeList(nodeList);
        WeightedNode firstNode = nodeList.get(0);
        WeightedNode secondNode = nodeList.get(1);
        DisjointSet output = DisjointSet.findSet(secondNode);
        output.printAllNodesOfThisSet();

        DisjointSet.union(firstNode, secondNode);
        output = DisjointSet.findSet(firstNode);
        output.printAllNodesOfThisSet();
    }
}
