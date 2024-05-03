package conditionalStatement_loops;

import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int factorial = 1;
        for (int i = n; i >= 1 ; i--) {
            factorial = factorial*i;
        }
        System.out.println("Factorial of the given number is "+factorial);
    }
}
