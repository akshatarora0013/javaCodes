package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String result = "";
//        permutation1(str , result);
        ArrayList<String> ans = permutation2(str , result);
        System.out.println(ans);
        int count = permutationcount(str , result);
        System.out.println(count);
    }
    static void permutation1(String str , String result){
        if (str.isEmpty()){
            System.out.println(result);
            return;
        }
        char ch = str.charAt(0);
        for (int i = 0; i <= result.length(); i++) {
            String first = result.substring(0 , i);
            String second = result.substring(i , result.length());
            permutation1(str.substring(1) , first+ch+second);
        }
    }
    static ArrayList<String> permutation2(String str , String result){
        ArrayList<String> list = new ArrayList<>();
        if (str.isEmpty()){
            list.add(result);
            return list;
        }
        char ch = str.charAt(0);
        for (int i = 0; i <= result.length(); i++) {
            String first = result.substring(0 , i);
            String second = result.substring(i , result.length());
            ArrayList<String> ans = permutation2(str.substring(1) , first+ch+second);
            list.addAll(ans);
        }
        return list;
    }
    static int permutationcount(String str , String result){
        int count = 0;
        if (str.isEmpty()){
            return 1;
        }
        char ch = str.charAt(0);
        for (int i = 0; i <= result.length(); i++) {
            String first = result.substring(0 , i);
            String second = result.substring(i , result.length());
            count = count + permutationcount(str.substring(1) , first+ch+second);
        }
        return count;
    }
}
