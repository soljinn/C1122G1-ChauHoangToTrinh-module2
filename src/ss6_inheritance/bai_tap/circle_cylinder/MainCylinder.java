package ss6_inheritance.bai_tap.circle_cylinder;

import java.util.Scanner;

public class MainCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius: ");
        double radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Color: ");
        String color = scanner.nextLine();
        System.out.println("Height: ");
        double height = Double.parseDouble(scanner.nextLine());
        Cylinder cylinder = new Cylinder(radius, color, height);
        System.out.println(cylinder);
    }
}
