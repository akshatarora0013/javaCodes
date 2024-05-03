package recursion;

import java.util.Scanner;

public class N_Knights {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean[][] board = new boolean[n][n];
        System.out.println(knight(board , 0 , 0 , n));
    }
    static int knight(boolean[][] board , int row , int col , int total){
        if (total == 0){
            display(board);
            return 1;
        }
        int count = 0;
        if (row == board.length-1 && col == board.length){
            return count;
        }
        if (col == board.length){
            count = count + knight(board , row+1 , 0 , total);
            return count;
        }
        if (issafe(board, row , col)){
            board[row][col] = true;
            count = count + knight(board , row , col+1 , total-1);
            board[row][col] = false;
        }
        count = count + knight(board , row , col+1 , total);
        return count;
    }
    static void display(boolean[][] board){
        for (boolean[] row : board){
            for (boolean element : row){
                if (element){
                    System.out.print("K ");
                }
                else{
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static boolean issafe(boolean[][] board , int row , int col){
        if (isvalid(board , row-1 , col-2)){
            if (board[row-1][col-2]){
                return false;
            }
        }
        if (isvalid(board , row-1 , col+2)){
            if (board[row-1][col+2]){
                return false;
            }
        }
        if (isvalid(board , row-2 , col-1)){
            if (board[row-2][col-1]){
                return false;
            }
        }
        if (isvalid(board , row-2 , col+1)){
            if (board[row-2][col+1]){
                return false;
            }
        }
        return true;
    }
    static boolean isvalid(boolean[][] board , int row , int col){
        if (row >= 0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }
        return false;
    }
}
