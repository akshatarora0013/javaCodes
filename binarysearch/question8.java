package binarysearch;

import java.util.Arrays;
import java.util.Scanner;
// search in rotated array // no duplicacy of elements.
public class question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] array = { 7 , 8 , 10  ,15 , 34  ,45 , 52 , 0 , 2 , 4  ,6};
//        int target = 45;
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        enter_numbers(array , size);
        System.out.println("ENter the target");
        int target = input.nextInt();
        System.out.println(Arrays.toString(array));
        int pivot = findPivot(array);
//        int pivot = findPivotWithDuplicates(array);
        System.out.println("index of Pivot of the array is: " + pivot);
        if (pivot == -1){
            int result = search(array , target , 0 , array.length - 1);
            System.out.println("Index of target element is: " + result);
        }
        else{
            int result = -1;
            if (target == array[pivot]){
                result = array[pivot];
            }
            if (target > array[0]){
                result = search(array , target , 0 , pivot - 1);
            }
            if (target < array[0]){
                result = search(array , target , pivot+1 , array.length - 1);
            }
            System.out.println("Index of target element is: " + result);
        }
    }
    static void enter_numbers(int[] array , int size){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
    }
    static int findPivot(int[] array){
        int start = 0;
        int end = array.length - 1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if (mid < end && array[mid] > array[mid+1]){
                return mid;
            }
            else if (mid > start && array[mid] < array[mid - 1]){
                return mid-1;
            }
            else if (array[start] >= array[mid]){
                end = mid - 1;
            }
            else if (array[start] < array[mid]){
                start = mid + 1;
            }
        }
        return -1;
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
