package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class question2_orderagnostocceling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("enter the target element: ");
        int target = input.nextInt();
        System.out.println(Arrays.toString(arr));
        if (arr[0]<arr[arr.length-1]){
            int result = ascending(arr , target);
            System.out.println(result);
        }
        else {
            int result = descending(arr , target);
            System.out.println(result);
        }
    }

    static int ascending(int[] array , int target){
        if (target > array[array.length - 1]){
            return -1;
        }
        int start = 0;
        int end = array.length - 1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if (array[mid]>target){
                end = mid -1;
            }
            else if (array[mid]<target){
                start = mid +1;
            }
            else {
                return mid;
            }
        }
        return start;
    }

    static int descending(int[] array , int target){
        int start = 0;
        int end = array.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (array[mid] < target){
                end = mid - 1;
            }
            else if (array[mid] > target){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}
