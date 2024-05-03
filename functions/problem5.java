package functions;

import java.util.Scanner;
// method to find whether the number is prime or not
public class problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        prime(num);
    }
    static void prime(int number){
        boolean check = false;
        for (int i = 2; i*i < number; i++) {
            if(number%i == 0){
                check = true;
            }
            break;
        }
        if (check == true){
            System.out.println("Number is not prime");
        }
        else {
            System.out.println("Number is prime");
        }
    }
}
