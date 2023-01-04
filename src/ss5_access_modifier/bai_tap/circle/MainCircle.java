package ss5_access_modifier.bai_tap.circle;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Circle 1: \n" + circle);
        Circle circle1 = new Circle(5.0, "purple");
        System.out.println("Circle 1: \n" + circle1);
    }
}
