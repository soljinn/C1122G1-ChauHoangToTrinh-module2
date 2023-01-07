package ss7.exercise1.Model;

public class Cricle extends Shape{
    private double radius = 1.0;

    public Cricle() {
    }

    public Cricle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "color="+getColor()+
                "filled="+isFilled()+
                "radius=" + radius +
                '}';
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius()+getRadius()*percent/100);
    }
}
