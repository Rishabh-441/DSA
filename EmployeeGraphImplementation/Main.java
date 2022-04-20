package EmployeeGraphImplementation;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<EmpNode> nodeList = new ArrayList<>();
        nodeList.add(new EmpNode("Ram", 1234, 10_000));
        nodeList.add(new EmpNode("Shyam", 2345, 20_000));
        nodeList.add(new EmpNode("Rishabh", 3456, 30_000));
        nodeList.add(new EmpNode("Amam", 4567, 40_000));
        nodeList.add(new EmpNode("Deepak", 5678, 50_000));
        nodeList.add(new EmpNode("Sarthak", 6789, 60_000));

//        for (var x: nodeList) {
//            System.out.println(x);
//        }
        EmpGraph g = new EmpGraph(nodeList);
        g.addNeighbours(0,1);
        g.addNeighbours(1,2);
        g.addNeighbours(2,4);
        g.addNeighbours(0,4);
        g.addNeighbours(2,5);
        g.addNeighbours(3,5);

//        for (var x: nodeList) {
//            System.out.println(x);
//        }
        g.bfs();


    }
}
