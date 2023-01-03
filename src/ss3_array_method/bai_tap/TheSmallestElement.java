package ss3;

import java.util.Scanner;

public class TheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Size array ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input element " + i + ":");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The smallest element " + min);
    }
}
