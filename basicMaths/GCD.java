package basicMaths;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int result = euclidean(a , b);
        System.out.println(result);
    }
    static int euclidean(int a , int b){
        if(a == 0){
            return b;
        }
        return euclidean(b%a , a);
    }
}
