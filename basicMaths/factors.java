package basicMaths;

import java.util.ArrayList;
import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        factors2(num);
    }
    static void factors1(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n%i == 0){
                if (n/i == i){
                    System.out.print(i + " ");
                }
                else {
                    System.out.println(i + " " + n/i);
                }
            }
        }
    }
    // printing in sorted order
    static void factors2(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n%i == 0){
                if (n/i == i){
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
