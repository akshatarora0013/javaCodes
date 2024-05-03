package linaersearch;

import java.util.Scanner;

public class searchstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");

        String str = input.next();
        char target = 'a';
        boolean output = search(str,target);
        System.out.println(output);
    }
    static boolean search(String str, char target){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)== target){
                return true;
            }
        }
        return false;
    }
}
