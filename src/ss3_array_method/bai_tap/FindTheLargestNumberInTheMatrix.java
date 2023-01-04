package ss3_array_method.bai_tap;

import java.util.Scanner;

public class FindTheLargestNumberInTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input row");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Input col");
        int col = Integer.parseInt(scanner.nextLine());
        int arr2D [] []= new int[row][col];
        for (int i = 0; i<row; i++){
            for (int j = 0; j< col; j++){
                System.out.println("Input element " +"["+ i+"]"+"["+j+"]");
                arr2D [i][j] = Integer.parseInt(scanner.nextLine());;
            }
        }
        int max = arr2D [0][0];
        for (int i = 0 ; i< row; i++){
            for (int j=0; j<col; j++){
                if (arr2D[i][j]>max)
                    max = arr2D[i][j];
            }
        }
        System.out.println("The largest element is " + max);
    }
}
