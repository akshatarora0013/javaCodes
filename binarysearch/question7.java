package binarysearch;

import java.util.Arrays;
import java.util.Scanner;
//Search element in mountain array
public class question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        enter_numbers(array , size);
        System.out.println("ENter the target");
        int target = input.nextInt();
        System.out.println(Arrays.toString(array));
        int peak_element = peakelement(array);
        int ans = search(array , target , 0 , peak_element);
        if (ans == -1){
            ans = search(array , target , peak_element+1 , array.length - 1);
        }
        System.out.println(ans);
    }
    static void enter_numbers(int[] array , int size){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
    }
    static int peakelement(int[] array){
        int start = 0;
        int end = array.length - 1;
        while (start < end){
            int mid = start + (end-start)/2;
            if (array[mid] > array[mid+1]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
    static int search(int[] array , int target , int start , int end){
        boolean isAsc = array[start] < array[end];
        while (start <= end){
            int mid = start + (end-start)/2;
            if (array[mid] == target){
                return mid;
            }
            if (isAsc){
                if (target>array[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else {
                if (target>array[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
