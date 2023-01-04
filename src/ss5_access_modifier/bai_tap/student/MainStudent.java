package ss5_access_modifier.bai_tap.student;

import javax.lang.model.element.Name;

public class MainStudent {
    public static void main(String[] args) {
    Student student = new Student();
        System.out.println("Student 1: \n" + student);
        Student student1 = new Student("Ning", "C08");
        System.out.println("Student 2: \n" + student1);
    }
}
