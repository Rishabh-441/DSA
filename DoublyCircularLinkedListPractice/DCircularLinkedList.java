package DoublyCircularLinkedListPractice;

public class DCircularLinkedList {
    Node head;
    Node tail;
    int size = 0;

    //inserting single element
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        if (head == null){
            node.next = node;
            node.prev = node;
            head = node;
            tail = node;
        }
        else {
            Node n = head;
            while(n.next != head){
                n = n.next;
            }
            n.next = node;
            node.prev = n;
            node.next = head;
            tail = node;
            head.prev = tail;
            tail.next = head;
        }
        size ++;
    }

    //inserting multiple elements
    public void insert(int...data){
        for (var i: data) {
            insert(i);
        }
    }

    //displaying all elements
    public void displayDCLL(){
        if (size == 0){
            emptyList();
            return;
        }
        Node n = head;
        for (int i = 0; i < size; i++,n = n.next){
            System.out.print(n.data + " ");
        }
        System.out.println();
    }

    //inserting element at first position
    public void insertAtFirst(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        node.prev = tail;
        head.prev = node;
        head = node;
        tail.next = head;
        size++;
    }

    //inserting element at particular position
    public void insertAt(int index, int data){
        if (index > size){
            System.out.println("insertion at this position is not possible");
        }
        else if (index == 0){
            insertAtFirst(data);
        }
        else if (index >= size){
            insert(data);
        }
        else{
            Node node = new Node();
            node.data = data;
            Node n = head;
            for (int i = 0; i < index-1; i++,n = n.next);
            n.next.prev = node;
            node.prev = n;
            node.next = n.next;
            n.next = node;
            size++;
        }
    }

    //empty list message
    public static void emptyList(){
        System.out.println("EMPTY LIST");
    }

    //deletion of last element
    public void deleteLast(){
        if (size == 0){
            emptyList();
            return;
        }
        if (size == 1){
            head = null;
            tail = null;
        }
        else{
            tail.prev.next = head;
            head.prev = tail.prev;
            tail = tail.prev;
        }
        size--;
    }

    //deletion of first element
    public void deleteFirst(){
        if (size == 0){
            emptyList();
            return;
        }
        if (size == 1){
            head = null;
            tail = null;
        }
        else{
            tail.next = head.next;
            head.next.prev = tail;
            head = head.next;
        }
        size--;
    }

    //deletion of a particular element
    public void deleteAt(int index){
        if (index >= size){
            System.out.println("deletion not possible");
            return;
        }
        if (index == 0){
            deleteFirst();
        }
        else if (index == size-1){
            deleteLast();
        }
        else{
            Node n = head;
            for(int i = 0; i < index-1; i++,n = n.next);
            n.next = n.next.next;
            n.next.next.prev = n;
        }
        size--;
    }

    //searching for element
    public void search(int data){
        Node n = head;
        for (int i = 0; i < size; i++,n = n.next){
            if (n.data == data){
                System.out.println("element found at Index : " + i);
                return;
            }
        }
        System.out.println("Element not found!");
    }

    //finding element at particular index
    public void elementAt(int index){
        if (index >= size){
            System.out.println("NO ELEMENT INITIALIZED AT THIS INDEX");
            return;
        }
        Node n = head;
        for (int i = 0; i < index-1; i++,n = n.next);
        System.out.println(n.data);
    }

    //deleting the entire list
    public void deleteAll(){
        tail.next = null;
        head.prev = null;
        Node n = head;
        while(n.next != null){
            n.prev = null;
            n = n.next;
        }
        head = null;
        tail = null;
        size = 0;
    }
}
