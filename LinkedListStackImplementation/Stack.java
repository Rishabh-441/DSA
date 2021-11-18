package LinkedListStackImplementation;


import LINKEDLISTSPRACTICE.LinkedList;
import LINKEDLISTSPRACTICE.Node;

public class Stack {
    public LinkedList ll;
    public int topOfStack;

    public Stack(){
        ll = new LinkedList();
        topOfStack = -1;
    }
    //isEmpty method:
    public boolean isEmpty(){
        if (topOfStack == -1){
            return true;
        }
        return false;
    }
    //push method:
    public void push(int data){
        Node node = new Node();
        node.data = data;
        if (ll.head==null){
            node.next = null;
        }
        else{
            node.next = ll.head;
        }
        ll.head = node;
        topOfStack = ll.head.data;
        topOfStack ++;
    }

    //pop method:
    public void pop(){
        if (topOfStack == -1){
            System.out.println("Empty stack!");
            return;
        }
        int x = ll.head.data;
        Node n = ll.head.next;
        ll.head.next = null;
        ll.head = n;
        System.out.println(x);
        if (ll.head == null){
            topOfStack = -1;
        }
        else {
            topOfStack = ll.head.data;
        }
        topOfStack--;
    }

    //peek method:
    public void peek(){
        if (topOfStack == -1){
            System.out.println("Empty stack!");
        }
        else{
            System.out.println(ll.head.data);
        }
    }

    //delete method:
    public void delete(){
        ll.head = null;
        topOfStack = -1;
    }
}
