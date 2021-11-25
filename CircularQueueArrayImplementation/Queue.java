package CircularQueueArrayImplementation;

public class Queue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    public Queue(int size){
        this.arr = new int[size];
        topOfQueue = -1;
        beginningOfQueue = -1;
        this.size = size;
    }

    //isFull method:
    public boolean isFull(){
        if ((beginningOfQueue == 0 && topOfQueue == size-1) || (beginningOfQueue == topOfQueue+1)){
            return true;
        }
        return false;

    }

    //isEmpty method:
    public boolean isEmpty(){
        if (topOfQueue == -1){
            return true;
        }
        return false;
    }

    //enQueue method:
    public void enQueue(int data){
        if (isFull()){
            System.out.println("Queue is full!");
        }
        else if (isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[beginningOfQueue] = data;
        }
        else{
            if (topOfQueue+1 == size){
                topOfQueue = 0;
            }
            else topOfQueue++;
            arr[topOfQueue] = data;
        }
    }

    //deQueue method:
    public int deQueue(){
        if (isEmpty()){
            System.out.println("Queue is Empty!");
            return -1;
        }
        else{
            int x = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if (topOfQueue == beginningOfQueue){
                topOfQueue = beginningOfQueue = -1;
            }
            else if (beginningOfQueue == size-1){
                beginningOfQueue = 0;
            }
            else{
                beginningOfQueue++;
            }
            return x;
        }
    }

    //peek method:
    public int peek(){
        if (isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }
        else{
            return arr[beginningOfQueue];
        }
    }

    //delete method:
    public void delete(){
        arr = null;
        topOfQueue = -1;
        beginningOfQueue = -1;
        size = 0;
    }
}
