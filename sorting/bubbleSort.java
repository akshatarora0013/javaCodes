package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {
    static void sorting(int[] array ){
        for (int i = 0; i < array.length-1; i++) {
            boolean swapped = false;
            for (int j = 1; j < array.length-i; j++) {
                if (array[j-1] > array[j]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
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
        sorting(array);
        System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(array));
    }
}
