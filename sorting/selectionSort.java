package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    static void sortingSmallest(int[] array){
        for (int i = 0; i < array.length; i++) {
            int smallest = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[smallest]){
                    smallest = j;
                }
            }
            int temp = array[i];
            array[i] = array[smallest];
            array[smallest] = temp;
        }
    }
    static void sortingLargest(int[] array){
        for (int i = 0; i < array.length; i++) {
            int largest = array.length-i -1;
            for (int j = 0; j < array.length-i -1; j++) {
                if (array[j] > array[largest]){
                    largest = j;
                }
            }
            int temp = array[largest];
            array[largest] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of elements: ");
        size = input.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));
//        sortingSmallest(array);
        sortingLargest(array);
        System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(array));
    }
}
