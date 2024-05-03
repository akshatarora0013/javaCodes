package conditionalStatement_loops;

import java.util.Scanner;
//Fibonacci
public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();

        long a = 0;
        long b = 1;
        long i = 3;
//        System.out.println(a);
//        System.out.println(b);
        while (i<=n){
            long temp = b;
            b = b+a;
            a = temp;
//            System.out.println(b);
            i++;
        }
        System.out.println(b);
    }
}
