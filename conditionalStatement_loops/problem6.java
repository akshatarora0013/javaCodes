package conditionalStatement_loops;

import java.util.Scanner;
//Take integer inputs till the user enters 0 and print the sum of all numbers
public class problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("Enter number: ");
            int num = input.nextInt();
            if (num != 0){
                sum = sum + num;
            }
            else {
                break;
            }
        }
        System.out.println(sum);
    }
}
