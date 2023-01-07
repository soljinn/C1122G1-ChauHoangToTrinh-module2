package ss7.exercise1.Model;

public class Rectangle extends Shape{
    private double with = 1.0;
    private double height = 1.0;

    public Rectangle() {
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public Rectangle(String color, boolean filled, double with, double height) {
        super(color, filled);
        this.with = with;
        this.height = height;
    }

    public double getWith() {
        return with;
    }

    public void setWith(double with) {
        this.with = with;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color="+getColor()+
                "filled="+isFilled()+
                "with=" + with +
                ", height=" + height +
                '}';
    }

    @Override
    public void resize(double percent) {
        setWith(getWith()+getWith()*percent/100);
        setHeight(getHeight()+getHeight()*percent/100);
    }
}
