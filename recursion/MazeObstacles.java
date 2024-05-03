package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazeObstacles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[][] arr = {
                {true , true , true},
                {true , false , true},
                {true , true , true}
        };
        System.out.println(Maze(0 , 0 , "" , arr));
    }
    static ArrayList<String> Maze(int row , int col , String result , boolean[][] arr){
        ArrayList<String> list = new ArrayList<>();
        if (row == arr.length-1 && col == arr[0].length-1){
            list.add(result);
            return list;
        }
        if (!arr[row][col]){
            return list;
        }
        if (row < arr.length-1){
            ArrayList<String> ans = Maze(row+1 , col , result+"D" , arr);
            list.addAll(ans);
        }
        if (col < arr[0].length-1){
            ArrayList<String> ans = Maze(row , col+1 , result+"R" , arr);
            list.addAll(ans);
        }
        return list;
    }
}
