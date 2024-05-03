package binarysearch;

import java.util.Arrays;
import java.util.Scanner;
//array is completely sorted
public class binarySearch2dArray2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        int m = input.nextInt();
        int array[][] = new int[n][m];
        System.out.print("Enter the element of arrays: ");
        for(int row = 0; row < n; row++){
            for (int col = 0; col < m; col++){
                array[row][col] = input.nextInt();
            }
        }
        for(int row = 0; row < n; row++){
            for (int col = 0; col < m; col++){
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
        System.out.print("Enter the target element: ");
        int target = input.nextInt();
        int[] ans = search(array , target );
        System.out.println(Arrays.toString(ans));
    }

    static int[] binarySearch(int[][] array , int row , int cStart , int cEnd , int target){
        while (cStart < cEnd){
            int mid = cStart + (cEnd-cStart) /2;
            if (array[row][mid] == target){
                return new int[] {row , mid};
            }
            else if(array[row][mid] < target){
                cStart = mid + 1;
            }
            else {
                cEnd = mid - 1;
            }
        }
        return new int[] {-1 , -1};
    }
    static int[] search(int[][] array , int target ){
        int totalRows = array.length;
        int totalCols = array[0].length;

        int rStart = 0;
        int rEnd = totalRows - 1;
        int cMid = totalCols/2;
        while (rStart < rEnd - 1){
            int rMid = rStart + (rEnd - rStart)/2;
            if (array[rMid][cMid] == target){
                return new int[] {rMid , cMid};
            }
            else if(array[rMid][cMid] < target){
                rStart = rMid;
            }
            else{
                rEnd = rMid;
            }
        }
        //now we have two rows
        if (array[rStart][cMid] == target){
            return new int[] {rStart , cMid};
        }
        if (array[rEnd][cMid] == target){
            return new int[] {rEnd , cMid};
        }
        if (target <= array[rStart][cMid-1]){
            return binarySearch(array , rStart , 0 , cMid-1 , target);
        }
        else if(target >= array[rStart][cMid+1] && target <= array[rStart][totalCols-1]){
            return binarySearch(array , rStart , cMid+1 , totalCols-1 , target);
        }
        else if(target < array[rEnd][cMid-1]){
            return binarySearch(array , rEnd , 0 , cMid-1 , target);
        }
        else {
            return binarySearch(array , rEnd , cMid+1 , totalCols-1 , target);
        }
    }
}
