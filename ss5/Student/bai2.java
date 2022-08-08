package ss5.Student;

import ss5.Student.Student;

public class bai2 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setClassed("A12");
        student.setNames("Văn A");

        System.out.println(student.getClassed() + "\n" + student.getNames());
        System.out.println(student);

    }
}
