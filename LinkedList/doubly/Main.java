package LinkedList.doubly;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(6);
        list.insertFirst(5);
        list.insertFirst(16);
        list.insertFirst(24);
        list.display();
//        list.displayREV();

        list.insertLast(17);
        list.insertLast(34);
        list.display();
//        list.displayREV();

        list.insert(22 , 3);
        list.display();
    }
}
