package CircularQueueArrayImplementation;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enQueue(45);
        q.enQueue(56);
        q.enQueue(89);
        q.enQueue(85);
        q.enQueue(125);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        q.enQueue(98);
        q.enQueue(1244);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }
}
