package ss7.exercise2.Colorable;

public class Square extends Shape{
    private double edge;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea(){
        return Math.pow(this.edge,2);
    }

    public void howToColor() {
        if (super.isFilled() == true) {
            System.out.println("Color all four sides.." + " color= " + super.getColor());
        } else {
            System.out.println("No fill color...");
        }
    }
    @Override
    public String toString() {
        return "Square{" +
                " edge=" + edge +
                ", area=" +getArea()+
                '}';
    }
}
