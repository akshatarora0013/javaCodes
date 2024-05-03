package basicMaths;

import java.util.Scanner;

public class NewtonRaphson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = input.nextInt();
        double result = sqrt(num);
        System.out.println(result);
    }
    static double sqrt(double n){
        double x = n;
        double root;

        while (true){
            root = 0.5 * (x + (n/x));

            if (Math.abs(root - x) < 1){
                break;
            }
            x = root;
        }
        return root;
    }
}
