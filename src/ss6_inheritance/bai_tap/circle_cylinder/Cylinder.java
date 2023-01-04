package ss6_inheritance.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
//    private double height = 1;
//    private double areaDay;
//
//    public Cylinder(double v) {
//    }
//
//    public Cylinder(double height, double areaDay) {
//        this.height = height;
//        this.areaDay = areaDay;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }
//
//
//    public double getVolume(){
//        return this.areaDay*getHeight();
//    }
//
//    @Override
//    public String toString() {
//        return "Cylinder{" +
//                "height=" + getHeight() +
//                "dien tich day=" + super.getArea() +
//                ", volume= " + getVolume()+
//                '}';
//    }
    private double height =1;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea()*getHeight();
    }
    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getHeight() +
                ", area= " + getArea() +
                ", volume= " + getVolume() +
                '}';
    }
}
