package functions;

import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        boolean check = isarmstrong(n);
//        System.out.println(check);
        for (int i = 100; i < 1000; i++) {
            if(isarmstrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isarmstrong(int num){
        int sum = 0;
        int orignal = num;
        while (num>0){
            int rem = num%10;
            num = num/10;
            sum = sum + rem*rem*rem;
        }

        return sum == orignal;
    }
}
