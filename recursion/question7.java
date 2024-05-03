package recursion;

import java.util.Scanner;
// steps to reduce the number to zero if the number is even divide it by 2 if odd minus 1 
public class question7 {
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
        if (n%2 == 0){
            return helper(n/2 , count+1);
        }
        else{
            return helper(n-1 , count+1);
        }
    }
}
