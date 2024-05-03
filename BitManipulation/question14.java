package BitManipulation;

import java.util.Scanner;
// Find the xor of numbers between the range of a and b
public class question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int ans = 0;
        for (int i = a; i <= b; i++) {
            ans ^= i;
        }
        System.out.println(ans);
        int f1 = 0;
        int f2 = 0;
        if ((a-1)%4 == 0){
            f1 = a-1;
        }
        if ((a-1)%4 == 1){
            f1 = 1;
        }
        if ((a-1)%4 == 2){
            f1 = a;
        }
        if ((a-1)%4 == 3){
            f1 = 0;
        }

        if (b%4 == 0){
            f2 = a;
        }
        if (b%4 == 1){
            f2 = 1;
        }
        if (b%4 == 2){
            f2 = b+1;
        }
        if (b%4 == 3){
            f2 = 0;
        }

        int ans2 = f1^f2;
        System.out.println(ans2);
    }
}
