package BitManipulation;

import java.util.Arrays;
import java.util.Scanner;
// flipping and inverting
public class question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1 , 0 , 1};
        for (int i = 0; i < (arr.length+1)/2; i++) {
            int temp = arr[i]^1;
            arr[i] = arr[arr.length-i-1]^1;
            arr[arr.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
