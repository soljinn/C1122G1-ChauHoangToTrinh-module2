package ss14;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionInsert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("element[" + i + "]");
            array[i] = scanner.nextInt();
        }
        System.out.println("The list just entered is: " + Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            int valueToInsert = array[i];
            int pos = i;
            for (; pos > 0 && array[pos - 1] > valueToInsert; pos--) {
                array[pos] = array[pos - 1];
                System.out.println(Arrays.toString(array));
            }
            array[pos] = valueToInsert;
        }
        System.out.println(Arrays.toString(array));
    }
}
