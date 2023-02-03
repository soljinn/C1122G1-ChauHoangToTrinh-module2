package ss15;
import java.util.Scanner;

public class  TriangleEdgesCheck {
    public static void TriangleEdges() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the first edge");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the second edge");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the third edge");
            int c = Integer.parseInt(scanner.nextLine());
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new MyException();
            } else {
                System.out.println("Valid triangle!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Input edges unvalid!");
        }
        catch (MyException e) {
            System.out.println("Error: Unvalid triangle!");
        } finally {
            System.out.println("End program");
        }
    }
    public static void main(String[] args) {
        TriangleEdges();
    }
}

