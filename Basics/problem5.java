package Basics;

import java.util.Scanner;
// Largest number
public class problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

        if (num1>num2){
            System.out.println(num1);
        }
        else {
            System.out.println(num2);
        }
    }
}
