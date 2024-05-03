package BitManipulation;

import java.util.Scanner;
//find whether the number is of power 2
public class question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        int counter = 0;
//        while (n>0){
//            int last = n&1;
//            if (last == 1){
//                counter++;
//            }
//            n = n >> 1;
//        }
//        if (counter == 1){
//            System.out.println(true);
//        }
//        else {
//            System.out.println(false);
//        }
        int mask = n&(n-1);
        if (mask == 0){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
