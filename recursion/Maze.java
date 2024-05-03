package recursion;

import java.util.ArrayList;
import java.util.Scanner;
// we can only go down or right
public class Maze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(countPath(3 , 3));
        String result1 = "";
        printingPaths(3 , 3 ,result1);
        String result2 = "";
        ArrayList<String> list = printingPathsdiagonal(3 , 3 ,result2);
        System.out.println(list);
    }
    static int countPath(int row , int col){
        if (row == 1 || col == 1){
            return 1;
        }
        return countPath(row-1 ,col) + countPath(row , col-1);
    }
    static void printingPaths(int row , int col , String result){
        if (row == 1){
            for (int i = col; i >1; i--) {
                result = result + "R";
            }
            System.out.println(result);
            return;
        }
        if (col == 1){
            for (int i = row; i >1; i--) {
                result = result + "D";
            }
            System.out.println(result);
            return;
        }
        printingPaths(row-1 , col , result+"D");
        printingPaths(row , col-1 , result+"R");
    }
    static ArrayList<String> printingPaths2(int row , int col , String result){
        ArrayList<String> list = new ArrayList<>();
        if (row == 1 && col == 1){
            list.add(result);
            return list;
        }
        if (row > 1){
            ArrayList<String> ans = printingPaths2(row-1 , col , result+"D");
            list.addAll(ans);
        }
        if (col > 1){
            ArrayList<String> ans = printingPaths2(row , col-1 , result+"R");
            list.addAll(ans);
        }
        return list;
    }
    //we can also go diagonally in this
    static ArrayList<String> printingPathsdiagonal(int row , int col , String result){
        ArrayList<String> list = new ArrayList<>();
        if (row == 1 && col == 1){
            list.add(result);
            return list;
        }
        if (row > 1 && col > 1){
            ArrayList<String> ans = printingPathsdiagonal(row-1 , col-1 , result+"d");
            list.addAll(ans);
        }
        if (row > 1){
            ArrayList<String> ans = printingPathsdiagonal(row-1 , col , result+"D");
            list.addAll(ans);
        }
        if (col > 1){
            ArrayList<String> ans = printingPathsdiagonal(row , col-1 , result+"R");
            list.addAll(ans);
        }
        return list;
    }
}
