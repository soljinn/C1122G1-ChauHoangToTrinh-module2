package ss3;

import java.util.Scanner;

public class TotalCol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input row");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Input col");
        int col = Integer.parseInt(scanner.nextLine());
        int arr2D[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Input element " + "[" + i + "]" + "[" + j + "]");
                arr2D[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Enter row element position ");
        int result = 0;
        int colFind = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arr2D.length; i++) {
            result += arr2D[i][colFind];
        }
        System.out.println("Total " + colFind + " is " + result);
    }
}
