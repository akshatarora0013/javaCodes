package linaersearch;

import java.util.Arrays;
import java.util.Scanner;

public class searchin2Darray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements of arrays");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        System.out.println("Enter the target value");
        int target = input.nextInt();
        int[] ans = search2D(arr , target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search2D(int[][] array , int target){
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col]==target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
