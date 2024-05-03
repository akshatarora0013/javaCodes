package functions;

import java.util.Scanner;
//Write a program to print the sum of two numbers entered by user by defining your own method.
public class problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 =input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 =input.nextInt();
        int result = Sum(num1 , num2);
        System.out.println("Sum = "+result);
    }
    static int Sum(int a , int b){
        int sum = a + b;
        return sum;
    }
}
