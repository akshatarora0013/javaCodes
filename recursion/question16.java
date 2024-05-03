package recursion;

import java.util.Scanner;
//skip a complete string suppose skip "abcde"
public class question16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String result = skipabcde(str);
        System.out.println(result);
    }
    static String skipabcde(String str){
        if (str.isEmpty()){
            return "";
        }
        if (str.startsWith("abcde")){
            return skipabcde(str.substring(5));
        }
        else{
            return str.charAt(0) + skipabcde(str.substring(1));
        }
    }
}
