package recursion;

import java.util.Scanner;
//factorial of n
public class question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
    static int factorial(int n){
        if (n == 1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
