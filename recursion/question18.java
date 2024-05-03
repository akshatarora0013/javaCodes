package recursion;

import java.util.ArrayList;
import java.util.Scanner;
// dice combination problem
public class question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = "";
        int target = input.nextInt();
        dice(result , target);
        ArrayList<String> ans = dice2(result , target);
        System.out.println(ans);
    }
    static void dice(String str , int target){
        if (target == 0){
            System.out.println(str);
            return;
        }
        for (int i = 1; i <= 6 && i<=target; i++) {
            dice(str + i , target-i);
        }
    }
    static ArrayList<String> dice2(String str , int target){
        ArrayList<String> list = new ArrayList<>();
        if (target == 0){
            list.add(str);
            return list;
        }
        for (int i = 1; i <= 6 && i<=target; i++) {
            ArrayList<String> ans = dice2(str + i , target-i);
            list.addAll(ans);
        }
        return list;
    }
}
