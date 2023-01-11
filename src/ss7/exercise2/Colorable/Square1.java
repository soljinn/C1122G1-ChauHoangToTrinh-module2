package ss7.exercise2.Colorable;

public class Square1 extends Shape1 implements IColorable {

    private double size = 2;

    public Square1() {
    }

    public Square1(double size) {
        this.size = size;
    }

    public Square1(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getArea() {
        return getSize() * getSize();
    }

    public double getPerimeter() {
        return 4 * getSize();
    }

    @Override
    public String toString() {
        return "Square1{" +
                "size=" + getSize() +
                '}';
    }

    @Override
    public void howToColor() {

    }

}