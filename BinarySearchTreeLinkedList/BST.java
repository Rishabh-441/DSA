package BinarySearchTreeLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
    BSTNode root;

    public BST() {
        this.root = null;
    }

    private BSTNode insert(BSTNode node, int val) {
        if (node == null) {
            BSTNode newNode = new BSTNode();
            newNode.value = val;
            return newNode;
        }
        if (val <= node.value) {
            node.left = insert(node.left, val);
        }
        else{
            node.right = insert(node.right, val);
        }
        return node;

    }

//    private void insert(BSTNode node, int val) {
//        if (root == null) {
//            BSTNode newNode = new BSTNode();
//            newNode.value = val;
//            root = newNode;
//            System.out.println(root.value);
//        }
//        else {
//            if (val <= node.value) {
//                if (node.left == null) {
//                    BSTNode newNode = new BSTNode();
//                    newNode.value = val;
//                    node.left = newNode;
//                    return;
//                }
//                insert(node.left, val);
//            } else {
//                if (node.right == null) {
//                    BSTNode newNode = new BSTNode();
//                    newNode.value = val;
//                    node.right = newNode;
//                    return;
//                }
//                insert(node.right, val);
//            }
//        }
//    }

    public void insert(int val) {
        root = insert(root, val);
    }

    public void levelOrder() {
        Queue<BSTNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BSTNode node = queue.remove();
            System.out.print(node.value + " ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    public void preOrder(BSTNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(BSTNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder(BSTNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public void search(int val) {
        BSTNode node = root;
        while (node != null) {
            if (node.value == val) {
                System.out.println("the value " + val + " is found");
                return;
            }
            if (val <= node.value) {
                node = node.left;
            }
            else{
                node = node.right;
            }
        }
        System.out.println("the value " + val + " is not found");
    }

    public BSTNode minNode(BSTNode root) {
        if (root.left == null) {
            return root;
        }
        return minNode(root.left);

    }

    public BSTNode deleteNode(BSTNode root, int val) {
        if (root == null) {
            System.out.println("element not found");
            return null;
        }
        if (val < root.value) {
            root.left = deleteNode(root.left, val);
        }
        else if (val > root.value) {
            root.right = deleteNode(root.right, val);
        }
        else{
            if (root.left != null && root.right != null) {
                BSTNode temp = root;
                BSTNode minRightNode = minNode(temp.right);
                root.value = minRightNode.value;
                root.right = deleteNode(root.right, minRightNode.value);
            }
            else if (root.left != null) {
                root = root.left;
            }
            else if (root.right != null) {
                root = root.right;
            }
            else{
                root = null;
            }
        }
        return root;
    }

    void deleteTree() {
        root = null;
    }
}
