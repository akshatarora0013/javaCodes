package conditionalStatement_loops;

import java.util.Scanner;
//String is palindrome or not
public class problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.next();
        String new_str = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.trim().charAt(i);
            new_str = ch + new_str;
        }
        System.out.println(new_str);
        if (str.equals(new_str)){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
}
