package BitManipulation;

import java.util.Scanner;
// set the i'th bit  // means make the ith element 1
public class question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        System.out.print("Enter the value of i: ");
        int i = input.nextInt();
        int mask = 1 << (i-1);
        System.out.println(num | mask);
    }
}
