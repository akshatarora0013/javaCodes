package BitManipulation;

import java.util.Scanner;
// Find the i'th bit of a number
// 11010110
// 76543210  5th bit == 0
public class question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        System.out.print("Enter the value of i: ");
        int i = input.nextInt();
        int mask = 1<<(i-1);    // mask is another number which is used to get the answer;
        int ans = num & mask;
        System.out.println(ans >> (i-1));
    }
}
