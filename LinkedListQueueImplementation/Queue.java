package LinkedListQueueImplementation;
import LINKEDLISTSPRACTICE.LinkedList;
import LINKEDLISTSPRACTICE.Node;

public class Queue {
    LinkedList l;
    int size;

    //constructor:
    public Queue(){
        l = new LinkedList();
        size = 0;
    }

    // isEmpty method:
    public boolean isEmpty(){
        if(l.head == null){
            return true;
        }
        return false;
    }
    //insertion in queue:
    public void enQueue(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (l.head == null){
            l.head = node;
        }
        else{
            Node n = l.head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
        size ++;
    }

    //traversal through the queue:
    public void display(){
        Node n = l.head;
        while(n.next != null){
            System.out.print(n.data + "<--");
            n = n.next;
        }
        System.out.println(n.data);
    }

    //pop method:
    public int deQueue(){
        if (l.head == null){
            System.out.println("EMPTY QUEUE!");
            return -1;
        }
        else{
            int x = l.head.data;
            l.head = l.head.next;
            size--;
            return x;
        }
    }

    //peek method:
    public int peek(){
        if (l.head == null){
            System.out.println("EMPTY QUEUE!");
            return -1;
        }
        else{
            return l.head.data;
        }
    }

    //delete queue:
    public void delete(){
        l.head = null;
        size = 0;
    }
}
