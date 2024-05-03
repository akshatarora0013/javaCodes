package LinkedList.doubly;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.previous = null;
        if (head != null){
            head.previous = node;
        }
        head = node;
        if (tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        if(size == 0){
            insertFirst(value);
            return;
        }
        node.next = null;
        node.previous = tail;
        tail.next = node;
        tail = node;
    }

    public void insert(int value , int index){
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        Node node = new Node(value);
        node.previous = temp;
        node.next = temp.next;
        if (temp.next != null){
            temp.next.previous = node;
        }
        temp.next = node;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayREV(){
        Node temp = tail;
        while (temp != null){
            System.out.print(temp.value + " <-> ");
            temp = temp.previous;
        }
        System.out.println("START");
    }

    private class Node{
        int value;
        Node next;
        Node previous;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
}
