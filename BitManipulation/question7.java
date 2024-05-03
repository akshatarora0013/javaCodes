package BitManipulation;

import java.util.Scanner;
// find unique element ..... Numbers are repeating i times
public class question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Enter how many times numbers are repeating: ");
        int i = input.nextInt();
        int result = findUnique(arr , i);
        System.out.println(result);
    }
    static int findUnique(int[] array , int i){
//        int sum = 0;
//        for (int j = 0; j < array.length; j++) {
//            sum += Integer.toBinaryString(array[j]);
//        }
//        return sum%i;
        return 0;
    }
}
