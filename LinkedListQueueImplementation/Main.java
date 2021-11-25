package LinkedListQueueImplementation;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(12);
        q.display();
        q.enQueue(23);
        q.enQueue(54);
        q.enQueue(98);
        q.display();
        System.out.println(q.deQueue());
        System.out.println(q.peek());
        q.display();
        System.out.println(q.deQueue());
        System.out.println(q.isEmpty());
        q.delete();
        System.out.println(q.isEmpty());
    }
}
