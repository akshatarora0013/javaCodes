package BitManipulation;

import java.util.Scanner;
// Find nth magic numberf
public class question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans = 0;
        int base = 5;
        while(n > 0){
            int last = n&1;
            n = n >> 1;
            ans += last*base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
