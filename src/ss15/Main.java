package ss15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangleEdgesCheck check = new TriangleEdgesCheck();

        try {
            System.out.println("Enter the first edge");
            int a = scanner.nextInt();
            System.out.println("Enter the second edge");
            int b = scanner.nextInt();
            System.out.println("Enter the third edge");
            int c = scanner.nextInt();

            try {
                check.checkTriangleEdges(a,b,c);
            } catch (TriangleEdgesException e) {
                throw new RuntimeException(e);
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
