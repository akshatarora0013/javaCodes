package conditionalStatement_loops;

import java.util.Scanner;
//Input a number and print all the factors of that number
public class problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            if ((num%i) == 0){
                System.out.println(i);
            }
        }
    }
}
