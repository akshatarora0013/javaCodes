package recursion;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        fibonacci(5);
//        System.out.println(result);
    }

    static int fibonacci(int n){
        if (n < 2){
            return n;
        }
        int ans = fibonacci(n-1) + fibonacci(n-2);
        System.out.println(ans);
        return ans;
    }
}
