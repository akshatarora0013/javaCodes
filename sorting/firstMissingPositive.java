package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class firstMissingPositive {
    static void sorting(int[] array){
        int i = 0;
        while (i < array.length){
            int correct = array[i] - 1;
            if (array[i]>0 && array[i]<array.length && array[i] != array[correct]){
                int temp = array[i];
                array[i] = array[correct];
                array[correct] = temp;
            }
            else {
                i++;
            }
        }
    }
    static int answer(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i+1){
                return i+1;
            }
        }
        return array.length+1;
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
        System.out.println();
        System.out.println(answer(array));
    }
}
