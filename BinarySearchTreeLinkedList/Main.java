package BinarySearchTreeLinkedList;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(70);
        tree.insert(60);
        tree.insert(90);
        tree.insert(50);
        tree.insert(80);
        tree.insert(65);
        tree.insert(95);

        System.out.println(tree.root == null);

        tree.levelOrder();
        System.out.println();
        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);

        System.out.println();
        tree.search(56);
        tree.search(65);

        tree.deleteNode(tree.root, 80);
        tree.levelOrder();
    }
}
