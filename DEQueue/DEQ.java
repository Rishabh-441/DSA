package DEQueue;

public class DEQ {
    Node head;

    public DEQ() {
        head = null;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }
    public void enQueueF(int...data) {
        for (var x: data) {
            enQueueF(x);
        }
    }
    public void enQueueF(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        }
        else {
            Node temp = head;
            head = node;
            node.next = temp;
        }
    }

    public int deQueueF() {
        if (isEmpty()) {
            return -1;
        }
        else {
            int op = head.data;
            head = head.next;
            return op;
        }
    }

    public void enQueueB(int...data) {
        for (var x: data) {
            enQueueB(x);
        }
    }

    public void enQueueB(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public int deQueueB() {
        if (isEmpty()) {
            return -1;
        }
        else if (head.next == null) {
            int op = head.data;
            head = null;
            return op;
        }
        else{
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            int op = temp.next.data;
            temp.next = null;
            return op;
        }
    }

    public void display() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }


}
