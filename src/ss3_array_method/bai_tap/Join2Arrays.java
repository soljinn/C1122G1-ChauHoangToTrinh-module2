package ss3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Join2Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array1 length: ");
        int length1 = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[length1];
        System.out.println("Input array2 length: ");
        int length2 = Integer.parseInt(scanner.nextLine());
        int[] arr2 = new int[length2];
        int[] arr = new int[length1 + length2];
        for (int i = 0; i < length1; i++) {
            System.out.println("Input array 1 element " + i + ":");
            int index = Integer.parseInt(scanner.nextLine());
            arr1[i] = index;
            arr[i] = arr1[i];
        }
        for (int i = 0; i < length2; i++) {
            System.out.println("Input array 2 element " + i + ":");
            int index = Integer.parseInt(scanner.nextLine());
            arr2[i] = index;
            arr[i + length1] = arr2[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
