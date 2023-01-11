package ss7.exercise2.Colorable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape1[] shape1s = new Shape1[3];
        shape1s[0] = new Circle1(5);
        shape1s[1] = new Rectangle1(2, 5);
        shape1s[2] = new Square1(4);

        for (Shape1 shape : shape1s) {
            System.out.println(shape);
            if (shape instanceof Square1) { // instanceof dùng để kiểm tra đối tượng có phải là kiểu dữ liệu cụ thể không.
                ((Square1) shape).howToColor();
            }
        }
    }
}
