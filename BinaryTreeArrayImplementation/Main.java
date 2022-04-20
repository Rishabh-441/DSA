package BinaryTreeArrayImplementation;

public class Main {
    public static void main(String[] args) {
        BinaryTreeArr tree = new BinaryTreeArr(5);
        tree.add("n1");
        tree.add("n2");
        tree.add("n3");
        tree.add("n4");
        tree.add("n5");
        tree.add("n6");

        tree.levelOrder();
        System.out.println();
        tree.preOrder(1);
        System.out.println();
        tree.inOrder(1);
        System.out.println();
        tree.postOrder(1);

        System.out.println();
        System.out.println(tree.search("n4"));

        tree.deleteNode("n3");
        tree.levelOrder();
        tree.deleteTree();
        System.out.println();
        tree.levelOrder();
    }
}
