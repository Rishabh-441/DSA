package DEQueue;

public class Main {
    public static void main(String[] args) {
        DEQ queue = new DEQ();
        queue.enQueueF(10,20,30,40,50);
        queue.enQueueB(60,70,80,90);
        queue.display();
    }
}
