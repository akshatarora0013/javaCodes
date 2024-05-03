package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {
    static void sorting(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            int j = i+1;
            while (j > 0){
                if (array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    j--;
                }
                else {
                    break;
                }
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
        System.out.println(Arrays.toString(array));
    }
}
