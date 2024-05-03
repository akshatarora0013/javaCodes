package binarysearch;
// only for sorted array ascending order
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18 , -10 , 0 , 2, 4 ,5, 8 ,13 ,35, 56, 67};
        int target = -180;
        int result = binarySearch(arr , target);
        System.out.println(result);
    }
    static int binarySearch(int[] array , int target){
        int start = 0;
        int end = array.length - 1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target>array[mid]){
                start = mid + 1;
            }
            else if (target<array[mid]){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
