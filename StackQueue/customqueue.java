package StackQueue;

public class customqueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public customqueue(){
        this(DEFAULT_SIZE);
    }
    public customqueue(int size){
        this.data = new int[size];
    }

    public void insert(int item){
        if(end == data.length){
            System.out.println("Queue is Full");
            return;
        }
        data[end++] = item;
    }
    public int remove(){
        if (end == 0){
            System.out.println("Queue is Empty");
            return 0;
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("END");
    }
}
