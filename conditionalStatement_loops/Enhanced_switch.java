package conditionalStatement_loops;

import java.util.Scanner;

public class Enhanced_switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter roll no: ");
        int roll_no = input.nextInt();
        switch (roll_no) {
            case 101 -> System.out.println("abc");
            case 102 -> System.out.println("xyz");
            case 103 -> System.out.println("def");
            default -> System.out.println("Enter valid roll no ");
        }
    }
}
