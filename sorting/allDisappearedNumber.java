package sorting;

import java.util.Arrays;
import java.util.Scanner;
//range 1 to n
public class allDisappearedNumber {
    static void sorting(int[] array){
        int i = 0;
        while (i < array.length){
            int correct = array[i] - 1;
            if (array[i] != array[correct]){
                int temp = array[i];
                array[i] = array[correct];
                array[correct] = temp;
            }
            else {
                i++;
            }
        }
    }
    static void missing(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i+1){
                System.out.println(i+1 + " ");
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
        missing(array);
    }
}
