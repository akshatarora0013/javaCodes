package recursion;

import java.util.Scanner;
// sum of digits
public class question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = sum(n);
        System.out.println(result);
    }
    static int sum(int n){
        if (n == 0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }
}
