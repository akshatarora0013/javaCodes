package linaersearch;

public class maxwealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {3,4,5},
                {3,2,4}
        };
        int output = max(arr);
        System.out.println(output);
    }
    static int max(int[][] array){
        int maximum = Integer.MIN_VALUE;
        for (int row = 0; row < array.length; row++) {
            int result = 0;
            for (int col = 0; col < array[row].length; col++) {
                result = result + array[row][col];
            }
            if (result>maximum){
                maximum = result;
            }
        }
        return maximum;
    }
}
