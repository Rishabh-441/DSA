package QueueArrayImplementation;

public class QueueArray {
    public int[] arr;
    public int topOfQueue;
    public int beginningOfQueue;

    public QueueArray(int size){
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
    }

    //isFull method:
    public boolean isFull(){
        if (topOfQueue == arr.length-1){
            return true;
        }
        else return false;
    }

    //isEmpty method:
    public boolean isEmpty(){
        if (beginningOfQueue == arr.length || beginningOfQueue == -1){
            return true;
        }
        return false;
    }

    //Enqueue method:
    public void enQueue(int data){
        if(isFull()){
            System.out.println("Queue is full!");
        }
        else if (isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = data;
            System.out.println("successfully inserted "+ data + " in queue");
        }
        else{
            topOfQueue++;
            arr[topOfQueue] = data;
            System.out.println("successfully inserted "+ data + " in queue");
        }
    }

    //Dequeue method:
    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }
        else{
            int x = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            }
            return x;
        }
    }

    //peek method:
    public int peek(){
        if (!isEmpty()){
            return arr[beginningOfQueue];
        }
        else{
            System.out.println("Queue is empty!");
            return -1;
        }
    }

    //deleting the Queue:
    public void delete(){
        arr = null;
        topOfQueue = -1;
        beginningOfQueue = -1;
    }
}
