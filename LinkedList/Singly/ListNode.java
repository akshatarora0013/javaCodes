package LinkedList.Singly;

public class ListNode {
    private Node head;
    private Node tail;
    private int size;

    public ListNode() {
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value , head);
        head = node;

        if(tail == null){
            tail = head;
        }
        size ++;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        if (tail == null){
            insertFirst(value);
            return;
        }
        tail.next = node;
        tail = node;

        size ++;
    }

    public void insert(int value , int index){
        if(value > size){
            System.out.println("ERROR");
            return;
        }
        if(index == 0){
            insertFirst(value);
            return;
        }
        if (index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void insertRec(int value , int index){
        head = insertRec(value , index , head);
    }

    private Node insertRec(int value , int index , Node node){
        if(index == 0){
            Node newNode = new Node(value , node);
            size++;
            return newNode;
        }
        node.next = insertRec(value , index-1, node.next);
        return node;
    }

    public void reverseREC(){
        reverseREC(head);
    }

    public void reverseREC(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverseREC(node.next);
        tail.next = node;
        tail = node;
        node.next = null;
    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return value;
    }

    public int deleteLast(){
        if (size <= 1){
            return deleteFirst();
        }
        Node temp = head;
        for (int i = 1; i < size-1; i++) {
            temp = temp.next;
        }
        int value = tail.value;
        temp.next = null;
        tail = temp;
        size--;
        return value;
    }

    public int delete(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size-1){
            return deleteLast();
        }
        Node prev = head;
        for (int i = 0; i < index-1; i++) {
            prev = prev.next;
        }
        int value = prev.next.value;
        prev.next = prev.next.next;
        return value;
    }

    public void reverse(){
        Node next = null;
        Node previous = null;
        Node current = head;
        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public int get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.value;
    }

    public Node find(int value){
        Node node = head;
        while (node.next != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
