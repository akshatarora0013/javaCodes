package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(45);
        list.add(56);
        list.add(12);
        list.add(99);
        list.add(78);
        list.add(34);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            list2.add(input.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(list2.get(i) + " ");
        }
    }
}
