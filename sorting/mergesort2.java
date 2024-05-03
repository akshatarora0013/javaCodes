package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class mergesort2 {
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
        mergesort(arr , 0 , arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergesort(int[] arr , int start , int end){
        if (end - start == 1){
            return;
        }
        int mid = start + (end - start)/2;
        mergesort(arr , start , mid);
        mergesort(arr , mid , end);

        merge(arr , start , mid , end);
    }
    static void merge(int[] arr , int start , int mid , int end){
        int[] mergedArray = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end){
            if (arr[i] < arr[j]){
                mergedArray[k] = arr[i];
                i++;
                k++;
            }
            else{
                mergedArray[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i < mid){
            mergedArray[k] = arr[i];
            i++;
            k++;
        }
        while (j < end){
            mergedArray[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mergedArray.length; l++) {
            arr[start + l] = mergedArray[l];
        }
    }
}
