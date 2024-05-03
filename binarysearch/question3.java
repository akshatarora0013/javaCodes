package binarysearch;

import java.util.Scanner;

public class question3 {
    //find the smallest letter greater than target
    //letter wrap around --> if no letter is greater than the target than return first element
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] arr = {'b' , 'g' , 'k' , 'm' , 'q' , 't'  ,'w' , 'y'};
        char target = 'q';
        char result = search(arr , target);
        System.out.println(result);
    }
    static char search(char[] array , char target){
        int start = 0;
        int end = array.length - 1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if (array[mid] <= target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return array[start%array.length];
//        if (start == array.length){
//            return array[0];
//        }
//        return array[start];
    }
}
