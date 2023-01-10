package ss6_inheritance.bai_tap.point_moveablepoint;

import java.util.Arrays;

public class MainPointMoveablePoint {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(1, 2);

        System.out.println("Change the value of x and y: ");
        point.setXY(3, 4);
        System.out.println(Arrays.toString(point.getXY()));

        MoveablePoint moveablePoint = new MoveablePoint();

        moveablePoint = new MoveablePoint(11, 12);
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(5, 6, 7, 8);
        System.out.println(moveablePoint);

        System.out.println("Change the value of x and y: ");
        moveablePoint.setXY(9, 10);
        System.out.println(moveablePoint);

        moveablePoint.move();
        System.out.println(moveablePoint);

    }
}
