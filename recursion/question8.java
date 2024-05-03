package recursion;

import java.util.Scanner;
// check whether the array is sorted or not.
public class question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1 , 2 , 7 , 4 ,5};
        boolean result = sorted(arr , 0);
        System.out.println(result);
    }
    static boolean sorted(int[] arr , int i){
        if (i == arr.length-1){
            return true;
        }
        return arr[i] < arr[i+1] && sorted(arr , i+1);
    }
}
