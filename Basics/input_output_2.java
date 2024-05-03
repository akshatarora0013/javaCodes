package Basics;

import java.util.Scanner;

public class input_output_2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int num1 = Input.nextInt();
        int num2 = Input.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
}
