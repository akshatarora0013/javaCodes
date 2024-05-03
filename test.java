import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        int extraBooks = scanner.nextInt();

        // Sort the prices in ascending order
        Arrays.sort(prices);

        // Calculate minimum money
        int minMoney = 0;
        for (int price : prices) {
            if (n > extraBooks) {
                minMoney += price;
                n -= (extraBooks + 1);
            } else {
                minMoney += price;
                break;
            }
        }

        // Calculate maximum money
        int maxMoney = 0;
        for (int i = prices.length - 1; i >= 0; i--) {
            maxMoney += prices[i];
            if (--n <= 0) {
                break;
            }
        }

        // Print the results
        System.out.println(minMoney);
        System.out.println(maxMoney);

        scanner.close();
    }
}
