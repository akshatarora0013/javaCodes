package recursion;

import java.util.Scanner;
// reverse a number
public class question5 {
    static int sum = 0;
    static void reverse(int n){
        if (n == 0){
            return;
        }
        sum = (sum*10) + n%10;
        reverse(n/10);
    }
    static int reverse2(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n , digits);
    }
    static int helper(int n , int digits){
        if (n % 10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)Math.pow(10 , digits-1) + helper(n/10 , digits-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = reverse2(n);
//        System.out.println(sum);
        System.out.println(result);
    }

}
