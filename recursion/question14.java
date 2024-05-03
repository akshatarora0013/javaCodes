package recursion;

import java.util.Arrays;
import java.util.Scanner;
// selection sort
public class question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        helper(arr , 0 , 1 , 0);
    }

    static void helper(int[] arr, int i, int j , int smallest) {
        if (i == arr.length){
            return;
        }
        if (j <= arr.length - 1){
            if (arr[j] < arr[smallest]){
                smallest = j;
            }
            helper(arr , i , j+1 , smallest);
        }
        else {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            helper(arr , i+1 , i+2, i+1);
        }
    }
}
