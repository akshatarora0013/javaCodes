package recursion;

import java.util.ArrayList;
import java.util.Scanner;
// phone pad problem
public class question17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "23";
        String result = "";
        phoneNumber(str , result);
        ArrayList<String> list = phoneNumber2(str , result);
        System.out.println(list);
        int count = phoneNumbercount(str , result);
        System.out.println(count);
    }
    static void phoneNumber(String str , String result){
        if (str.isEmpty()){
            System.out.println(result);
            return;
        }
        int digit = str.charAt(0) - '0';
        for (int i = (digit-2)*3; i < (digit-1)*3; i++) {
            char ch = (char) ('a' + i);
            phoneNumber(str.substring(1) , result + ch);
        }
    }
    static ArrayList<String> phoneNumber2(String str , String result){
        ArrayList<String> list = new ArrayList<>();
        if (str.isEmpty()){
            list.add(result);
            return list;
        }
        int digit = str.charAt(0) - '0';
        for (int i = (digit-2)*3; i < (digit-1)*3; i++) {
            char ch = (char) ('a' + i);
            ArrayList<String> ans = phoneNumber2(str.substring(1) , result + ch);
            list.addAll(ans);
        }
        return list;
    }
    static int phoneNumbercount(String str , String result){
        if (str.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = str.charAt(0) - '0';
        for (int i = (digit-2)*3; i < (digit-1)*3; i++) {
            char ch = (char) ('a' + i);
            count = count + phoneNumbercount(str.substring(1) , result + ch);
        }
        return count;
    }
}
