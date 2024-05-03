package functions;

import java.util.Scanner;
//Define a program to find out whether a given number is even or odd.
public class problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        even_odd(num);
    }
    static void even_odd(int number){
        if(number%2==0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
