package Basics;

import java.util.Scanner;
//Number is even or odd
public class problem2 {
    public static void main(String[] args) {
        System.out.print("Enter a number :");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num %2 ==0){
            System.out.println("Given number is even");
        }
        else {
            System.out.println("Given number is odd");
        }
    }
}
