package recursion;

import java.util.ArrayList;
import java.util.Scanner;
// linear search multiple instances
public class question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("enter the target element: ");
        int target = input.nextInt();
//        search(arr , target , 0);
//        System.out.println(list);
//        ArrayList<Integer> ans = search2(arr , target , 0 , new ArrayList<>());
//        System.out.println(ans);
        System.out.println(search3(arr ,target ,0));
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void search(int[] arr , int target , int i){
        if (i == arr.length){
            return;
        }
        if (arr[i] == target){
            list.add(i);
        }
        search(arr , target , i+1);
    }
    static ArrayList<Integer> search2(int[] arr , int target , int i , ArrayList<Integer> list){
        if (i == arr.length){
            return list;
        }
        if (arr[i] == target){
            list.add(i);
        }
        return search2(arr , target , i+1 , list);
    }
    static ArrayList<Integer> search3(int[] arr , int target , int i){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (i == arr.length){
            return list;
        }
        if (arr[i] == target){
            list.add(i);
        }

        ArrayList<Integer> ansfrombelow = search3(arr , target , i+1);
        list.addAll(ansfrombelow);
        return list;
    }
}
