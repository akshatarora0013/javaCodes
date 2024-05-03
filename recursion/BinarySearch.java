package recursion;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target = input.nextInt();
        int result = search(array , target , 0 , array.length-1);
        System.out.println(result);
    }
    static int search(int[] array , int target , int start , int end){
        if (start > end){
            return -1;
        }
        else {
            int mid = start + (end - start)/2;
            if (array[mid] == target){
                return mid;
            }
            else if(array[mid] > target){
                return search(array , target , start , mid-1);
            }
            else{
                return search(array , target , mid+1 , end);
            }
        }
    }
}
