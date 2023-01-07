package ss7.exercise1.Model;

public class Square extends Shape{
    private double side = 1.0;

    public Square() {
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return side * side;
    }
    public double getPerimeter(){
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color="+getColor()+
                "filled"+isFilled()+
                "side=" + side +
                '}';
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() + getSide() * percent/100);
    }
}
