package BitManipulation;

import java.util.Scanner;
// Find the number of set bit
public class question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(Integer.toBinaryString(n));
        int counter = 0;
//        while (n>0){
//            int last = n&1;
//            if (last == 1){
//                counter++;
//            }
//            n = n>>1;
//        }
        while (n>0){
            counter++;
//            n = n - (n&(-n));
            n = n & (n-1);
        }
        System.out.println(counter);
    }
}
