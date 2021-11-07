package DoublylinkedlistPractice;

public class DLLMain {
    public static void main(String[] args) {
        DLinkedList list = new DLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.displayDLL();
        System.out.println(list.head.data + " " + list.tail.data);

        list.insertAtFirst(343);
        list.insertAtFirst(778);
        list.displayDLL();

        list.insertAt(3,567);
        list.displayDLL();
        list.insertAt(5,9988);
        list.displayDLL();
        list.insertAt(0,1123);
        list.displayDLL();
        list.insertAt(list.size, 65);
        list.displayDLL();


        list.deleteLast();
        list.displayDLL();
        System.out.println(list.head.data + " " + list.tail.data);
        list.deleteFirst();
        list.displayDLL();
        System.out.println(list.head.data + " " + list.tail.data);


        list.deleteAt(3);
        list.displayDLL();
        System.out.println(list.head.data + " " + list.tail.data);


        list.deleteAll();
        list.displayDLL();

        list.insert(12,34,5,6,7,87,54,32,45,6,543);
        list.displayDLL();
        System.out.println(list.head.data + " " + list.tail.data);
    }
}
