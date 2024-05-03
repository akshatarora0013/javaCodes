package functions;

import java.util.Scanner;
//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = input.nextInt();
        System.out.print("Enter number 2: ");
        int b = input.nextInt();
        System.out.print("Enter number 3: ");
        int c = input.nextInt();
        int maximum = maximum(a,b,c);
        System.out.println("Maximum number among the three number is " + maximum);
        int minimum = minimum(a,b,c);
        System.out.println("minimum number among the three number is " + minimum);
    }
    static int maximum(int num1 , int num2 , int num3){
        int max = num1;
        if(num2 > num1 && num2 >num3){
            max = num2;
        }
        else if(num3 > num1 && num3 > num2){
            max = num3;
        }
        return max;
    }
    static int minimum(int num1 , int num2 , int num3){
        int min = num1;
        if(num2 < num3 && num2 <num1){
            min = num2;
        }
        else if(num3<num1 && num3<num2){
            min = num3;
        }
        return min;
    }
}
