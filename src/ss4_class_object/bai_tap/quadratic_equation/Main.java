package ss4.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input A");
        double a = scanner.nextDouble();
        System.out.println("Input B");
        double b = scanner.nextDouble();
        System.out.println("Input C");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Equation with first solution: " + quadraticEquation.getRoot1());
            System.out.println("Equation with second solution: " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("equation with double solution: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no solution");
        }
    }
}
