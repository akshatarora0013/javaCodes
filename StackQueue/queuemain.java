package StackQueue;

public class queuemain {
    public static void main(String[] args) {
        customqueue queue = new customqueue(10);
        queue.remove();
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        queue.insert(60);
        queue.display();

        queue.remove();
        queue.remove();
        queue.display();

        circularQueue queue2 = new circularQueue(10);
        queue2.insert(10);
        queue2.insert(20);
        queue2.insert(30);
        queue2.insert(40);
        queue2.insert(50);
        queue2.insert(60);
        queue2.display();

        queue2.remove();
        queue2.remove();
        queue2.display();
    }
}
