package recursion;

import java.util.Scanner;
// linear search
public class question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("enter the target element: ");
        int target = input.nextInt();
        int result = search(arr , target);
        System.out.println(result);
    }
    static int search(int[] arr , int target){
        return helper(arr , target , 0);
    }
    static int helper(int[] arr , int target , int i){
        if (i == arr.length){
            return -1;
        }
        if (arr[i] == target){
            return i;
        }
        return helper(arr , target , i+1);
    }
}
