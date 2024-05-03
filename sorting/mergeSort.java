package sorting;

import java.util.Arrays;
import java.util.Scanner;
// In this we are making new objects and not passing the orignal object
public class mergeSort {
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
        System.out.println(Arrays.toString(mergesort(arr))); // orignal array is not sorted
    }
    static int[] mergesort(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr , 0 , mid));
        int[] right = mergesort(Arrays.copyOfRange(arr , mid , arr.length));

        return merge(left , right);
    }
    static int[] merge(int[] first , int[] second){
        int[] mergedArray = new int[first.length + second.length];
        int k = 0;
        int i = 0;
        int j = 0;
        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                mergedArray[k] = first[i];
                i++;
                k++;
            }
            else{
                mergedArray[k] = second[j];
                j++;
                k++;
            }
        }
        while(i < first.length){
            mergedArray[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mergedArray[k] = second[j];
            j++;
            k++;
        }
        return mergedArray;
    }
}
