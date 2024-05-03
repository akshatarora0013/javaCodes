package StackQueue;

import java.util.*;

public class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        pqueue.offer(10);
        pqueue.offer(30);
        pqueue.offer(5);
        pqueue.offer(50);
        System.out.println(pqueue.peek());
    }
}
