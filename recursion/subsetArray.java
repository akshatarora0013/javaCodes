package recursion;

import java.util.ArrayList;

public class subsetArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> list = subsets(0, arr, 0);
        System.out.println(list);
    }

    private static ArrayList<Integer> subsets(int index, int[] arr, int result){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            list.add(result);
            return list;
        }
        ArrayList<Integer> ansFromBelow1 = subsets(index+1, arr, (result*10)+arr[index]);
        ArrayList<Integer> ansFromBelow2 = subsets(index+1, arr, result);
        list.addAll(ansFromBelow1);
        list.addAll(ansFromBelow2);
        return list;
    }
}
