package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of arraylist you want: ");
        int a = input.nextInt();
        System.out.print("Enter no of rows: ");
        int b = input.nextInt();
        System.out.print("Enter no of cols: ");
        int c = input.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < c; j++) {
                list.get(i).add(input.nextInt());
            }
        }
        System.out.println(list);
    }
}
