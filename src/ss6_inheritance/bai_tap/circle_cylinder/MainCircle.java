package ss6_inheritance.bai_tap.circle_cylinder;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(5.0, "pink");
        System.out.println(circle1);
//        Cylinder cylinder = new Cylinder(5, circle1.getArea());
//        System.out.print(cylinder.toString());
    }
}
