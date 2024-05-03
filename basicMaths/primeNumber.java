package basicMaths;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int n){
        int i = 2;
        while(i * i <= n){
            if (n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
