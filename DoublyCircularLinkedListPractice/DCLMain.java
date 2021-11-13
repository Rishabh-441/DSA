package DoublyCircularLinkedListPractice;

public class DCLMain {
    public static void main(String[] args) {
        DCircularLinkedList list = new DCircularLinkedList();
        list.insert(23);
        list.insert(65);
        list.displayDCLL();

        list.insert(222);
        list.insert(98);
        list.displayDCLL();

        System.out.println(list.head.data);
        System.out.println(list.tail.data);

        System.out.println(list.size);

        list.insertAtFirst(334);
        list.displayDCLL();

        list.insertAt(2,998);
        list.displayDCLL();

        list.insertAt(6,884);
        list.displayDCLL();

        list.deleteLast();
        list.displayDCLL();

        list.insert(23,45,99,66,44);
        list.displayDCLL();

        list.deleteAt(3);
        list.displayDCLL();

        list.search(44);
        list.elementAt(5);
        list.search(559);

        list.elementAt(44);

        list.deleteAll();
        list.displayDCLL();
    }
}
