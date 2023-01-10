package ss6_inheritance.bai_tap.point2d_point3d;

import java.util.Scanner;

public class MainPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        Scanner scanner = new Scanner(System.in);
        System.out.println("x= ");
        float x = scanner.nextFloat();
        System.out.println("y= ");
        float y = scanner.nextFloat();
        Point2D point2D1 = new Point2D(x, y);
        System.out.println(point2D1);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("x= ");
        float x2 = scanner2.nextFloat();
        System.out.println("y= ");
        float y2 = scanner2.nextFloat();
        Point2D point2D2 = new Point2D();
        point2D2.setX(x2);
        point2D2.setY(y2);
        System.out.println(point2D2);
    }
}
