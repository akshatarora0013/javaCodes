package Basics;

import java.util.Scanner;
// converting indian currency into USD
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float Indian_currency = input.nextFloat();
        float USD = Indian_currency/75;
        System.out.println("Indian currency in USD is : " + USD);
    }
}
