package recursion;

import java.util.Scanner;

public class sudoko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] board = new int[][]{
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (issolved(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }
    }
    static boolean issafe(int[][] board , int row , int col , int num){
        //check for row and col
        for (int i = 0; i < board.length; i++) {
            if(board[i][col] == num){
                return false;
            }
            if (board[row][i] == num){
                return false;
            }
        }
        //check for the individual 3x3 matrix
        int box_start = row - (row%3);
        int box_end = col - (col%3);
        for (int i = box_start; i < box_start+3; i++) {
            for (int j = box_end; j < box_end+3; j++) {
                if (board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean issolved(int[][] board){
        boolean issolved = true;
        int row = -1;
        int col = -1;
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0){
                    row = i;
                    col = j;
                    issolved = false;
                    break;
                }
            }
            if (!issolved){
                break;
            }
        }
        if (issolved){
            return true;
        }

        for (int i = 1; i <= 9; i++) {
            if (issafe(board , row , col , i)){
                board[row][col] = i;
                if (issolved(board)){
                    return true;
                }
                else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }
    static void display(int[][] board){
        for (int[] arr : board){
            for (int element : arr){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
