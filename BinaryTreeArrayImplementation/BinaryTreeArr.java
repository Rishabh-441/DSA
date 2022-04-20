package BinaryTreeArrayImplementation;

public class BinaryTreeArr {
    String[] arr;
    int lastIndex;

    public BinaryTreeArr(int size) {
        arr = new String[size + 1];
        lastIndex = 0;
        System.out.println("Tree is created!");
    }

    public boolean isFull() {
        if (arr.length - 1 == lastIndex) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (lastIndex == 0) {
            return true;
        }
        return false;
    }

    public void add(String val) {
        if (!isFull()) {
            arr[lastIndex + 1] = val;
            lastIndex++;
        }
        else{
            System.out.println("Tree is full!");
        }
    }

    public void levelOrder() {
        if (isEmpty()) {
            System.out.println("tree is empty!");
            return;
        }
        for (int i = 1; i <= lastIndex ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void preOrder(int index) {
        if (index > lastIndex) {
            return;
        }
        System.out.print(arr[index] + " ");
        preOrder(2 * index);
        preOrder(2 * index + 1);
    }

    public void inOrder(int index) {
        if (index > lastIndex) {
            return;
        }
        inOrder(2 * index);
        System.out.print(arr[index] + " ");
        inOrder(2 * index + 1);
    }

    public void postOrder(int index) {
        if (index > lastIndex) {
            return;
        }
        postOrder(2 * index);
        postOrder(2 * index + 1);
        System.out.print(arr[index] + " ");
    }

    public int search(String val) {
        for (int i = 1; i <= lastIndex ; i++) {
            if (arr[i].equals(val)) {
                return i;
            }
        }
        return -1;
    }

    public void deleteNode(String val) {
        int ind = search(val);
        if (ind == -1) {
            return;
        }
        arr[ind] = arr[lastIndex];
        lastIndex--;
        System.out.println("Node successfully deleted!");
    }

    public void deleteTree() {
        arr = null;
        lastIndex = 0;
    }
}
