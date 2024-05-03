package arrays;

import java.util.Arrays;
import java.util.Scanner;
//to find maximum and minimum element in an array
public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int max = maximum(arr);
        System.out.println(max);
        int min = minimum(arr);
        System.out.println(min);
    }
    static int maximum(int[] array){
        int max = array[0];
        int peak_element = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
                peak_element = i;
            }
        }
        System.out.println("Peak element is "+peak_element);
        return max;
    }
    static int minimum(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}

