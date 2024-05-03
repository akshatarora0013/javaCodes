package recursion;

import java.util.Arrays;
import java.util.Scanner;
// bubble sort
public class question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        helper(arr , 0 , arr.length-1);
    }
    static void helper(int[] arr , int i , int j){
        if (j==0){
            return;
        }
        if (i < j){
            if (arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            helper(arr , i+1 , j);
        }
        else{
            helper(arr , 0 , j-1);
        }
    }
}
