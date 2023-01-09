package ss5_access_modifier.bai_tap.circle;

import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Circle 1: \n" + circle);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius: ");
        double radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Color: ");
        String color = scanner.nextLine();
        Circle circle1 = new Circle(radius, color);
        System.out.println(circle1);
    }
}
