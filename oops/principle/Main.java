package oops.principle;

public class  Main {
    public static void main(String[] args) {
        baseclass box1 = new baseclass();
        baseclass box2 = new baseclass(3);
        baseclass box3 = new baseclass(4, 5 , 2);
        baseclass box4 = new baseclass(box3);

        System.out.println(box1.length + " " + box1.breadth + " " + box1.height);
        System.out.println(box2.length + " " + box2.breadth + " " + box2.height);
        System.out.println(box3.length + " " + box3.breadth + " " + box3.height);
        System.out.println(box4.length + " " + box4.breadth + " " + box4.height);

        childclass box5 = new childclass();
        childclass box6 = new childclass(4, 6 ,2 ,1);
//        childclass box7 = new baseclass(4,6,7) ;


        System.out.println(box5.length + " " + box5.breadth + " " + box5.height + " " + box5.weight);
        System.out.println(box6.length + " " + box6.breadth + " " + box6.height + " " + box6.weight);

        baseclass box8 = new childclass(4 , 6 , 2 , 1);

        System.out.println(box8.length + " " + box8.breadth + " " + box8.height);
    }
}
