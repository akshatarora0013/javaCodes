package recursion;

import java.util.Scanner;
// printing pattern
// ***
// **
// *
public class question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        triangle(n);
    }
    static void triangle(int n){
        helper(n , 0);
    }
    static void helper(int row , int col){
        if (row == 0){
            return;
        }
        if (col < row){
            System.out.print("* ");
            helper(row , col+1);
        }
        else{
            System.out.println();
            helper(row-1 , 0);
        }
    }
}
