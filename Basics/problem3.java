package Basics;

import java.util.Scanner;
// Calculating Simple interest
public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal value: ");
        int principal = input.nextInt();
        System.out.print("Enter time in years: ");
        float time = input.nextFloat();
        System.out.print("Enter rate of interest: ");
        float Rate = input.nextFloat();

        float Simple_interest = principal*time*Rate/100;
        System.out.println("Simple interest is "+ Simple_interest);
    }
}
