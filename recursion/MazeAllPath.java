package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
// backtracking example
public class MazeAllPath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[][] arr = {
                {true , true , true},
                {true , true , true},
                {true , true , true}
        };
        ArrayList<String> result = printingpaths(0 , 0 , "" , arr);
        System.out.println(result.size());
        System.out.println(result);
        Arrays.toString(arr);
    }
    static ArrayList<String> printingpaths(int row , int col , String result , boolean[][] arr){
        ArrayList<String> list = new ArrayList<>();
        if (row == arr.length-1 && col == arr[0].length-1){
            list.add(result);
            return list;
        }
        if (!arr[row][col]){
            return list;
        }
        arr[row][col] = false;
        if (row < arr.length-1){
            ArrayList<String> ans = printingpaths(row+1 , col , result+"D" , arr);
            list.addAll(ans);
        }
        if (col < arr[0].length-1){
            ArrayList<String> ans = printingpaths(row , col+1 , result+"R" , arr);
            list.addAll(ans);
        }
        if (row > 0){
            ArrayList<String> ans = printingpaths(row-1 , col , result+"U" , arr);
            list.addAll(ans);
        }
        if (col > 0){
            ArrayList<String> ans = printingpaths(row , col-1 , result+"L" , arr);
            list.addAll(ans);
        }
        arr[row][col] = true;
        return list;
    }
}
