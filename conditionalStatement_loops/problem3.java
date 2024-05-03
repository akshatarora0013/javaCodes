package conditionalStatement_loops;

import java.util.Scanner;
//Armstrong number
public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int temp = num;
        int sum = 0;
        while(temp>0){
            sum = sum +((temp%10)*(temp%10)*(temp%10));
            temp = temp/10;
        }
        if (sum == num){
            System.out.println("This is an armstrong number");
        }
        else {
            System.out.println("Not an armstrong number");
        }
    }
}
