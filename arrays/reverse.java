package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[7];
        System.out.print("Enter elements of arrays: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] array){
        int start = 0;
        int end = array.length-1;
        while (end >= start){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            end--;
            start++;
        }
    }
}
