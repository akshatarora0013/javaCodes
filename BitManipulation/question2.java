package BitManipulation;

import java.util.Scanner;
// find unique element numbers are repeated twice
public class question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {2 ,5 , 3 , 2 , 5  ,6 , 3};
        int unique = 0;
        for(int n : arr){
            unique = unique ^ n;
        }
        System.out.println(unique);
    }
}
