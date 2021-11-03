package LINKEDLISTSPRACTICE;

public class LinkedList {
    Node head;
    int size = 0;

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
        size ++;
    }

    //  displaying all the elements
    public void show(){
        try{
            Node node = head;
            while(node.next != null){
                System.out.print(node.data + "--->");
                node = node.next;
            }
            System.out.println(node.data);
        }
        catch (NullPointerException e){
            System.out.println("No element found");
        }
    }

    //  inserting element at the starting
    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        node.next = head;
        head = node;

        size ++;
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
            try{
                Node n = head;
                for (int i = 0; i < index-1; i++) {
                    n = n.next;
                }
                node.next = n.next;
                n.next = node;

                size ++;
            }
            catch (NullPointerException e){
                System.out.println("can't insert any value at this position");
            }
        }

    }

}
