package conditionalStatement_loops;

import java.util.Scanner;

public class switch_cases {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter roll no: ");
        int roll_no = input.nextInt();
        switch (roll_no){
            case 101:
                System.out.println("abc");
                break;
            case 102:
                System.out.println("xyz");
                break;
            case 103:
                System.out.println("def");
                break;
            default:
                System.out.println("Enter valid roll no ");
        }
    }
}
