package oops.Comparision;



public class Student implements Comparable<Student> {
    int rollno;
    int marks;

    Student(int rollno, int marks){
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int) (this.marks - o.marks);
        return diff;
    }
}
