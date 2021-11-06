package circularsinglylinkedlist;

import java.util.Scanner;

public class CSLLMain {
    public static void main(String[] args) {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.displayCSLL();
        System.out.println(list.size);
        System.out.println(list.tail.data);
        System.out.println(list.head.data);

        list.deleteAt(2);
        list.displayCSLL();
        System.out.println(list.tail.data);
        System.out.println(list.head.data);

        list.insertAt(4,45);
        System.out.println(list.size);
        list.displayCSLL();

        list.insertAt(3,54);
        list.displayCSLL();
        System.out.println(list.tail.data);

        list.deleteAll();
        System.out.println(list.size);
        list.displayCSLL();

        list.insert(1);
        list.insert(2);
        list.insert(23,34,5,6,7,8,9);
        list.displayCSLL();

        list.insertAt(4,543);
        list.displayCSLL();

        list.deleteAt(0);
        list.displayCSLL();
        System.out.println(list.head.data +" "+ list.tail.data);

        list.deleteFirst();
        list.displayCSLL();
        System.out.println(list.head.data +" "+ list.tail.data);


        list.deleteLast();
        list.displayCSLL();
        System.out.println(list.head.data +" "+ list.tail.data);

    }

}
