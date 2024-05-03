package binarysearch;
// only for sorted array descending order
public class binarysearch2 {
    public static void main(String[] args) {
        int[] arr = {90 , 87 , 77 , 65 , 54 , 43 , 34 , 22 , 10 , 6 ,3 ,2 ,1};
        int target = 22;
        int result = binarySearch(arr , target);
        System.out.println(result);
    }
    static int binarySearch(int[] array , int target){
        int start = 0;
        int end = array.length - 1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target>array[mid]){
                end = mid - 1;
            }
            else if (target<array[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
