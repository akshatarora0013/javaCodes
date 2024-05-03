package recursion;

import java.util.Scanner;
// skip a character
public class question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String orignal = input.next();
        String output = "";
        skip(output , orignal);
        String result = skip2(orignal);
        System.out.println(result);
    }
    static void skip(String output , String orignal){
        if (orignal.isEmpty()){
            System.out.println(output);
            return;
        }
        char ch = orignal.charAt(0);
        if (ch == 'a'){
            skip(output , orignal.substring(1));
        }
        else {
            skip(output+ch , orignal.substring(1));
        }
    }
    static String skip2(String orignal){
        if (orignal.isEmpty()){
            return "";
        }
        char ch = orignal.charAt(0);
        if (ch == 'a'){
            return skip2(orignal.substring(1));
        }
        else {
            return ch + skip2(orignal.substring(1));
        }
    }
}
