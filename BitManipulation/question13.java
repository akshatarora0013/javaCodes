package BitManipulation;

import java.util.Scanner;
// Find xor of numbers from 0 to n ;
public class question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            ans ^= i;
        }
        System.out.println(ans);

        if (n%4 == 0){
            System.out.println(n);
        }
        if (n%4 == 1){
            System.out.println(1);
        }
        if (n%4 == 2){
            System.out.println(n+1);
        }
        if (n%4 == 3){
            System.out.println(0);
        }
    }
}
