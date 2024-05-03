package StackQueue;

public class StackMain {
    public static void main(String[] args) {
        customStack stack = new customStack(20);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
