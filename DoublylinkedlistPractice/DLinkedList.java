package DoublylinkedlistPractice;

public class DLinkedList {
    Node head;
    Node tail;
    int size = 0;

    //insertion of element
   public void insert(int data){
       Node node = new Node();
       node.data = data;
       if (head == null){
           head = node;
           head.prev = null;
           head.next = null;
           tail = head;
       }
       else{
           Node n = head;
           while (n.next != null){
               n = n.next;
           }
           node.next = null;
           node.prev = n;
           n.next = node;
           tail = node;
       }
       size ++;
   }

   //insertion at first position
   public void insertAtFirst(int data){
       if (head == null){
           insert(data);
       }
       else{
           Node node = new Node();
           node.data = data;
           node.next = head;
           node.prev = null;
           head = node;
       }
       size++;
   }

   //inserting at a particular position
    public void insertAt(int index , int data){
        if (head == null || index == size){
            insert(data);
        }
        else if(index == 0){
            insertAtFirst(data);
        }
        else if (index > size){
            System.out.println("INSERTION NOT POSSIBLE");
            return;
        }
        else{
            Node node = new Node();
            node.data = data;
            Node n = head;
            for (int i = 0; i < index-1; i++){
                n = n.next;
            }
            node.next = n.next;
            node.prev = n;
            n.next = node;
            node.next.prev = node;
        }
        size ++;
    }

   //inserting many elements
    public void insert(int...data){
        for (var i: data) {
            insert(i);
        }
    }

    //displaying all elements
    public void displayDLL(){
        if (size > 0){
            Node n = head;
            while(n.next != null){
                System.out.print(n.data + "-->");
                n = n.next;
            }
            System.out.println(n.data);
        }
        else {
            System.out.println("EMPTY");
        }
    }

    //deleting first element
    public void deleteFirst(){
        head.next.prev = null;
        head = head.next;
        size --;
    }

    //deleting last element
    public void deleteLast(){
        if (head == null){
            System.out.println("DELETION NOT POSSIBLE");
            return;
        }
        tail.prev.next = null;
        tail = tail.prev;
        size--;
    }

    //deleting element at particular position
    public void deleteAt(int index){
       if (head == null){
           System.out.println("DELETION NOT POSSIBLE");
           return;
       }
       else if (index == 0){
           deleteFirst();
       }
       else if (index == size-1){
           deleteLast();
       }
       else if (index >= size){
           System.out.println("DELETION NOT POSSIBLE");
           return;
       }
       else{
           Node n = head;
           for (int i = 0 ; i < index-1; i++){
               n = n.next;
           }
           n.next = n.next.next;
           n.next.next.prev = n;
           size--;
       }
    }

    //delete all elements
    public void deleteAll(){
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
