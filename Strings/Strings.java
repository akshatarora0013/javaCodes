package Strings;

public class Strings {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        System.out.println(a == b);  //gives true as both a and b are pointing to same object and values are also same

        String x = new String("xyz");
        String y = new String("xyz");
        System.out.println(x == y);   //gives false though the values are same but they are pointing to different object
        System.out.println(x.equals(y));   //gives true as .equals only checks the value


    }
}
