package LINKEDLISTSPRACTICE;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(12);
        list.insert(23);
        list.insert(33);
        list.show();

        list.insertAtStart(123);
        list.show();

        list.insertAt(3,87);
        list.show();
    }
}
