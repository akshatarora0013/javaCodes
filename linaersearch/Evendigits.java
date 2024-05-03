package linaersearch;

import java.util.Scanner;

public class Evendigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {12 , 345 , 0 , 6 ,7486};
        int output = evendigits(arr);
        System.out.println(output);
    }
    static int evendigits(int[] array){
        int output = 0;
        for (int i = 0; i < array.length; i++) {
            int digits = 0;
            if (array[i]<0){
                array[i] = array[i]*-1;
            }
            if (array[i]==0){
                digits++;
            }
            while (array[i]>0){
                array[i]=array[i]/10;
                digits++;
            }
            if (digits%2 == 0){
                output++;
            }
        }
        return output;
    }
}
