package BitManipulation;

import java.util.Scanner;
// find a raise to power b
public class question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int power = input.nextInt();
        int ans = 1;
        while(power > 0){
            int last  = power&1;
            if (last == 1){
                ans = ans * (last*base);
            }
            base = base * base;
            power = power>>1;
        }
        System.out.println(ans);
    }
}
