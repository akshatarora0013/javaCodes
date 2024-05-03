package Basics;

public class prime {
    public static void main(String[] args) {
        int num = 7;
        boolean check = false;
        for (int i = 2; i < num ; i++) {
            if(num%i == 0){
                check = true;
            }
        }
        if (check==true){
            System.out.println("Number is not prime");
        }
        else {
            System.out.println("number is prime");
        }
    }
}
