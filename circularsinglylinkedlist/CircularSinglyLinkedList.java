package circularsinglylinkedlist;

public class CircularSinglyLinkedList {
    Node head;
    Node tail;
    int size = 0;

    public void insert(int...data){
        for (var i: data) {
            insert(i);
        }
    }
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        if (head == null){
            head = node;
            head.next = head;
            tail = head;
        }
        else{
            Node n = head;
            while(n.next != head){
                n = n.next;
            }
            n.next = node;
            node.next = head;
            tail = node;
        }
        size++;
    }

    public void insertAtFirst(int data){
        Node node = new Node();
        if (size == 0){
            insert(data);
        }
        else{
            node.data = data;
            node.next = head;
            Node n = head;
            while(n.next != head){
                n = n.next;
            }
            n.next = node;
            head = node;
            size++;
        }
    }

    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        Node n = head;
        if (index > size){
            System.out.println("insertion not possible");
        }
        else if (index == 0){
            insertAtFirst(data);
        }
        else if(index == size) insert(data);
        else{
            for (int i = 0; i < index-1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
            size++;
        }
    }

    public void displayCSLL(){
        try{
            Node n = head;
            while (n.next != head){
                System.out.print(n.data + "-->");
                n = n.next;
            }
            System.out.println(n.data);
        }
        catch (NullPointerException e){
            System.out.println("EMPTY");
        }

    }

    public void deleteAll(){
        head = null;
        tail = null;
        size = 0;
    }

    public void deleteAt(int index){
        if (index >= size){
            System.out.println("deletion at this index is not possible");
            return;
        }
        else if (index == 0){
            head = head.next;
            tail.next = head;
        }
        else if (index == size-1){
            Node n = head;
            for (int i = 0; i < size-2; i++){
                n = n.next;
            }
            n.next = head;
            tail = n;
        }
        else{
            Node n = head;
            for(int i = 0; i < index-1;i++){
                n = n.next;
            }
            n.next = n.next.next;
        }
        size--;
    }

    public void deleteFirst(){
        deleteAt(0);
    }

    public void deleteLast() {
        deleteAt(size - 1);
    }
}
