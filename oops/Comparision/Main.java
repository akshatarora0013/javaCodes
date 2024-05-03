package oops.Comparision;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(001 , 86);
        Student student2 = new Student(034 , 99);

        if (student1.compareTo(student2) < 0){
            System.out.println("Student2 has more marks");
        }
        else{
            System.out.println("Student1 has more marks");
        }
    }
}
