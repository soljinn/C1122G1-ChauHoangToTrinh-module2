package ss2_loop.bai_tap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DisplayMenuGeometry {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        do {
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
                    Scanner scanner1 = new Scanner(System.in);
                    int n = scanner1 . nextInt();
                    System.out.println("Nhập chiều cao của hình " );
                    for (i = 0; i < 3; i++) {
                        for (j = 0; j < n; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    Scanner scanner2 = new Scanner(System.in);
                    int m = scanner2 . nextInt();
                    System.out.println("Nhập chiều cao của hình " );
                    System.out.println("Botton-left:");
                    for (i = 0; i < m; i++) {
                        for (j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("");

                    Scanner scanner3 = new Scanner(System.in);
                    int a = scanner3 . nextInt();
                    System.out.println("Nhập chiều cao của hình " );
                    System.out.println("Top-left:");
                    for (i = a; i > 0; i--) {
                        for (j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("");

                    Scanner scanner4 = new Scanner(System.in);
                    int b = scanner4 . nextInt();
                    System.out.println("Nhập chiều cao của hình " );
                    System.out.println("Top-right:");
                    for (i = 0; i < b; i++) {
                        for (j = 1; j <= i; j++) {
                            System.out.print(" ");
                        }
                        for (z = b-1; z >= i; z--) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("");

                    Scanner scanner5 = new Scanner(System.in);
                    int c = scanner5 . nextInt();
                    System.out.println("Nhập chiều cao của hình " );
                    System.out.println("Botton-right:");
                    for (i = c; i > 0; i--) {
                        for (j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (z = c; z >= i; z--) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    Scanner scanner6 = new Scanner(System.in);
                    int e = scanner6 . nextInt();
                    System.out.println("Nhập chiều cao của hình " );
                    for (i = 0; i < e; i++) {
                        for (j = 0; j < e + i; j++) {
                            if (j < e - i - 1) {
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
        while (choice != 4);
    }
}
