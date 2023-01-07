package ss7.exercise2.Colorable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape [] squares = new Square[3];
        squares[0] = new Square("blue",true,5);
        squares[1] = new Square("green",false,6);
        squares[2] = new Square("yellow",true,7);
        System.out.println(Arrays.toString(squares));
        System.out.println("Có phải colorable hay không");
        squares[0].howToColor();
        squares[1].howToColor();
        squares[2].howToColor();
    }
}
