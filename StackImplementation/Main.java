package StackImplementation;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        s.push(52);
        s.push(48);
        s.push(78);
        s.push(99);
        s.push(332);
        s.push(15);

        System.out.println(s.pop());
        System.out.println(s.pop());

        System.out.println(s.peek());
        System.out.println(s.peek());

        s.deleteStack();
        System.out.println(s.pop());


    }
}
