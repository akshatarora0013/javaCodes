package StackQueue;

public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public customStack(){
        this(DEFAULT_SIZE);
    }
    public customStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if (ptr == data.length-1){
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public void pop(){
        if (ptr == -1){
            System.out.println("Stack is empty");
            return ;
        }
        System.out.println(data[ptr--]);
    }
    public void peek(){
        if (ptr == -1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(data[ptr]);
    }
}
