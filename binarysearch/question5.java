package binarysearch;

import java.util.Arrays;
import java.util.Scanner;
//Find position of an element in a sorted array of infinite numbers
public class question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        enter_numbers(array , size);
        System.out.println(Arrays.toString(array));
        System.out.println("Enter the target element: ");
        int target = input.nextInt();
        int result = ans(array , target);
        System.out.println(result);
    }
    static void enter_numbers(int[] array , int size){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
    }
    static int ans(int[] array , int target ){
        int start = 0;
        int end = 1;
        while (target > array[end]){
            int temp = end + 1;
            end = end + (end - start + 1)*2;
            start = temp;
        }
        return search(array , target , start , end);
    }
    static int search(int[] array , int target , int start , int end){
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
        return -1;
    }
}
