package arrays;

public class max {
    public static void main(String[] args) {
        int[] arr ={1, 3 ,32 ,56 ,23};
        System.out.println(max(arr));
    }
    static int max(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
