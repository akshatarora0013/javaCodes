package binarysearch;

import java.util.Arrays;
import java.util.Scanner;
// peak elemet in moutain array
public class question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        enter_numbers(array , size);
        System.out.println(Arrays.toString(array));
        int result = search(array);
        System.out.println("Index of Peak element in the array is: " + result);
    }
    static void enter_numbers(int[] array , int size){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
    }
    static int search(int[] array){
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
}
