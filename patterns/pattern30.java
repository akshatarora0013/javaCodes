package patterns;

import java.util.Scanner;

public class pattern30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int a;
            int spaces = n-i-1;
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i +1; j++) {
                if (j > i+1){
                    System.out.print(j-i + " ");
                }
                else {
                    System.out.print(i-j+2 + " ");
                }
            }
            System.out.println();
        }
    }
}
