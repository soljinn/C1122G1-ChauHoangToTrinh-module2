package ss7.exercise1.Controller;

import ss7.exercise1.Model.Cricle;
import ss7.exercise1.Model.Rectangle;
import ss7.exercise1.Model.Shape;
import ss7.exercise1.Model.Square;

public class ResizeableController {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Cricle("red",true,6.0);
        shapes[1] = new Rectangle("blue",false,5.0,7.0);
        shapes[2] = new Square("yellow",true,9.0);

        double percent = Math.random() * 100;
        System.out.println("Before the change: ");
        for (Shape shape:shapes) {
            System.out.println(shape);
            System.out.printf("Area: ",shape.getArea()+"\n");
            System.out.printf("Perimeter: ",shape.getPerimeter()+"\n");
        }
        System.out.println("Percent: " + percent +"%\n");
        System.out.println("After resizing: ");
        for (Shape shape:shapes) {
            shape.resize(percent);

            System.out.println(shape);
            System.out.printf("Area: ", shape.getArea() + "\n");
            System.out.printf("Perimeter: ", shape.getPerimeter() + "\n");
        }
    }
}
