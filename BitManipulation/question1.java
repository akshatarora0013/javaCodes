package BitManipulation;

import java.util.Scanner;
// number is even or odd
public class question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // by checking the last digit of binary number whether the number is even or odd because only the last digit is not in the power of 2
        // if we and the number with 1 it will give the last digit of binary number if its 0 then even otherwise odd
        if ((n & 1) == 1){
            System.out.println("Number is odd");
        }
        else {
            System.out.println("Number is even");
        }
    }
}
