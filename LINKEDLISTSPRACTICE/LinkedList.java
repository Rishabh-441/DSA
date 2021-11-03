package LINKEDLISTSPRACTICE;

public class LinkedList {
    Node head;

    //  inserting element at the end
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null){
            head = node;
        }
        else {
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    //  displaying all the elements
    public void show(){
        Node node = head;
        while(node.next != null){
            System.out.print(node.data + "--->");
            node = node.next;
        }
        System.out.println(node.data);
    }

    //  inserting element at the starting
    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        node.next = head;
        head = node;
    }

    //  inserting element at any position
    public void insertAt(int index , int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0){
            insertAtStart(data);
        }
        else{
            Node n = head;
            for (int i = 0; i < index-1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

}
