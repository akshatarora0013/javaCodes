package StackQueue;

public class circularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;
    int front = 0;
    int size = 0;

    public circularQueue(){
        this(DEFAULT_SIZE);
    }
    public circularQueue(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return size == data.length;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public void insert(int item){
        if (isFull()){
            System.out.println("Queue is Full");
            return;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
    }
    public int remove(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return 0;
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }
    public void display(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " ");
            i++;
            i = i % data.length;
        }while (i != end);
        System.out.println("END");
    }
}
