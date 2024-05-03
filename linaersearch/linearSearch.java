package linaersearch;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total number of elements: ");
        int N = input.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target = input.nextInt();
        int output = linearSearch(arr , target);
        System.out.println(output);
    }
    static int linearSearch(int array[],int target){
        if(array.length == 0){
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]==target){
                return i;
            }
        }
        return -1;
    }
}
