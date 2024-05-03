package oops;

public class Static {
    public static void main(String[] args) {
        Human obj1 = new Human(22 , "abc" , 10000 , true);
        Human obj2 = new Human(29 , "def" , 10000 , true);
        Human obj3 = new Human(25 , "xyz" , 10000 , true);
        System.out.println(Human.population);

        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }
}

class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message() {
        System.out.println("Hello world");
//        System.out.println(this.age); // cant use this over here
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
class StaticBlock {
    static int a = 4;
    static int b;

    // will only run once, when the first obj is create i.e. when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }
}

