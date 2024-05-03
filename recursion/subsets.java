package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class subsets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String result = "";
        subset(str , result);
        ArrayList<String> ans = subset2(str , result);
        System.out.println(ans);
    }
    static void subset(String str , String result){
        if (str.isEmpty()){
            System.out.println(result);
            return;
        }
        subset(str.substring(1) , result);
        subset(str.substring(1) , result + str.charAt(0));
    }
    static ArrayList<String> subset2(String str , String result){
        ArrayList<String> list = new ArrayList<>();
        if (str.isEmpty()){
            list.add(result);
            return list;
        }
        ArrayList<String> ans1 = subset2(str.substring(1) , result);
        ArrayList<String> ans2 = subset2(str.substring(1) , result + str.charAt(0));

        list.addAll(ans1);
        list.addAll(ans2);
        return list;
    }
}
