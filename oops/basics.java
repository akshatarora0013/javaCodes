package oops;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student student1;
        student1 = new Student(15 , "abc " , 89.5f);

        System.out.println(student1.rollno);
        System.out.println(student1.name);
        System.out.println(student1.marks);
        System.out.println();
//        System.out.println(student1);

        Student student2 = new Student(student1);
        System.out.println(student2.rollno);
        System.out.println(student2.name);
        System.out.println(student2.marks);
        System.out.println();

        Student student3 = new Student();
        System.out.println(student3.rollno);
        System.out.println(student3.name);
        System.out.println(student3.marks);
        System.out.println();



//        demo obj;
//        for (int i = 0; i < 1000000000; i++) {
//            obj = new demo("new object");
//        }
    }
}
class Student{
    int rollno;
    String name;
    float marks = 90;

    Student (Student abc){
        this.rollno = abc.rollno;
        this.name = abc.name;
        this.marks = abc.marks;
    }
    Student (){
        // calling constructor into a constructor using this keyword
        this (13 , "default" , 100.0f);
    }

    Student (int rollno , String name , float marks){
        this.marks = marks;
        this.name = name;
        this.rollno = rollno;
    }
}

class demo{
    int a;
    String name;
    demo(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}