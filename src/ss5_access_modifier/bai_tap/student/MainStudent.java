package ss5_access_modifier.bai_tap.student;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Student 1: \n" + student);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input Classes: ");
        String classes = scanner.nextLine();
        Student student1 = new Student(name, classes);
        System.out.println("Student 2: \n" + student1);
    }
}
