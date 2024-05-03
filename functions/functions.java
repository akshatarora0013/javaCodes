package functions;

import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        String Greet = Greeting(name);
        System.out.println(Greet);
    }
    static String Greeting(String name){
        String message = "Hello " + name;
        return message;
    }
}
