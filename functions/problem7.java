package functions;

import java.util.Scanner;
//Write a function that returns the sum of first n natural numbers.
public class problem7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        sum(n);
    }
    static void sum(int number){
        int result = 0;
        for (int i = 0; i <= number; i++) {
            result = result + i;
        }
        System.out.println(result);
    }
}
