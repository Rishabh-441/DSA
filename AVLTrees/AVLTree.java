package AVLTrees;

public class AVLTree {
    public Node root;

    public AVLTree() {
        super();
    }
    public AVLTree(Node root) {
        this.root = root;
    }

    public int height(Node node) {
        if (node == null) {
            return 0;
        }

        return node.height;
    }

    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public Node rightRotate (Node imbalancedNode) {
        Node newRoot = imbalancedNode.left;
        imbalancedNode.left = newRoot.right;

        newRoot.right = imbalancedNode;

        imbalancedNode.height = max(height(imbalancedNode.left), height(imbalancedNode.right)) + 1;
        newRoot.height = max(height(newRoot.left), height(newRoot.right)) + 1;

        return newRoot;
    }

    public Node leftRotate (Node imbalancedNode) {
        Node newRoot = imbalancedNode.right;
        imbalancedNode.right = newRoot.left;

        newRoot.left = imbalancedNode;

        imbalancedNode.height = max(height(imbalancedNode.left), height(imbalancedNode.right)) + 1;
        newRoot.height = max(height(newRoot.left), height(newRoot.right)) + 1;

        return newRoot;
    }

    public int getBalance (Node node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    public Node insert (Node node, int val) {
        //perform normal BST insertion:
        if (node == null) {
            return new Node(val);
        }

        if (val < node.val) {
            node.left = insert(node.left, val);
        }
        else if (val > node.val) {
            node.right = insert(node.right, val);
        }
        else {
            return node;
        }

        node.height = 1 + max(height(node.left), height(node.right)) ;

        int balance = getBalance(node);

        if (balance > 1 && val < node.left.val) {
            return rightRotate(node);
        }

        if (balance < -1 && val > node.right.val) {
            return leftRotate(node);
        }

        if (balance > 1 && val > node.left.val) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && val < node.right.val) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void preOrder (Node node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
}
