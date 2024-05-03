package recursion;

import java.util.Scanner;

public class N_Queens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board , 0));
    }
    static int queens(boolean[][] board , int row){
        if (row == board.length){
            display(board);
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (issafe(board , row , col)){
                board[row][col] = true;
                count += queens(board , row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }
    static void display(boolean[][] board){
        for (boolean[] row : board){
            for (boolean element : row){
                if (element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static boolean issafe(boolean[][] board , int row , int col){
        //for checking vertical up
        for (int i = 0; i < row; i++) {
            if (board[i][col]){
                return false;
            }
        }
        //for diagonal left
        int maxleft = Math.min(row , col);
        for (int i = 1; i <= maxleft; i++) {
            if (board[row-i][col-i]){
                return false;
            }
        }
        //for checking diagonal right;
        int maxright = Math.min(row , board.length-col-1);
        for (int i = 1; i <= maxright; i++) {
            if (board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
}
