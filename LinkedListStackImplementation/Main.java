package LinkedListStackImplementation;

public class Main {
    public static void main(String[] args) {
        Stack sc = new Stack();
        sc.push(54);
        sc.push(99);
        sc.push(63);
        sc.push(125);
        sc.pop();
        sc.pop();
        sc.pop();
//        System.out.println(sc.size);
        sc.pop();
        sc.pop();
        sc.pop();
        sc.push(885);
        sc.pop();
//        System.out.println(sc.size);
        System.out.println(sc.topOfStack);
        sc.peek();
    }
}
