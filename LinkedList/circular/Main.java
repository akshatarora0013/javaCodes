package LinkedList.circular;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertFirst(9);
        list.insertFirst(65);
        list.insertFirst(43);
        list.insertFirst(77);
        list.display();

        list.insertLast(61);
        list.insertLast(34);
        list.insertLast(89);
        list.display();

        list.insert(17 , 4);
        list.display();

        list.delete(34);
        list.display();
    }
}
