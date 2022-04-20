package AVLTrees;

public class Main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        int[] arr = {100,90,80,70,60,50,40,30,20,10};
        for (var x: arr) {
            tree.root = tree.insert(tree.root, x);
        }
        tree.preOrder(tree.root);

    }
}
