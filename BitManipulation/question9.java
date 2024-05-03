package BitManipulation;

import java.util.Scanner;
// number of digits in base b
public class question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        System.out.print("Enter the base: ");
        int b = input.nextInt();
        int ans = (int)(Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
    }
}
