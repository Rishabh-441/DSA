package QueueArrayImplementation;

public class Main {
    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);
        q.enQueue(12);
        q.enQueue(23);
        q.enQueue(65);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());

        System.out.println(q.peek());
        System.out.println(q.peek());
    }
}
