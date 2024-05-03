package binarysearch;

public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] array1 = {1 , 4 ,6 ,9 ,11 ,22 ,24, 45 , 56, 67 ,86, 99};
        int target1 =  67;
        int result1 = Binarysearch(array1 , target1);
        int[] array2 = {99 ,87 ,77 ,65, 54, 33, 23, 12, 8, 2};
        int target2 = 87 ;
        int result2 = Binarysearch(array2 , target2);
        System.out.println(result1);
        System.out.println(result2 );
    }
    static int Binarysearch(int[] array , int target){
        int start = 0;
        int end = array.length - 1;
        boolean isAsc = array[start] < array[end];
        while (start <= end){
            int mid = start + (end-start)/2;
            if (array[mid] == target){
                return mid;
            }
            if (isAsc){
                if (target>array[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else {
                if (target>array[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
