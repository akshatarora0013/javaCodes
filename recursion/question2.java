package recursion;

import java.util.Scanner;
// print 1 to n
public class question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        function(n);
    }
    static void function(int n){
        if (n == 0){
            return;
        }
        function(n-1);
        System.out.print(n + " ");
    }
}
