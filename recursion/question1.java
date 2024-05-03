package recursion;

import java.util.Scanner;
// print n to 1;
public class question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        function(n);
    }
    static void function(int n){
        if (n == 0){
            return;
        }
        System.out.print(n + " ");
        function(n-1);
    }
}
