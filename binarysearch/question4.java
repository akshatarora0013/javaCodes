package binarysearch;

import java.util.Arrays;
import java.util.Scanner;
//find first and last postion of array in an array
public class question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        enter_numbers(array , size);
        System.out.println(Arrays.toString(array));
        System.out.println("Enter the target element: ");
        int target = input.nextInt();
        int[] result = search(array , target);
        System.out.println(Arrays.toString(result));
    }
    static void enter_numbers(int[] array , int size){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
    }
    static int[] search(int[] array , int target){
        int[] ans = {-1 , -1};
        int start = 0;
        int end = array.length - 1;
        while (end >= start){
            int mid = start + (end-start)/2;
            if (array[mid] > target){
                end = mid - 1;
            }
            else if(array[mid] < target){
                start = mid + 1;
            }
            else{
                ans[0] = mid;
                end = mid -1;
            }
        }
        start = 0;
        end = array.length - 1;
        while (end >= start){
            int mid = start + (end-start)/2;
            if (array[mid] > target){
                end = mid - 1;
            }
            else if(array[mid] < target){
                start = mid + 1;
            }
            else{
                ans[1] = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
}
