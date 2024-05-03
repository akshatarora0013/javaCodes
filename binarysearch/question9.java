package binarysearch;

import java.util.Scanner;
//Split array largest sum
public class question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        int array[] = new int[n];
        System.out.print("Enter the element of arrays: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Enter the no of partions: ");
        int m = input.nextInt();

        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            start = Math.max(start , array[i]);
            end += array[i];
        }
        while (start < end){
            int mid = start + (end-start) /2;
            int sum = 0;
            int partition = 1;
            for (int i = 0; i < n; i++) {
                if (sum + array[i] > mid){
                    sum = array[i];
                    partition++;
                }
                else {
                    sum += array[i];
                }
            }
            if (partition <= m){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        System.out.println(end);
    }
}
