package binarysearch;

import java.util.Arrays;
import java.util.Scanner;
// array is sorted in row wise and column wise manner
public class binarySearch2dArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        int m = input.nextInt();
        int array[][] = new int[n][m];
        System.out.print("Enter the element of arrays: ");
        for(int row = 0; row < n; row++){
            for (int col = 0; col < m; col++){
                array[row][col] = input.nextInt();
            }
        }
        for(int row = 0; row < n; row++){
            for (int col = 0; col < m; col++){
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
        System.out.print("Enter the target element: ");
        int target = input.nextInt();
        int[] ans = search(array , target , n , m);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] array , int target , int rowSize , int colSize){
        int row = 0;
        int col = colSize - 1;
        while (row < rowSize && col>=0){
            if (array[row][col] == target){
                return new int[] {row , col};
            }
            if (array[row][col] < target){
                row ++;
            }
            else{
                col--;
            }
        }
        return new int[] {-1 , -1};
    }
}
