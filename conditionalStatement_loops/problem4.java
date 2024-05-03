package conditionalStatement_loops;

import java.util.Scanner;
//Subtract the Product and Sum of Digits of an Integer
public class problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int product = 1;
        int sum = 0;
        while (num>0){
            int temp = num%10;
            product = product*temp;
            sum = sum + temp;
            num = num/10;
        }
        System.out.println(product-sum);
    }
}
