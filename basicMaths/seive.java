package basicMaths;

import java.util.Scanner;

public class seive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        boolean[] primes = new boolean[n+1];
        seive(n , primes);
    }
    static void seive(int n , boolean[] arr){
        for (int i = 2; i*i <= n; i++) {
            if (!arr[i]){
                for (int j = i*2; j <= n; j = j+i) {
                    arr[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!arr[i]){
                System.out.print(i + " ");
            }
        }
    }
}
