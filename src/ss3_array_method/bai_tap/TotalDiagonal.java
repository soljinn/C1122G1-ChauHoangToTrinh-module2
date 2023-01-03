package ss3;

import java.util.Scanner;

public class TotalDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input row = col: ");
        int row = Integer.parseInt(scanner.nextLine());
        int arr2D [] []= new int[row][row];
        for (int i = 0; i<row; i++){
            for (int j = 0; j< row; j++){
                System.out.println("Input element " +"["+ i+"]"+"["+j+"]");
                arr2D [i][j] = Integer.parseInt(scanner.nextLine());;
            }
        }
        int result = 0;
        for (int i = 0; i< arr2D.length; i++){
            result += arr2D[i][i];
        }
        System.out.println("Total diagonal " + result);
    }
}
