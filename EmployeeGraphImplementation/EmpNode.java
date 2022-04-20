package EmployeeGraphImplementation;

import java.util.ArrayList;
import java.util.LinkedList;

public class EmpNode {
    private String name;
    private int id;
    private int salary;
    private boolean isVisited;

    ArrayList<EmpNode> neighbours = new ArrayList<>();

    EmpNode (String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(name + "[ id : " + id + " , salary : " + getSalary() + "]"  + " : ");
        for (var node: neighbours) {
            str.append("-->" + node.getName());
        }
        return str.toString();
    }
}
