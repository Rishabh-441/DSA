package LINKEDLISTSPRACTICE;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(12);
        list.insert(23);
        list.insert(33);
        list.show();
        System.out.println(list.size);


        list.insertAtStart(123);
        list.show();
        System.out.println(list.size);


        list.insertAt(3,87);
        list.show();
        System.out.println(list.size);

        list.insertAt(1,34);
        System.out.println(list.size);
        list.show();

        list.insert(34);
        list.insertAtStart(434);
        System.out.println(list.size);
        list.show();
        System.out.println(list.size);

        list.deleteLast();
        list.show();
        System.out.println(list.size);

        list.deleteFirst();
        list.show();
        System.out.println(list.size);

        list.insert(3456);
        list.show();

        list.deleteAt(2);
        list.show();
        System.out.println(list.size);
    }
}
