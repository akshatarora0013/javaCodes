package functions;

import java.util.Scanner;
//Write a function to check if a given triplet is a Pythagorean triplet or not.
public class problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number2: ");
        int num2 = input.nextInt();
        System.out.print("Enter number3: ");
        int num3 = input.nextInt();
        PT(num1 , num2 , num3);
    }
    static void PT(int a , int b , int c){
        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a){
            System.out.println("Numbers are Pythogoras Triplet");
        }
        else {
            System.out.println("Numbers are not Pythogoras Triplet");
        }
    }
}
