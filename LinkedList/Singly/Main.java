package LinkedList.Singly;

public class Main {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.insertLast(3);
        list.insertLast(8);
        list.insertLast(11);
        list.insertLast(2);
        list.insertLast(7);
        list.display();

        list.insertFirst(6);
        list.insertFirst(5);
        list.display();

        list.insert(17 ,4);
        list.display();

//        System.out.println(list.get(4));

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        list.insertLast(18);
        list.insertLast(34);
        list.display();

        list.reverse();
        list.display();

        list.insertRec(88 , 3);
        list.display();

        list.reverseREC();
        list.display();

    }
}
