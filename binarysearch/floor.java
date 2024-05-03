package binarysearch;

public class floor {
    public static void main(String[] args) {
        int[] arr = {-18 , -10 , 0 , 2, 4 ,5, 8 ,13 ,35, 56, 67};
        int target = 7;
        int result = floor(arr , target);
        System.out.println(result);
    }
    static int floor(int[] array , int target){
        int start = 0;
        int end = array.length - 1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if (array[mid]>target){
                end = mid -1;
            }
            else if (array[mid]<target){
                start = mid +1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}