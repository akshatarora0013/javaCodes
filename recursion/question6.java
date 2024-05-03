package recursion;

import java.util.Scanner;
// count the number of zeroes
public class question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = count(n);
        System.out.println(result);
    }
    static int count(int n){
        return helper(n , 0);
    }
    static int helper(int n , int count){
        if (n == 0){
            return count;
        }
        if (n%10 == 0){
            return helper(n/10 , count+1);
        }
        else {
            return helper(n/10 , count);
        }
    }
}
