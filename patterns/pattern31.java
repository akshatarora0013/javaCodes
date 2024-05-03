package patterns;

import java.util.Scanner;

public class pattern31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int orignal_n = n;
        n = 2*n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int atEveryIndex = orignal_n - (Math.min(Math.min(i , j) , Math.min(n-i , n-j)));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
