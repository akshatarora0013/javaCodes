package conditionalStatement_loops;

import java.util.Scanner;
// reverse a number
public class conditional_and_loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = input.nextInt();

        int rev_num = 0;
        while (num>0){
            int a = num % 10;
            rev_num = (rev_num*10)+ a;
            num = num/10;
        }
        System.out.println(rev_num);
    }
}
