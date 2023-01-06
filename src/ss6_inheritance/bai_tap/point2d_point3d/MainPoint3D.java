package ss6_inheritance.bai_tap.point2d_point3d;

import java.util.Scanner;

public class MainPoint3D {
    public static void main(String[] args) {

        Point3D point3D = new Point3D();

        Scanner scanner = new Scanner(System.in);
        System.out.println("x= ");
        float x = scanner.nextFloat();
        System.out.println("y= ");
        float y = scanner.nextFloat();
        System.out.println("z= ");
        float z = scanner.nextFloat();
        Point3D point3D1 = new Point3D(x, y, z);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("x2= ");
        float x2 = scanner2.nextFloat();
        System.out.println("y2= ");
        float y2 = scanner2.nextFloat();
        System.out.println("z2= ");
        float z2 = scanner2.nextFloat();
        Point3D point3D2 = new Point3D();
        point3D2.setX(x2);
        point3D2.setY(y2);
        point3D2.setZ(z2);

        System.out.println(point3D);
        System.out.println(point3D1);
        System.out.println(point3D2);
    }
}
