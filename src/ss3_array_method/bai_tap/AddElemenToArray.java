package ss3_array_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElemenToArray {
    public class AddElementToArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input array length: ");
            int n = Integer.parseInt(scanner.nextLine());
            int[] arr = new int[n];
            int[] arr1 = new int[n + 1];
            for (int i = 0; i < n; i++) {
                System.out.println("Input element " + i + ":");
                int index = Integer.parseInt(scanner.nextLine());
                arr[i] = index;
            }
            System.out.println("Enter the element to be add: ");
            int x = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter element position to add: ");
            int index = Integer.parseInt(scanner.nextLine());
            if (index <= -1 || index > n - 1) {
                System.out.println("Cannot insert element into array");
            } else {
                for (int i = 0; i < n + 1; i++) {
                    if (index == i) {
                        arr1[i] = x;
                    } else if (index > i) {
                        arr1[i] = arr[i];
                    } else {
                        arr1[i] = arr[i - 1];
                    }
                }
                System.out.println(Arrays.toString(arr1));
            }
        }
    }

}
