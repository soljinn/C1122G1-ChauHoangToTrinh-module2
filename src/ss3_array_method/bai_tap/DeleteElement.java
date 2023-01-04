package ss3_array_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array length: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input element " + i + ":");
            int index = Integer.parseInt(scanner.nextLine());
            arr[i] = index;
        }
        System.out.println("Enter the element to be deleted: ");
        int x = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                System.out.println("position of element " + x + ":" + i);
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[n - 1] = 0;
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
