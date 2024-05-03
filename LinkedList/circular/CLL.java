package LinkedList.circular;

public class CLL {
    private int size;
    private Node head;
    private Node tail;

    public CLL(){
        this.head = null;
        this.tail = null;
        int size = 0;
    }

    public void insertFirst(int value){
        if (head == null){
            Node node = new Node(value);
            head = node;
            tail = node;
            size++;
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        node.next = head;
        head = node;
        size++;
    }

    public void insertLast(int value){
        if (size == 0){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void insert(int value , int index){
        if (index > size-1){
            System.out.println("Not valid index");
            return;
        }
        if(index == 0){
            insertFirst(value);
            return;
        }
        if (index == size-1){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        Node node = new Node(17);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void delete(int value){
        Node node = head;
        if (node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if (n.value == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);
    }

    public void display(){
        Node temp = head;
        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }while (temp != head);
        System.out.println("HEAD");
    }

    class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
