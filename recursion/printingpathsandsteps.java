package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class printingpathsandsteps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[][] arr = {
                {true , true , true},
                {true , true , true},
                {true , true , true}
        };
        int[][] path = new int[arr.length][arr[0].length];
        ArrayList<String> result = printingpaths(0 , 0 , "" , arr , path , 1);
        System.out.println(result);
    }
    static ArrayList<String> printingpaths(int row , int col , String result , boolean[][] arr , int[][] path , int steps){
        ArrayList<String> list = new ArrayList<>();
        if (row == arr.length-1 && col == arr[0].length-1){
            list.add(result);
            path[row][col] = steps;
            for(int[] array : path){
                System.out.println(Arrays.toString(array));
            }
            System.out.println();
            return list;
        }
        if (!arr[row][col]){
            return list;
        }
        arr[row][col] = false;
        path[row][col] = steps;
        if (row < arr.length-1){
            ArrayList<String> ans = printingpaths(row+1 , col , result+"D" , arr , path , steps+1);
            list.addAll(ans);
        }
        if (col < arr[0].length-1){
            ArrayList<String> ans = printingpaths(row , col+1 , result+"R" , arr, path , steps+1);
            list.addAll(ans);
        }
        if (row > 0){
            ArrayList<String> ans = printingpaths(row-1 , col , result+"U" , arr, path , steps+1);
            list.addAll(ans);
        }
        if (col > 0){
            ArrayList<String> ans = printingpaths(row , col-1 , result+"L" , arr , path , steps+1);
            list.addAll(ans);
        }
        arr[row][col] = true;
        path[row][col] = 0;
        return list;
    }
}
