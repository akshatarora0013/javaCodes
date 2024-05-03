package conditionalStatement_loops;

import java.util.Scanner;
// Take integer inputs till the user enters 0 and print the largest number from all.
public class problem7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0;
        while(true){
            System.out.print("Enter number: ");
            int num = input.nextInt();
            if (num != 0){
                if (num > largest){
                    largest = num;
                }
            }
            else {
                break;
            }
        }
        System.out.println(largest);
    }
}
