package Basics;

import java.util.Scanner;
// Calculator
public class problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = input.nextInt();
        System.out.print("Enter the mathematical operator : ");
        char operator = input.next().charAt(0);
        if (operator == '+'){
            System.out.println(num1+num2);
        }
        else if (operator == '-'){
            System.out.println(num1-num2);
        }
        else if (operator == '*'){
            System.out.println(num1*num2);
        }
        else if(operator == '/'){
            System.out.println(num1/num2);
        }
        else {
            System.out.println("Enter valid operator ");
        }
    }
}
