package StackImplementation;

public class Stack {
    int arr[];
    int topOfStack;


    public Stack(int size){
        this.arr = new int[size];
        topOfStack = -1;
    }

    //isEmpty method:
    public boolean isEmpty(){
        if (topOfStack == -1){
            return true;
        }
        else{
            return false;
        }
    }

    //isFull method:
    public boolean isFull(){
        if (topOfStack == arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }

    //push:
    public void push(int data){
        if (isFull()){
            System.out.println("STACK IS FULL");
        }
        else{
            arr[topOfStack + 1] = data;
            topOfStack++;
        }
    }

    //pop:
    public int pop(){
        if (isEmpty()){
            System.out.println("EMPTY STACK");
            return -1;
        }
        else{
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }


    //peek method:
    public int peek(){
        if (isEmpty()){
            System.out.println("EMPTY STACK");
            return -1;
        }
        else{
            return arr[topOfStack];
        }
    }

    //delete method:
    public void deleteStack(){
        arr = null;
        topOfStack = -1;
    }
}
