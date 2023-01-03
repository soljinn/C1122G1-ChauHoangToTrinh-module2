package ss2_loop.bai_tap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DisplayMenuGeometry {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            int i = 0;
            int j = 0;
            int z = 0;
            switch (choice) {
                case 1:
                    for (i = 0; i < 3; i++) {
                        for (j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("Botton-left:");
                    for (i = 0; i < 5; i++) {
                        for (j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("");
                    System.out.println("Top-left:");
                    for (i = 5; i > 0; i--) {
                        for (j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("");
                    System.out.println("Top-right:");
                    for (i = 0; i < 5; i++) {
                        for (j = 1; j <= i; j++) {
                            System.out.print(" ");
                        }
                        for (z = 4; z >= i; z--) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("");
                    System.out.println("Botton-right:");
                    for (i = 5; i > 0; i--) {
                        for (j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (z = 5; z >= i; z--) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for (i = 0; i < 5; i++) {
                        for (j = 0; j < 5 + i; j++) {
                            if (j < 5 - i - 1) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Nhập lại ");
            }
        }
    }
}
