package patterns;

import java.util.Scanner;

public class pattern28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= 2*n-1; i++) {
            int stars;
            if (i > n){
                stars = n-(i-n);
            }
            else {
                stars = i;
            }
            int spaces = n - stars;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
