package BitManipulation;

import java.util.Scanner;
// Find the position of right most set bit
public class question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        int mask = num & (-num);
        int counter = 1;
        while(mask > 1){
            counter++;
            mask = mask>>1;
        }
        System.out.println(counter);
    }
}
