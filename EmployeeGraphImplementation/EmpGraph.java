package EmployeeGraphImplementation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class EmpGraph {
    ArrayList<EmpNode> nodeList;

    EmpGraph(ArrayList<EmpNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addNeighbours(int i, int j) {
        nodeList.get(i).neighbours.add(nodeList.get(j));
        nodeList.get(j).neighbours.add(nodeList.get(i));
    }

    //bfs internal:
    private void bfsVisit(EmpNode node) {
        Queue<EmpNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            EmpNode emp = queue.remove();
            emp.setVisited(true);
            System.out.println(emp);
            ArrayList<EmpNode> EmpList = node.neighbours;
            for (var x: EmpList) {
                if (!x.isVisited()) {
                    queue.add(x);
                    x.setVisited(true);
                }
            }
        }
    }

    public void bfs() {
        for (var node: nodeList) {
            if (!node.isVisited()) {
                bfsVisit(node);
            }
        }
        for (var x: nodeList) {
            x.setVisited(false);
        }
    }
}
