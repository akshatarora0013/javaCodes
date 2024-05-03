package linaersearch;

import java.util.Scanner;

public class MINmax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of elements: ");
        int N = input.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int minimum = min(arr);
        System.out.println("Minimum number is: " + minimum);
        int maximum = max(arr);
        System.out.println("Maximum number is: " + maximum);
    }
    static int max(int[] array){
        int maximum = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i]>maximum){
                maximum = array[i];
                index = i;
            }
        }
        System.out.println("Index number is: "+ index);
        return maximum;
    }
    static int min(int[] array){
        int minimum = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i]<minimum){
                minimum = array[i];
                index = i;
            }
        }
        System.out.println("Index number is: "+ index);
        return minimum;
    }
}
