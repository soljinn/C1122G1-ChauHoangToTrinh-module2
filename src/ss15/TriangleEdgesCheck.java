package ss15;

import java.util.Scanner;

public class TriangleEdgesCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first edge");
        int a = scanner.nextInt();
        System.out.println("Enter the second edge");
        int b = scanner.nextInt();
        System.out.println("Enter the third edge");
        int c = scanner.nextInt();
        try {
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new MyException();
            } else {
                System.out.println("Valid triangle!");
            }
        } catch (MyException e) {
            System.out.println("Error: invalid triangle! ");
        }
    }
}
