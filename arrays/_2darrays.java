package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _2darrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr;
        arr = new int[3][2];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 2; col++) {
                arr[row][col] = input.nextInt();
            }
        }

        //METHOD 1 for printing the array
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        //METHOD 2 for printing the array
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
