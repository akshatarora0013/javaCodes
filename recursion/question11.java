package recursion;

import java.util.Scanner;
// search in rotated binary search
public class question11 {
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
        int result = search(arr , target , 0 , arr.length-1);
        System.out.println(result);
    }
    static int search(int[] arr , int target ,int start , int end){
        if (start > end){
            return -1;
        }
        else {
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return mid;
            }
            else if(arr[mid] >= arr[start]){
                if (target <= arr[mid] && target >= arr[start]){
                    return search(arr , target , start , mid-1);
                }
                else{
                    return search(arr, target , mid+1 , end);
                }
            }
            else {
                if (arr[mid] <= target && target <= arr[end]){
                    return search(arr, target, mid + 1, end);
                }
                else {
                    return search(arr , target , start , mid-1);
                }
            }
        }
    }
}
