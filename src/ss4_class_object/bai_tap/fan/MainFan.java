package ss4_class_object.bai_tap.fan;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.getFast());
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor(" Yellow");
        System.out.println(fan1.toString());
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.getMedium());
        fan2.setOn(false);
        fan2.setRadius(fan2.getRadius());
        fan2.setColor(" " + fan2.getColor());
        System.out.println(fan2.toString());
    }
}
